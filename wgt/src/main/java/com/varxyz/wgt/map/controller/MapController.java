package com.varxyz.wgt.map.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.wgt.map.domain.Map;
import com.varxyz.wgt.map.service.MapService;
import com.varxyz.wgt.map.service.MapServiceImpl;

@Controller("controller.mapController")
public class MapController {
	MapService service = new MapServiceImpl();

	@GetMapping("/map/map")
	public String mapForm(Map map,Model model, HttpSession session) {
		//검색창 검색 내용
		model.addAttribute("name", service.search(map.getName()));
		// 모든 가게조회
		model.addAttribute("find", service.findAll());
		// 아이디 세션
		model.addAttribute("userId", session.getAttribute("userId"));

		/*
		 *  여기로 올때 temp 에 올렸던 이미지들을 자동으로 삭제한다.
		 *  2022-08-11 한태우(Shop 담당)
		 */

		// 가게 메뉴 삭제
		System.out.println(session.getAttribute("tempShopImg"));
		if(session.getAttribute("tempShopImg") != null) {
			for (String img : (List<String>)session.getAttribute("tempImgList")) {
				File menuImg = new File("C:\\Hbackend\\Where-are-you-going-today\\wgt\\src\\main\\webapp\\resources\\temp\\" + img + ".jpg");
				menuImg.delete();
			}
			session.removeAttribute("tempImgList");

			// 가게 이미지 삭제
			String img = (String)session.getAttribute("tempShopImg");
			File shopImg = new File("C:\\Hbackend\\Where-are-you-going-today\\wgt\\src\\main\\webapp\\resources\\temp\\" + img + ".jpg" );
			shopImg.delete();
			session.removeAttribute("tempShopImg");
			// 문제 될시 주석 처리만 해주세용
		}
		return "map/map";
	}

	@PostMapping("/map/map")
	public String map(Map map, Model model) {
		//검색 검색 내용
		model.addAttribute("name", service.search(map.getName()));
		List<Map> a = service.search(map.getName());
		//주소 받기
		model.addAttribute("addr", a.get(0).getAddress());
		//전체 조회
		model.addAttribute("find", service.findAll());
		return "map/map";
	}
	
	@PostMapping("/map/go_get_waiting")
	public String goGetWaiting() {
		return "redirect:/controller/get_waiting";
	}
	
}
