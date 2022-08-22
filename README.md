# WGT (Where are you going today?)
+ 매장 웨이팅 등록 및 소규모 SNS 서비스 제공 사이트
+ 2022.8.8 ~ 2022.8.20
+ 모바일 인터페이스
## 팀 구성
+ 총 5명 ( [본인](https://github.com/parkSangGyu98) [태우](https://github.com/workhan0918) [태영](https://github.com/wed456) [기열](https://github.com/BaekKiYeol) [성호](https://github.com/LeeSeongHo7984) )
## 사용한 기술 및 환경
+ Window
+ eclipse
+ Java
+ Spring
+ Jsp
+ MySQL
+ HTML/CSS3
+ Javascript
+ bootstrap

## 구현 기능
+ 사용자
  + 로그인, 로그아웃, 회원가입, 정보수정, 탈퇴
  + 매장정보 조회 및 검색
  + 매장위치 확인 (카카오지도API)
  + 웨이팅 조회 및 등록
  + SNS 게시글 조회, 등록, 수정, 삭제, 좋아요 기능
+ 매장 점주
  + 로그인, 로그아웃, 회원가입
  + 매장 등록, 메뉴 등록
  + 게시글 삭제
  
## 담당 기능
+ 사용자
  + 로그인, 로그아웃, 회원가입, 정보수정, 탈퇴
  + 웨이팅 조회 및 등록
  + 게시글 조회, 수정
  
## 주요 코드
### 사용자 부분
 + 매장정보조회 및 검색
    1. ID값을 이용하여 매장 정보들을 가져와 배열에 담아서 마커에 더해줍니다.
    2. 카카오지도API를 이용하여 마커를 지도에 표시합니다.
    3. 검색란에 매장명 입력 시 검색한 단어를 포함하는 모든 매장을 보여줍니다.
    
              map.jsp 스크립트 일부
              
              for (var i = 0, len = count; i < len; i++) {
              var gapX = (MARKER_WIDTH), // 스프라이트 이미지에서 마커로 사용할 이미지 X좌표 간격 값
              originY = (MARKER_HEIGHT) * i, // 스프라이트 이미지에서 기본, 클릭 마커로 사용할 Y좌표 값
              overOriginY = (OVER_MARKER_HEIGHT) * i, // 스프라이트 이미지에서 오버 마커로 사용할 Y좌표 값
              normalOrigin = new kakao.maps.Point(0, originY), // 스프라이트 이미지에서 기본 마커로 사용할 영역의 좌상단 좌표
              clickOrigin = new kakao.maps.Point(gapX, originY), // 스프라이트 이미지에서 마우스오버 마커로 사용할 영역의 좌상단 좌표
              overOrigin = new kakao.maps.Point(gapX * 2, overOriginY); // 스프라이트 이미지에서 클릭 마커로 사용할 영역의 좌상단 좌표

              positions.push(new kakao.maps.LatLng(document
              .getElementById("longitude" + i).value, document
              .getElementById("latitude" + i).value)); //좌표값을 받아와 배열에 추가하여 마커를 표시

              content.push('<div class="wrap"><div class="info"><div class="title">'
               + document.getElementById("findname" + i).value
               + '</div></div></div>');//가게이름을 받아와 배열에 추가

              inputText.push(document.getElementById("findname" + i).value)

                            // 마커를 생성하고 지도위에 표시합니다
                            addMarker(positions[i], inputText[i], content[i],
                                normalOrigin, overOrigin, clickOrigin);
                            }
                            // 마커를 생성하고 지도 위에 표시하고, 마커에 mouseover, mouseout, click 이벤트를 등록하는 함수입니다
                            function addMarker(position, inputText, content,
                                normalOrigin, overOrigin, clickOrigin) {

                            var markerImage = new kakao.maps.MarkerImage(imageSrc,
                                markerSize), overMarker = new kakao.maps.MarkerImage(
                                imageSrc, overMarkerSize), clickMarker = new kakao.maps.MarkerImage(
                                imageSrc, clickMarkerSize);

                            // 마커를 생성하고 이미지는 기본 마커 이미지를 사용합니다
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
                            // 마커에 click 이벤트를 등록합니다
                            overlay.setMap(null);
                            kakao.maps.event
                                .addListener(
                                    marker,
                            'click',
                            function() {
                              // 클릭된 마커가 없고, click 마커가 클릭된 마커가 아니면
                              // 마커의 이미지를 클릭 이미지로 변경합니다
                              for (var i = 0, len = count; i < len; i++) {
                                document.getElementById("inputSearch").value = inputText
                              }

                              if (!selectedMarker
                                  || selectedMarker !== marker) {
                                // 클릭된 마커 객체가 null이 아니면
                                // 클릭된 마커의 이미지를 기본 이미지로 변경하고
                                !!selectedMarker
                                    && selectedMarker
                                        .setImage(selectedMarker.markerImage);
                                !!selectedContent
                                    && selectedContent.setMap(null);
                              }
                              filter()

                              // 현재 클릭된 마커의 이미지는 클릭 이미지로 변경, 컨테츠를 띄워줌
                              if (marker.markerImage != clickMarker) {
                                marker.setImage(clickMarker)
                                overlay.setMap(map)

                                }

                                // 클릭된 마커를 현재 클릭된 마커 객체로 설정합니다
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

                              
                              MapDao 일부
                              
                              public List<Map> search(String name){
                              String sql = "SELECT * FROM test WHERE name like '%" + name +"%' ";
                              return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Map>(Map.class));
                              }              

  4. 


+ 웨이팅 조회 및 등록
  1. 매장명과 로그인되어있는 ID 세션을 이용하여 정보를 가져왔습니다.
  2. 순서나 내 앞의 팀들은 DB에 저장된 regDate를 비교하여 계산하였습니다.
  3. 웨이팅 첫번째 순서일 때 자동으로 웨이팅 취소를 시키기 위해 먼저 현재시간에서 5분뒤의 시간을 DB에 저장시켰습니다.
  4. DB에 저장한 시간과 현재시간을 비교해 현재시간이 더 크다면 웨이팅을 삭제시켜주었습니다.
  
                       WaitingController 일부
  
                       @GetMapping("/controller/get_waiting")
                       public String getWaitingForm(Model model, HttpSession session) throws ParseException {
                       // 웨이팅을 하지 않았을 때
                       if (waitingService.findWaitingById((String) session.getAttribute("userId")).get(0).getBarName() == "없음") {
                         List<Waiting> noWaiting = waitingService.findWaitingById((String) session.getAttribute("userId"));
                         model.addAttribute("frontCount", "0");
                         model.addAttribute("allCount", "0");
                         model.addAttribute("waiting", noWaiting);
                         model.addAttribute("shopTel", "-");
                         return "waiting/get_waiting";
                       }

                       // 웨이팅 해둔 상태 일때
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
                           allCount++; // 특정 매장에대한 나 포함 모든 웨이팅 수
                           day1 = format.parse(waitingList.get(i).getRegDate());
                           int compare = day1.compareTo(day2);
                           if (compare < 0) {
                             frontCount++; // 내 앞의 웨이팅 수
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
                       // 내 앞 대기팀이 0팀 일때
                       if (frontCount == 0) {
                         // 언제까지오라는 시간 부여받지 않았을때 or waitingStartTime이 0 일때
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
                           model.addAttribute("msg", waitingTime + " 까지 와주시기 바랍니다. (자동취소 예정)");
                           return "waiting/get_waiting";
                         } else { 
                           // 언제까지 오라는 시간을 부여 받은 상황
                           SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                           Date nowDate = new Date();

                           String waitingTime = waitingService.findWaitingById((String) session.getAttribute("userId")).get(0)
                               .getWaitingStartTime();

                           System.out.println(waitingTime);
                           System.out.println(formatter.parse(waitingTime));
                           //				String now = formatter.format(nowDate);
                           //				System.out.println(formatter.parse(waitingTime).after(now));

                           model.addAttribute("msg", waitingTime + " 까지 와주시기 바랍니다. (자동취소 예정)");

                           System.out.println(nowDate.after(formatter.parse(waitingTime)));
                           // 현재시간과 웨이팅타임을 비교하여 현재시간이 더 늦으면 웨이팅을 지우기
                           if ( nowDate.after(formatter.parse(waitingTime)) ) { // formatter.parse(waitingTime).after(nowDate)
                             waitingService.deleteWaiting((String) session.getAttribute("userId"));
                             return "waiting/get_waiting";
                           }
                            }
                           }
                           return "waiting/get_waiting";
                            }  
  
                            

## 구현 화면
  ### 로그인
  
  ![image](https://user-images.githubusercontent.com/103983349/185832375-9707c544-f180-4498-b88a-5555079e6bca.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832405-d0fbac5f-4523-4a01-9d6d-79e1f89ad091.png)

  ### 사용자 회원가입
  
  ![image](https://user-images.githubusercontent.com/103983349/185832447-31edfd86-0ddb-49ff-ac04-99319711f116.png)
  
  ### 점주 회원가입 및 매장 등록
  
  ![image](https://user-images.githubusercontent.com/103983349/185832474-b2ca2435-94eb-4513-b53b-ee2f323cc32a.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832628-fb1b6133-6b11-45df-b7f5-709f252d7018.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832648-05268b9c-9855-4e52-a8b6-20e91609fc1f.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832732-acb66a6c-6ee6-45a5-b16b-eddbd57a9f40.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832846-88e2738a-e6f9-4726-b1b1-fa768da9e85f.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832917-53ef22d6-9ed5-414c-a0d6-7bf026f4f2b5.png)
  ![image](https://user-images.githubusercontent.com/103983349/185832956-02f4a112-6e66-41f5-bc22-57131b28bdd2.png)
  ![image](https://user-images.githubusercontent.com/103983349/185833147-730194d5-bb5d-4901-9294-4caf0691f49d.png)
  ![image](https://user-images.githubusercontent.com/103983349/185833159-4fe5325a-27a3-41b0-a3a2-6f96a642360c.png)
  
  ### 메인 화면
  
  ![image](https://user-images.githubusercontent.com/103983349/185833612-83dcaa7d-2033-4cdb-bd4f-b5f8e768ccc2.png)
  
  ### 우측상단 버튼
  
  ![image](https://user-images.githubusercontent.com/103983349/185833632-b3cd71c9-dc32-4977-afec-3b7b49a5302d.png)
  
  ### 나의 웨이팅 내역
  
  ![image](https://user-images.githubusercontent.com/103983349/185833322-6be8eb37-5e15-4807-b657-c82818cb21c7.png)
  
  ### 회원 정보 열람 및 수정
  
  url 위치
  
  ### 검색
  
  url 위치
  
  ### 웨이팅 등록
  
  ![image](https://user-images.githubusercontent.com/103983349/185833842-4e75efb3-75b5-4308-b070-e2d3b7552772.png)
  
  ### SNS
  
  url 위치
  
  ### 게시글 작성
  
  url 위치
  
  ### 게시글 수정
  
  url 위치
  
