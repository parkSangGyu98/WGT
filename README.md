# WGT (Where are you going today?) ๐
+ ๋งค์ฅ ์จ์ดํ ๋ฑ๋ก ๋ฐ ์๊ท๋ชจ SNS ์๋น์ค ์ ๊ณต ์น์ ํ๋ฆฌ์ผ์ด์
+ 2022.8.8 ~ 2022.8.22
+ ๋ชจ๋ฐ์ผ ์ธํฐํ์ด์ค
## ํ ๊ตฌ์ฑ
+ ์ด 5๋ช ( [๋ณธ์ธ](https://github.com/parkSangGyu98) [ํ์ฐ](https://github.com/workhan0918) [ํ์](https://github.com/wed456) [๊ธฐ์ด](https://github.com/BaekKiYeol) [์ฑํธ](https://github.com/LeeSeongHo7984) )
## ์ฌ์ฉํ ๊ธฐ์  ๋ฐ ํ๊ฒฝ
+ Window
+ eclipse
+ Java
+ Spring
+ Jsp
+ MySQL
+ HTML/CSS3
+ Javascript
+ bootstrap

## ๊ตฌํ ๊ธฐ๋ฅ
+ ์ฌ์ฉ์
  + ๋ก๊ทธ์ธ, ๋ก๊ทธ์์, ํ์๊ฐ์, ์ ๋ณด์์ , ํํด
  + ๋งค์ฅ์ ๋ณด ์กฐํ ๋ฐ ๊ฒ์
  + ๋งค์ฅ์์น ํ์ธ (์นด์นด์ค์ง๋API)
  + ์จ์ดํ ์กฐํ ๋ฐ ๋ฑ๋ก
  + SNS ๊ฒ์๊ธ ์กฐํ, ๋ฑ๋ก, ์์ , ์ญ์ , ์ข์์ ๊ธฐ๋ฅ
+ ๋งค์ฅ ์ ์ฃผ
  + ๋ก๊ทธ์ธ, ๋ก๊ทธ์์, ํ์๊ฐ์
  + ๋งค์ฅ ๋ฑ๋ก, ๋ฉ๋ด ๋ฑ๋ก
  + ๊ฒ์๊ธ ์ญ์ 
  
## ๋ด๋น ๊ธฐ๋ฅ
+ ์ฌ์ฉ์
  + ๋ก๊ทธ์ธ, ๋ก๊ทธ์์, ํ์๊ฐ์, ์ ๋ณด์์ , ํํด
  + ์จ์ดํ ์กฐํ ๋ฐ ๋ฑ๋ก
  + ๊ฒ์๊ธ ์กฐํ, ์์ 
  + ๊ฒ์๊ธ ์ข์์ ๊ธฐ๋ฅ
  
## ์ฃผ์ ์ฝ๋
### ์ฌ์ฉ์ ๋ถ๋ถ
 + ๋งค์ฅ์ ๋ณด์กฐํ ๋ฐ ๊ฒ์
    1. ID๊ฐ์ ์ด์ฉํ์ฌ ๋งค์ฅ ์ ๋ณด๋ค์ ๊ฐ์ ธ์ ๋ฐฐ์ด์ ๋ด์์ ๋ง์ปค์ ๋ํด์ค๋๋ค.
    2. ์นด์นด์ค์ง๋API๋ฅผ ์ด์ฉํ์ฌ ๋ง์ปค๋ฅผ ์ง๋์ ํ์ํฉ๋๋ค.
    3. ๊ฒ์๋์ ๋งค์ฅ๋ช ์๋ ฅ ์ ๊ฒ์ํ ๋จ์ด๋ฅผ ํฌํจํ๋ ๋ชจ๋  ๋งค์ฅ์ ๋ณด์ฌ์ค๋๋ค.
    
              map.jsp ์คํฌ๋ฆฝํธ ์ผ๋ถ
              
              for (var i = 0, len = count; i < len; i++) {
              var gapX = (MARKER_WIDTH), // ์คํ๋ผ์ดํธ ์ด๋ฏธ์ง์์ ๋ง์ปค๋ก ์ฌ์ฉํ  ์ด๋ฏธ์ง X์ขํ ๊ฐ๊ฒฉ ๊ฐ
              originY = (MARKER_HEIGHT) * i, // ์คํ๋ผ์ดํธ ์ด๋ฏธ์ง์์ ๊ธฐ๋ณธ, ํด๋ฆญ ๋ง์ปค๋ก ์ฌ์ฉํ  Y์ขํ ๊ฐ
              overOriginY = (OVER_MARKER_HEIGHT) * i, // ์คํ๋ผ์ดํธ ์ด๋ฏธ์ง์์ ์ค๋ฒ ๋ง์ปค๋ก ์ฌ์ฉํ  Y์ขํ ๊ฐ
              normalOrigin = new kakao.maps.Point(0, originY), // ์คํ๋ผ์ดํธ ์ด๋ฏธ์ง์์ ๊ธฐ๋ณธ ๋ง์ปค๋ก ์ฌ์ฉํ  ์์ญ์ ์ข์๋จ ์ขํ
              clickOrigin = new kakao.maps.Point(gapX, originY), // ์คํ๋ผ์ดํธ ์ด๋ฏธ์ง์์ ๋ง์ฐ์ค์ค๋ฒ ๋ง์ปค๋ก ์ฌ์ฉํ  ์์ญ์ ์ข์๋จ ์ขํ
              overOrigin = new kakao.maps.Point(gapX * 2, overOriginY); // ์คํ๋ผ์ดํธ ์ด๋ฏธ์ง์์ ํด๋ฆญ ๋ง์ปค๋ก ์ฌ์ฉํ  ์์ญ์ ์ข์๋จ ์ขํ

              positions.push(new kakao.maps.LatLng(document
              .getElementById("longitude" + i).value, document
              .getElementById("latitude" + i).value)); //์ขํ๊ฐ์ ๋ฐ์์ ๋ฐฐ์ด์ ์ถ๊ฐํ์ฌ ๋ง์ปค๋ฅผ ํ์

              content.push('<div class="wrap"><div class="info"><div class="title">'
               + document.getElementById("findname" + i).value
               + '</div></div></div>');//๊ฐ๊ฒ์ด๋ฆ์ ๋ฐ์์ ๋ฐฐ์ด์ ์ถ๊ฐ

              inputText.push(document.getElementById("findname" + i).value)

                        // ๋ง์ปค๋ฅผ ์์ฑํ๊ณ  ์ง๋์์ ํ์ํฉ๋๋ค
                        addMarker(positions[i], inputText[i], content[i],
                            normalOrigin, overOrigin, clickOrigin);
                        }
                        // ๋ง์ปค๋ฅผ ์์ฑํ๊ณ  ์ง๋ ์์ ํ์ํ๊ณ , ๋ง์ปค์ mouseover, mouseout, click ์ด๋ฒคํธ๋ฅผ ๋ฑ๋กํ๋ ํจ์์๋๋ค
                        function addMarker(position, inputText, content,
                            normalOrigin, overOrigin, clickOrigin) {

                        var markerImage = new kakao.maps.MarkerImage(imageSrc,
                            markerSize), overMarker = new kakao.maps.MarkerImage(
                            imageSrc, overMarkerSize), clickMarker = new kakao.maps.MarkerImage(
                            imageSrc, clickMarkerSize);

                        // ๋ง์ปค๋ฅผ ์์ฑํ๊ณ  ์ด๋ฏธ์ง๋ ๊ธฐ๋ณธ ๋ง์ปค ์ด๋ฏธ์ง๋ฅผ ์ฌ์ฉํฉ๋๋ค
                        var marker = new kakao.maps.Marker({
                          map : map,
                          position : position,
                          image : markerImage
                        });

                        var overlay = new kakao.maps.CustomOverlay({
                          content : content,
                          map : map,
                          position : position
                        });

                        marker.markerImage = markerImage;
                        // ๋ง์ปค์ click ์ด๋ฒคํธ๋ฅผ ๋ฑ๋กํฉ๋๋ค
                        overlay.setMap(null);
                        kakao.maps.event
                            .addListener(
                                marker,
                        'click',
                        function() {
                          // ํด๋ฆญ๋ ๋ง์ปค๊ฐ ์๊ณ , click ๋ง์ปค๊ฐ ํด๋ฆญ๋ ๋ง์ปค๊ฐ ์๋๋ฉด
                          // ๋ง์ปค์ ์ด๋ฏธ์ง๋ฅผ ํด๋ฆญ ์ด๋ฏธ์ง๋ก ๋ณ๊ฒฝํฉ๋๋ค
                          for (var i = 0, len = count; i < len; i++) {
                            document.getElementById("inputSearch").value = inputText
                          }

                          if (!selectedMarker
                              || selectedMarker !== marker) {
                            // ํด๋ฆญ๋ ๋ง์ปค ๊ฐ์ฒด๊ฐ null์ด ์๋๋ฉด
                            // ํด๋ฆญ๋ ๋ง์ปค์ ์ด๋ฏธ์ง๋ฅผ ๊ธฐ๋ณธ ์ด๋ฏธ์ง๋ก ๋ณ๊ฒฝํ๊ณ 
                            !!selectedMarker
                                && selectedMarker
                                    .setImage(selectedMarker.markerImage);
                            !!selectedContent
                                && selectedContent.setMap(null);
                          }
                          filter()

                          // ํ์ฌ ํด๋ฆญ๋ ๋ง์ปค์ ์ด๋ฏธ์ง๋ ํด๋ฆญ ์ด๋ฏธ์ง๋ก ๋ณ๊ฒฝ, ์ปจํ์ธ ๋ฅผ ๋์์ค
                          if (marker.markerImage != clickMarker) {
                            marker.setImage(clickMarker)
                            overlay.setMap(map)

                            }

                            // ํด๋ฆญ๋ ๋ง์ปค๋ฅผ ํ์ฌ ํด๋ฆญ๋ ๋ง์ปค ๊ฐ์ฒด๋ก ์ค์ ํฉ๋๋ค
                            selectedMarker = marker;
                            selectedContent = overlay;

                          });

                            kakao.maps.event.addListener(map, 'click', function() {
                              if (!overlay.setMap(null)) {
                                overlay.setMap(null);
                                marker.setImage(markerImage)
                              }
                            })
                          }


                          MapDao ์ผ๋ถ

                          public List<Map> search(String name){
                          String sql = "SELECT * FROM test WHERE name like '%" + name +"%' ";
                          return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Map>(Map.class));
                          }              

  4. ๋งค์ฅ์ ๊ฒ์ํ์ ๋ ๊ทธ ๋งค์ฅ์ ๋ฉ๋ด๋ ๋ถ๋ฌ์์ ์กฐํํ  ์ ์๋๋ก ํ๋ ๊ณผ์ ์์ ์ด๋ ค์์ด ์์์ต๋๋ค.
  5. forEach๋ฌธ์์ ํด๊ฒฐํ๋ ค๊ณ  ํด์ ๊ฐํผ๋ฅผ ๋ชป์ก์์ง๋ง ์คํฌ๋ฆฝํธ์ ๋ฐฐ์ด๊ณผ for๋ฌธ์ ์ด์ฉํ์ฌ ํด๊ฒฐํ์์ต๋๋ค.
  
                Map.jsp ์ผ๋ถ

                <c:forEach var="menu" items="${menuList}" varStatus="status">
                  <c:forEach var="x" items="${menu}" varStatus="t">
                    <div class="menulist${status.index}"
                      id="findmenu${status.index}${t.index}" style="display: none;">
                        <span class="menu">${menuList[status.index][t.index].menuName}: </span>
                        <span class="menu">${menuList[status.index][t.index].menuPrice}</span>
                    </div>
                  </c:forEach>
                </c:forEach>

                Map.jsp ์คํฌ๋ฆฝํธ ์ผ๋ถ

                function filter() {

                var value, name, item, i, background, menuList, menu;

                value = document.getElementById("inputSearch").value.toUpperCase();
                item = document.getElementsByClassName("item");
                background = document.getElementById("menu_wrap")
                menuList = []

                for (i = 0; i < item.length; i++) {
                  menuList.push(document.getElementsByClassName("menulist" + i));
                  name = item[i].getElementsByClassName("name")
                  for (j = 0; j < menuList[i].length; j++) {
                    menu = menuList[i][j].getElementsByClassName("menu")
                    if (name[0].innerHTML.toUpperCase().indexOf(value) > -1) {
                      item[i].style.display = "block";
                      menuList[i][j].style.display = "block";
                      background.style.opacity = "100";
                      background.style.left = "0";
                    } else {
                      item[i].style.display = "none";
                      menuList[i][j].style.display = "none";
                    }

                    if (value.length == 0) {
                      menuList[i][j].style.display = "none";
                      item[i].style.display = "none";
                      background.style.opacity = "0";
                      background.style.left = "-270px";
                    }
                  }
                  }
                }


+ ์จ์ดํ ์กฐํ ๋ฐ ๋ฑ๋ก
  1. ๋งค์ฅ๋ช๊ณผ ๋ก๊ทธ์ธ๋์ด์๋ ID ์ธ์์ ์ด์ฉํ์ฌ ์ ๋ณด๋ฅผ ๊ฐ์ ธ์์ต๋๋ค.
  2. ์์๋ ๋ด ์์ ํ๋ค์ DB์ ์ ์ฅ๋ regDate๋ฅผ ๋น๊ตํ์ฌ ๊ณ์ฐํ์์ต๋๋ค.
  3. ์จ์ดํ ์ฒซ๋ฒ์งธ ์์์ผ ๋ ์๋์ผ๋ก ์จ์ดํ ์ทจ์๋ฅผ ์ํค๊ธฐ ์ํด ๋จผ์  ํ์ฌ์๊ฐ์์ 5๋ถ๋ค์ ์๊ฐ์ DB์ ์ ์ฅ์์ผฐ์ต๋๋ค.
  4. DB์ ์ ์ฅํ ์๊ฐ๊ณผ ํ์ฌ์๊ฐ์ ๋น๊ตํด ํ์ฌ์๊ฐ์ด ๋ ํฌ๋ค๋ฉด ์จ์ดํ์ ์ญ์ ์์ผ์ฃผ์์ต๋๋ค.
  
                 WaitingController ์ผ๋ถ

                 @GetMapping("/controller/get_waiting")
                 public String getWaitingForm(Model model, HttpSession session) throws ParseException {
                 // ์จ์ดํ์ ํ์ง ์์์ ๋
                 if (waitingService.findWaitingById((String) session.getAttribute("userId")).get(0).getBarName() == "์์") {
                   List<Waiting> noWaiting = waitingService.findWaitingById((String) session.getAttribute("userId"));
                   model.addAttribute("frontCount", "0");
                   model.addAttribute("allCount", "0");
                   model.addAttribute("waiting", noWaiting);
                   model.addAttribute("shopTel", "-");
                   return "waiting/get_waiting";
                 }

                 // ์จ์ดํ ํด๋ ์ํ ์ผ๋
                 List<Waiting> waitingList = waitingService.findAllWaiting(
                     waitingService.findWaitingById((String) session.getAttribute("userId")).get(0).getBarName());
                 long allCount = 0;
                 long frontCount = 0;

                 try {
                   Date day1;
                   Date day2;
                   day2 = format
                       .parse(waitingService.findWaitingById((String) session.getAttribute("userId")).get(0).getRegDate());
                   for (int i = 0; i < waitingList.size(); i++) {
                     allCount++; // ํน์  ๋งค์ฅ์๋ํ ๋ ํฌํจ ๋ชจ๋  ์จ์ดํ ์
                     day1 = format.parse(waitingList.get(i).getRegDate());
                     int compare = day1.compareTo(day2);
                     if (compare < 0) {
                       frontCount++; // ๋ด ์์ ์จ์ดํ ์
                     }
                   }
                 } catch (ParseException e) {
                   e.printStackTrace();
                 }

                 model.addAttribute("frontCount", frontCount);
                 model.addAttribute("allCount", allCount);
                 model.addAttribute("waiting", waitingService.findWaitingById((String) session.getAttribute("userId")));
                 model.addAttribute("shopTel",
                     shopService.findAllByShopName(
                         waitingService.findWaitingById((String) session.getAttribute("userId")).get(0).getBarName()).get(0).getShopTel());
                 // ๋ด ์ ๋๊ธฐํ์ด 0ํ ์ผ๋
                 if (frontCount == 0) {
                   // ์ธ์ ๊น์ง์ค๋ผ๋ ์๊ฐ ๋ถ์ฌ๋ฐ์ง ์์์๋ or waitingStartTime์ด 0 ์ผ๋
                   if (waitingService.findWaitingById((String) session.getAttribute("userId")).get(0).getWaitingStartTime()
                       .equals("0")) {
                     SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
                     Date nowDate = new Date();
                     Calendar cal = Calendar.getInstance();
                     cal.setTime(nowDate);
                     cal.add(Calendar.MINUTE, 1);
                     String outputText = outputFormat.format(cal.getTime());

                     waitingService.addWaitingTime((String) session.getAttribute("userId"), outputText);
                     String waitingTime = waitingService.findWaitingById((String) session.getAttribute("userId")).get(0)
                         .getWaitingStartTime();
                     model.addAttribute("msg", waitingTime + " ๊น์ง ์์ฃผ์๊ธฐ ๋ฐ๋๋๋ค. (์๋์ทจ์ ์์ )");
                     return "waiting/get_waiting";
                   } else { 
                     // ์ธ์ ๊น์ง ์ค๋ผ๋ ์๊ฐ์ ๋ถ์ฌ ๋ฐ์ ์ํฉ
                     SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                     Date nowDate = new Date();

                     String waitingTime = waitingService.findWaitingById((String) session.getAttribute("userId")).get(0)
                         .getWaitingStartTime();

                     System.out.println(waitingTime);
                     System.out.println(formatter.parse(waitingTime));
                     //				String now = formatter.format(nowDate);
                     //				System.out.println(formatter.parse(waitingTime).after(now));

                     model.addAttribute("msg", waitingTime + " ๊น์ง ์์ฃผ์๊ธฐ ๋ฐ๋๋๋ค. (์๋์ทจ์ ์์ )");

                     System.out.println(nowDate.after(formatter.parse(waitingTime)));
                     // ํ์ฌ์๊ฐ๊ณผ ์จ์ดํํ์์ ๋น๊ตํ์ฌ ํ์ฌ์๊ฐ์ด ๋ ๋ฆ์ผ๋ฉด ์จ์ดํ์ ์ง์ฐ๊ธฐ
                     if ( nowDate.after(formatter.parse(waitingTime)) ) { // formatter.parse(waitingTime).after(nowDate)
                       waitingService.deleteWaiting((String) session.getAttribute("userId"));
                       return "waiting/get_waiting";
                     }
                      }
                     }
                     return "waiting/get_waiting";
                      }  
  
+ ๊ฒ์๊ธ ์ข์์ ๊ธฐ๋ฅ
  1. DB์ ์ข์์ ํ์ด๋ธ์ ๋ง๋ค๊ณ  ๋๋ ค์ก๋์ง ์ฒดํฌํ๋ likeCheck ์ด ๋ง๋ค์ด true, false๋ก ๊ตฌ๋ถํ์์ต๋๋ค.
  2. ์ข์์ ํด๋ฆญ ์ false ๋ผ๋ฉด true ๋ก ๋ฐ๊ฟ์ค๊ณผ ๋์์ ๊ฒ์๊ธ ์ด ์ข์์ ๊ฐ์๋ฅผ 1 ๋ํ์ฌ ์๋ฐ์ดํธ ํด์ฃผ์์ต๋๋ค.
  3. A ์์ด๋๋ก ์ข์์๋ฅผ ๋๋ฌ๋ ์ํ์์ B๊ฐ ๋ก๊ทธ์ธ ํ์ ๋, ์ข์์๊ฐ ๋๋ฌ์ ธ์๋ ์ํฉ์ ์ด๋ ค์์ ๊ฒช์์ต๋๋ค.
  4. ์ฐ์ , controller์์ Likeํ์ด๋ธ์ likeCheck๋ฅผ ์ด์ฉํ์ฌ for๋ฌธ๊ณผ if๋ฌธ์ ์ฌ์ฉํด์ false์ธ์ง true์ธ์ง ํ์ธํ์์ต๋๋ค.
  5. false๋ผ๋ฉด ๊ฒ์๊ธ์ ์ข์์ ์ด๋ฏธ์ง ๋ชจ๋๋ฅผ ํฐ์ํํธ๋ก ๋ณ๊ฒฝํ๋ ์์์ ์ถ๊ฐํ๋ฉด์ ํด๊ฒฐํ  ์ ์์์ต๋๋ค. (true ๋ผ๋ฉด ๋ฐ๋๋ก ๋นจ๊ฐํํธ ์ถ๊ฐ)
 
  
                BoardController ์ผ๋ถ

                @GetMapping("/board/home")
                public String list(HttpSession session, Model model, Board board) {
                  String userId = (String) session.getAttribute("userId");
                  if (session.getAttribute("userId") == null) {
                    model.addAttribute("msg", "๋ก๊ทธ์ธ์ด ํ์ํ ์๋น์ค ์๋๋ค.");
                    model.addAttribute("url", "../login");
                    return "alert/alert";
                  }

                  for (int i = 0; i < service.read(board).size(); i++) {
                    long boardNum = service.read(board).get(i).getNumber();

                    if ( service.findLikes(userId, boardNum).get(0).getLikeCheck().equals("false") ) {
                      service.updateLikeImg(boardNum, "dislikeheart");
                    }else {
                      service.updateLikeImg(boardNum, "likeheart");
                    }
                  }

                  model.addAttribute("board", service.read(board));

                  return "board/home";
                }

                @GetMapping("/board/likes")
                public String getLikes(HttpSession session, Model model, Board board) {
                  String userId = (String) session.getAttribute("userId");

                  if (session.getAttribute("userId") == null) {
                    model.addAttribute("msg", "๋ก๊ทธ์ธ์ด ํ์ํ ์๋น์ค ์๋๋ค.");
                    model.addAttribute("url", "../login");
                    return "alert/alert";
                  }


                  // ๋ง์ฝ Likes ํ์ด๋ธ์ id, number๊ฐ ๋์ผํ ์ ๋ณด๊ฐ ์์ผ๋ฉด ๋ง๋ค์ด์ฃผ๊ธฐ ์๋๋ฉด ๋ฐ์๊บผ ์คํ 
                  if ( service.findLikes(userId, board.getNumber()).get(0).getUserId().equals("์์")
                      && service.findLikes(userId, board.getNumber()).get(0).getNumber() == -1 ) {
                    Likes likes = new Likes();
                    String result = "false";
                    likes.setUserId(userId);
                    likes.setLikeCheck(result);
                    likes.setNumber(board.getNumber());
                    service.likeuser(likes);
                    service.checkUpdate(userId, board.getNumber(), "true");
                    service.likecountPlus(board.getLikecount(), board.getNumber());
                    service.updateLikeImg(board.getNumber(), "likeheart");
                  }else { // DB์ ์์ด๋๋ ๊ฒ์๊ธ๋ฒํธ๊ฐ ๋์ผํ ์ ๋ณด๊ฐ ์๋ค๋ฉด true, false๋ฅผ ๋น๊ตํ๋ค
                    if(service.findLikes(userId, board.getNumber()).get(0).getLikeCheck().equals("false")) { // ์ข์์๋ฅผ ๋๋ฅด์ง ์์ ์ํํ
                      service.checkUpdate(userId, board.getNumber(), "true");
                      service.likecountPlus(board.getLikecount(), board.getNumber());
                      service.updateLikeImg(board.getNumber(), "likeheart");
                    }else {
                      service.checkUpdate(userId, board.getNumber(), "false");
                      service.likecountDown(board.getLikecount(), board.getNumber());
                      service.updateLikeImg(board.getNumber(), "dislikeheart");
                    }
                  }

                  return "redirect:/board/home";
                }
                            

## ๊ตฌํ ํ๋ฉด
  ### ๋ก๊ทธ์ธ
  
  ![image](https://user-images.githubusercontent.com/103983349/185832375-9707c544-f180-4498-b88a-5555079e6bca.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832405-d0fbac5f-4523-4a01-9d6d-79e1f89ad091.png)

  ### ์ฌ์ฉ์ ํ์๊ฐ์
  + ์ฐํธ๋ฒํธ ์ฐพ๊ธฐ๋ API๋ฅผ ์ด์ฉํ์์ต๋๋ค.
    
  ![image](https://user-images.githubusercontent.com/103983349/185832447-31edfd86-0ddb-49ff-ac04-99319711f116.png)
  
  ### ์ ์ฃผ ํ์๊ฐ์ ๋ฐ ๋งค์ฅ ๋ฑ๋ก
  
  ![image](https://user-images.githubusercontent.com/103983349/185832474-b2ca2435-94eb-4513-b53b-ee2f323cc32a.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832628-fb1b6133-6b11-45df-b7f5-709f252d7018.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832648-05268b9c-9855-4e52-a8b6-20e91609fc1f.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832732-acb66a6c-6ee6-45a5-b16b-eddbd57a9f40.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832846-88e2738a-e6f9-4726-b1b1-fa768da9e85f.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832917-53ef22d6-9ed5-414c-a0d6-7bf026f4f2b5.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832956-02f4a112-6e66-41f5-bc22-57131b28bdd2.png)
  ![image](https://user-images.githubusercontent.com/103983349/185833147-730194d5-bb5d-4901-9294-4caf0691f49d.png)
  ![image](https://user-images.githubusercontent.com/103983349/185833159-4fe5325a-27a3-41b0-a3a2-6f96a642360c.png)
  
  ### ๋ฉ์ธ ํ๋ฉด
  
  ![image](https://user-images.githubusercontent.com/103983349/187859943-f792f04b-e7f7-4d78-b1c8-13b273de015f.png)
  
  ### ์ฐ์ธก์๋จ ๋ฒํผ
  
  ![image](https://user-images.githubusercontent.com/103983349/186112422-b8f3f89d-5da9-4167-8df3-a1bf908ff770.png)
  
  ### ๋์ ์จ์ดํ ๋ด์ญ
  
  ![image](https://user-images.githubusercontent.com/103983349/186304775-e35b4108-f1b4-476f-b8d7-5b34edbf2798.png)
  
  ### ๋งค์ฅ ์ ์ฃผ - ํ์ฌ ๋์ ๋งค์ฅ ์จ์ดํ ๋ด์ญ
  
  ![image](https://user-images.githubusercontent.com/103983349/187860109-d89887c1-cd24-48e9-905b-44354d8fb7c8.png)
  
  ### ํ์ ์ ๋ณด ์ด๋ ๋ฐ ์์ 
  
  ![image](https://user-images.githubusercontent.com/103983349/185879805-9176988a-07de-4d6a-9205-e67152bca744.png)
  
  ### ๊ฒ์
  
  ![image](https://user-images.githubusercontent.com/103983349/186111419-0bd5895d-d4ba-4452-8629-879e292affb6.png)
  
  ### ์จ์ดํ ๋ฑ๋ก
  
  ![image](https://user-images.githubusercontent.com/103983349/185833842-4e75efb3-75b5-4308-b070-e2d3b7552772.png)
  
  ### SNS
  
  ![image](https://user-images.githubusercontent.com/103983349/186072136-a9007828-932a-4401-b720-b15b598ecbb9.png)
  ![image](https://user-images.githubusercontent.com/103983349/186072156-878baa23-ff59-40a1-9892-bfb1d6fe3999.png)

  
  ### ๊ฒ์๊ธ ์์ฑ
  
  ![image](https://user-images.githubusercontent.com/103983349/186072199-8df24539-607a-4c05-9a4f-f70abbffe7bf.png)
  
  ### ๊ฒ์๊ธ ์์ 
  
  ![image](https://user-images.githubusercontent.com/103983349/186072262-191c6f1c-b85d-49eb-b86f-f536e151479a.png)
  ![image](https://user-images.githubusercontent.com/103983349/186072305-25af9634-5f00-4d6c-9546-4ac71065c1cd.png)

