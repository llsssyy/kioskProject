## kioskProject
Spring-Boot를 이용한 카페 키오스크 프로그램 Project

---

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/32556448-b82b-4281-9474-2f2217fc1a40/Untitled.png)

## 1️⃣ 프로젝트 개요

1. **주제:**
    - 카페 **키오스크** 프로그램 개발
2. **선정 배경 및 기획 의도:**
    - **편리함**과 **빠른 서비스**를 추구하는 요즘 시장에서 **프랜차이즈** 카페 사업에 필수로 필요한 서비스가 **키오스크**라고 생각하여 서비스 주제를 선정하게 되었다.
3. **프로젝트 내용**:
    - **키오스크**를 이용한 카페 메뉴 **주문** 및 **결제** 기능
4. **활용 방안 및 기대 효과:**
    - 주문 과정에서 발생하는 고객의 **대기시간**을 **단축**한다
    - 직원의 도움 없이 **주문**에서 **결제**까지 고객이 **직접** 할 수 있어 사업자가 **인건비**를 절감할 수 있다.

## 2️⃣ 프로젝트 구성

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/a94bf30c-29bf-4c2e-9df8-ecc33b430fdd/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/82fdd71a-6f83-4612-ae65-acb5c0288572/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/e53b38a0-7c59-4ca1-b0af-616a86ffad96/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/655f4cdc-70c5-4f9c-85cf-0e2a557ae4d9/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/f0ff9398-7455-4661-aa2b-810dc949d27d/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/4666e46c-a03c-43f4-8d98-59f77aa2e104/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/9061683f-3725-4a4e-8ada-84d489ff87dc/Untitled.png)

- 크게 **Admin, Franchisee, Customer** 기능으로 **나누어서** 프로젝트를 진행하였음.
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/e972ed39-0bad-4cd5-957c-d0c3a55d89b6/Untitled.png)
    

## 3️⃣ 핵심기능

### 1. Admin 기능

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/580fdb62-893f-4fa7-9749-e7fe9248a026/Untitled.png)

- 신규 **Admin** 회원들의 **Admin**메뉴 이용 **권한 승인** 여부 및 일반 **Admin**의 기능을 모두 이용할 수 있는 **Super Admin**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/d5d3c436-288c-4ba0-8dbc-ddf5175952b7/Untitled.png)

- **가맹점주**들의 **회원관리** 및 **가맹점**들의 **정보와 매출 확인 및 폐점 여부**, 카페 **식.음료 메뉴 관리**를 할 수 있는 **Admin**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/1e866b78-48f5-418c-bf11-2f187c39dedf/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/cbbc14e6-739a-4de8-bb6f-5709604cd063/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/c07e26a0-4ce4-4577-82a4-d1228c0a40de/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/f75c7a1b-6eff-49c4-8058-662c5710c311/Untitled.png)

### 2. Franchisee기능

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/9c81f5e9-c911-4e59-be53-281bb5a1d758/Untitled.png)

- **가맹점주**를 위한 서비스
    - **자신의 매장** 중 **원하는 매장**을 **선택**하여 서비스를 이용할 수 있다.
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/9f7c039f-7b99-414a-abca-69db5e3c5a2d/Untitled.png)
    
- **카운터**에서 **직접** 주문을 받을 수 있는 기능 구현
    - **키오스크**를 이용하기 불편한 고객들을 위해 **점주**나 **직원**이 **직접** 카운터에서 주문을 받아야 할 때를 대비해 **카운터에**서 직접 **주문을 받는 기능**도 구현하였다.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/7af732a7-e5df-4da1-850b-85092c958ccb/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/c2cf8f33-4fa7-497d-943e-1c2f3c75f917/Untitled.png)

- **자신의 매장** 정보 확인 기능
    - 본인 매장의 **주문**을 **조회** 할 수 있는 화면과, 각각의 **매출의 정보**를 한눈에 보기 쉽게 **영수증 형태로 제공**하는 기능도 구현하였다.
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/3ad4a4c8-c7c7-4a10-9005-0112edc5876a/Untitled.png)
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/78d9c3dc-af76-4a58-afa8-47c6192fe9d9/Untitled.png)
    

### 3. Customer기능

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/859e07cd-097b-4a17-b8ed-4780744dafb3/Untitled.png)

- 실질적으로 **매장**에서 **고객**들이 이용할 수 있는 **키오스크 서비스**로, 프로젝트에서 제일 주력을 기울인 **서비스**
- 고객은 **매장 식사**와 **포장** 주문 중 **원하는 방식**을 선택하여 **키오스크**를 이용할 수 있음.
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/fbcf58d2-3ef4-43f2-8cc0-3e1e72307506/Untitled.png)
    
- 원하는 **메뉴**를 클릭하면, 선택된 **메뉴**의 원하는 **옵션 추가** 후 **장바구니**에 담을 수 있음
    - **옵션**을 **추가**하면 **실시간**으로 **변동되는 가격**을 확인할 수 있게 구현하였음.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/35cb472a-7dd8-4844-8921-4e7e2993c7ce/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/d0e215e8-15f9-40d9-88a0-afd135c7e5b6/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/1a8f5d51-60e7-438d-9f22-3e2ecf335533/Untitled.png)

- **장바구니** 기능 구현
    - **동일 음료**의 **다른 옵션**이거나, **다른 음료**를 여러가지 선택하였을 시 **장바구니**에 **각각의 음료**가 담기게 설정하였고, **페이징 기능** 및 메뉴가 추가될 때 마다 **총 결제 금액**이 **실시간**으로 **변경**되게 설계하였음.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/c5ed32f4-fe05-4e08-9595-87b1acc3d172/Untitled.png)

- **장바구니**에서 잘못 주문한 메뉴 **취소** 가능!

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/9870f633-7fdd-4d93-9fc7-f26a1cbace10/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/b6fbd1db-5953-4f90-8c9c-21f232016692/Untitled.png)

- **결제** 화면 구현
    - 원하는 **메뉴**를 모두 **장바구니**에 담은 후 결제하기 버튼을 누르면 본인이 선택한 메뉴를 확인할 수 있는 확인창이 뜨고, 결제 방식을 **선택** 후 결제 **완료** 할 수 있음.
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/f829f987-cbba-4f3e-b872-7895c7a66220/Untitled.png)
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b5586b7-f187-4e65-8bba-cb9af3b94c07/eb4adf6d-dfc3-4b35-a5f7-8da818465e18/Untitled.png)
    

## 4️⃣ 프로젝트 파일

[kioskPjt.7z](https://drive.google.com/file/d/1TFFaIxd3o2kvxlN16oYqJqSvvN1t77v0/view?usp=sharing)

[4조_2차_kiosk.pptx](https://drive.google.com/file/d/1jPKotV84u7PoqeC42PYXid6fk6kSzIvQ/view?usp=sharing)

## 5️⃣ 시연 영상

https://youtu.be/OvNEt0q7pYo

## 6️⃣ 맡은 역할

- **Admin** 기능 식.음료 메뉴 **CRUD**기능
- **Customer** 메뉴 **주문** 서비스
- **Menu DB** 설계
- **Customer** 메인 페이지 구현

## 7️⃣ 프로젝트를 진행하면서 느꼈던 점

- **프론트엔드**와 **백엔드** 사이에 **데이터를 주고 받는 로직**을 구현하는 것이 즐거웠고 **실시간**으로 화면이 **렌더링** 되는 **ajax** 통신을 중점적으로 개발하여 많은 도움이 되었다.
