package com.varxyz.wgt.map.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.wgt.map.domain.Map;
import com.varxyz.wgt.map.service.MapService;
import com.varxyz.wgt.map.service.MapServiceImpl;
import com.varxyz.wgt.shop.domain.Menu;
import com.varxyz.wgt.shop.domain.Shop;
import com.varxyz.wgt.shop.service.ShopService;
import com.varxyz.wgt.shop.service.ShopServiceImpl;

@Controller("controller.mapController")
public class MapController {
	MapService mapService = new MapServiceImpl();
	ShopService shopService = new ShopServiceImpl();
// ------------------------------------------------------------------
	@GetMapping("/map/root")
	public String rootFomr(Model model, HttpSession session) {
		session.getAttribute("userId");
		model.addAttribute("shop", shopService.findAllShop());
		model.addAttribute("findAll", mapService.findAll());
		return "map/root";
	}

	@PostMapping("/map/root")
	public String root(Shop shop, Model model, HttpSession session, HttpServletRequest request) {
		model.addAttribute("shop", shopService.findAllShop());
		session.setAttribute("shopBns", shop.getBusinessNumber());
		session.setAttribute("shopName", shop.getShopName());
		return "map/position";

	}

	@GetMapping("/map/position")
	public String positionForm(Model model, HttpSession session) {
		model.addAttribute("shopName",session.getAttribute("shopName"));
		model.addAttribute("shopName",session.getAttribute("shopBns"));
		return "map/root";
	}

	@PostMapping("/map/position")
	public String position(Map map, Model model, HttpSession session) {
		Map map2 = new Map();
		map2.setBusinessNumber((String) session.getAttribute("shopBns"));
		map2.setLatitude(map.getLatitude());
		map2.setLongitude(map.getLongitude());
		mapService.insertPosition(map2);
		return "redirect:/map/root";
	}
	// ------------------------------------------------------------------
	@GetMapping("/map/map")
	public String mapForm(Model model, HttpSession session) {
		// ?????? ????????????
		List<Shop> list = shopService.findAllShop();
		model.addAttribute("shopFind", list);

		// ?????? ?????? ????????????
		List<String> bnsList = shopService.findAllBns();
		System.out.println("11: " + bnsList);
		Set<String> set = new HashSet<String>(bnsList);
		List<String> newBnsList = new ArrayList<>(set);
		Collections.sort(newBnsList);
		System.out.println("22: " + newBnsList);
		List<List<Menu>> menuList = new ArrayList<>();
		// List<Map> findShop = new ArrayList<>();
		List<Map> map2 = mapService.findAll();
		for (int i = 0; i < list.size(); i++) {
			menuList.add(shopService.findShopMenuByBnsNum(newBnsList.get(i)));
		}
		model.addAttribute("find", map2);
		model.addAttribute("menuList", menuList);

		// ????????? ??????

		if (session.getAttribute("userId") == null) {
			model.addAttribute("msg", "???????????? ????????? ????????? ?????????.");
			model.addAttribute("url", "../login");
			return "alert/alert";
		}
		
		model.addAttribute("userId", session.getAttribute("userId"));

		/*
		 * ????????? ?????? temp ??? ????????? ??????????????? ???????????? ????????????. 2022-08-11 ?????????(Shop ??????)
		 */

		// ?????? ?????? ??????
		if (session.getAttribute("tempShopImg") != null) {
			for (String img : (List<String>) session.getAttribute("tempImgList")) {
				File menuImg = new File(
						"C:\\wgt\\Where-are-you-going-today\\wgt\\src\\main\\webapp\\resources\\temp\\" + img + ".jpg");
				menuImg.delete();
			}
			session.removeAttribute("tempImgList");

			// ?????? ????????? ??????
			String img = (String) session.getAttribute("tempShopImg");
			File shopImg = new File(
					"C:\\wgt\\Where-are-you-going-today\\wgt\\src\\main\\webapp\\resources\\temp\\" + img + ".jpg");
			shopImg.delete();
			session.removeAttribute("tempShopImg");
			// ?????? ?????? ?????? ????????? ????????????
		}
		// bnsNum session delete
		session.removeAttribute("bnsNum");
		return "map/map";
	}

	@PostMapping("/map/map")
	public String map(Shop shop, Map map, Model model) {
		// ??????????????? ?????? ?????? ????????????
		Shop shopName = new Shop();
		shopName = shopService.findAllbyShopNameObject(shop.getShopName());

		model.addAttribute("shop", shopName);
		model.addAttribute("menus", shopService.findShopMenuByBnsNum(shopName.getBusinessNumber()));

		return "shop/view/viewUserShop";
	}

	@PostMapping("/map/go_get_waiting")
	public String goGetWaiting() {
		return "redirect:/controller/get_waiting";
	}

}
