**구현할 기능 목록**
1. 입력
   (1) 식당 예상 방문 날짜
   (2) 주문 메뉴와 개수
2. 주문
   (1) 주문 리스트
   (2) 할인 전 총 주문금액
3. 메뉴
   (1) 애피타이저, 메인, 디저트, 음료 각각의 메뉴와 가격을 저장
   (2) 입력된 String을 Map<메뉴이름, 메뉴가격> 형식으로 변환
4. 할인
   (1) 크리스마스 디데이 할인 - 적용기간 : 2023.12.1 ~ 2023.12.25
   (2) 평일 할인(일요일~목요일) - 적용기간 : 2023.12.1 ~ 2023.12.31
   (2) 주말 할인(금요일, 토요일) - 적용기간 : 2023.12.1 ~ 2023.12.31
   (3) 특별 할인 - 적용기간 : 2023.12.1 ~ 2023.12.31
   (4) 증정 이벤트 - 적용기간 : 2023.12.1 ~ 2023.12.31
   (5) 총 혜택금액
5. 할인 날짜
   (1) WEEKDAY(3, 4, 5, 6, 7, 10, 11, 12, 13, 14, 17, 18, 19, 20, 21, 24, 25, 26, 27, 28, 31)
   (2) WEEKEND(1, 2, 8, 9, 15, 16, 22, 23, 29, 30)
   (3) SPECIAL(3, 10, 17, 24, 25, 31)
6. 출력
   (1) 주문메뉴
   (2) 할인 전 총 주문금액
   (3) 증정 메뉴
   (4) 혜택 내역
   (5) 총 혜택 금액
   (6) 할인 후 예상 결제금액
   (7) 12월 이벤트 배지