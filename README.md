# 날씨 일기 작성, 조회, 수정, 삭제 가능한 백엔드 프로젝트

<br>

## 기술 스택

- **Language**: Java (JDK 20)
- **Database**: h2 database
- **IDE**: IntelliJ IDEA
- **Library**:
  - Lombok

<br>

## 프로젝트 소개

- 날씨, 일기를 작성/조회/수정/삭제하는 백엔드를 구현
- 테스트 코드 작성 및 외부 API 데이터 활용(https://openweathermap.org/ 에서 API 인증키를 통해 받아옴)
  (인증키는 보안을 위해 코드에서 삭제하였습니다)
- 외부 API로 받아온 날씨 데이터를 MySql을 통해 저장 및 조회 

<br>

## 기능

- 일기 생성
- 일기 조회 : 선택한 날짜 혹은 선택한 기간별 일기 조회 기능
- 일기 수정 및 삭제 기능
