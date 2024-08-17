## kioskProject
Spring-Boot를 이용한 카페 키오스크 프로그램 Project

---

![1](https://github.com/user-attachments/assets/16250538-75f8-440c-9778-d54aa3c4e1db)

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

![2](https://github.com/user-attachments/assets/40706598-cf1a-4cce-b6d2-19c4ec1d79ac)

![3](https://github.com/user-attachments/assets/ba952bda-943c-4315-b790-b99f36b8989c)

![4](https://github.com/user-attachments/assets/e0dd0751-e702-49b5-855d-b235c03614ca)

![5](https://github.com/user-attachments/assets/9724d014-10c4-4349-a2b8-4808fec12667)

![6](https://github.com/user-attachments/assets/5e2856a2-0a35-4f3e-95f5-95e6b0ff9c7b)

![7](https://github.com/user-attachments/assets/9df35df4-1461-456c-aba4-96a17433ea30)

![8](https://github.com/user-attachments/assets/100d1c49-ed85-42ba-9d6a-9b3b67112943)

- 크게 **Admin, Franchisee, Customer** 기능으로 **나누어서** 프로젝트를 진행하였음.
    
![9](https://github.com/user-attachments/assets/0419260b-b3e4-49da-b36e-67c68b462b31)
    

## 3️⃣ 핵심기능

### 1. Admin 기능

![10](https://github.com/user-attachments/assets/bbbf5d87-caa1-4656-8017-bf709bcb0292)

- 신규 **Admin** 회원들의 **Admin**메뉴 이용 **권한 승인** 여부 및 일반 **Admin**의 기능을 모두 이용할 수 있는 **Super Admin**

![11](https://github.com/user-attachments/assets/c958e788-a9ce-41b4-85e8-e7c2bf299482)

- **가맹점주**들의 **회원관리** 및 **가맹점**들의 **정보와 매출 확인 및 폐점 여부**, 카페 **식.음료 메뉴 관리**를 할 수 있는 **Admin**

![12](https://github.com/user-attachments/assets/0292b503-20e6-45a5-95af-5bab60253af5)

![13](https://github.com/user-attachments/assets/c926b58e-0eb3-4250-afab-a14d5079c250)

![14](https://github.com/user-attachments/assets/f374c6e6-f68b-4736-9b31-712abb981055)

![15](https://github.com/user-attachments/assets/9d43b2bb-65a3-4c94-8f4b-522185b905ba)

### 2. Franchisee기능

![16](https://github.com/user-attachments/assets/0ac30fc4-29ed-463a-a888-84b736a0a328)

- **가맹점주**를 위한 서비스
    - **자신의 매장** 중 **원하는 매장**을 **선택**하여 서비스를 이용할 수 있다.
    
![17](https://github.com/user-attachments/assets/84e7643e-f8aa-4f98-b9da-d4aeb888ae7d)
    
- **카운터**에서 **직접** 주문을 받을 수 있는 기능 구현
    - **키오스크**를 이용하기 불편한 고객들을 위해 **점주**나 **직원**이 **직접** 카운터에서 주문을 받아야 할 때를 대비해 **카운터에**서 직접 **주문을 받는 기능**도 구현하였다.

![18](https://github.com/user-attachments/assets/13d55b92-2c25-4747-bfe6-4cd21bd1e279)

![19](https://github.com/user-attachments/assets/2b8c7784-a319-4805-80d6-c1a4f0899990)

- **자신의 매장** 정보 확인 기능
    - 본인 매장의 **주문**을 **조회** 할 수 있는 화면과, 각각의 **매출의 정보**를 한눈에 보기 쉽게 **영수증 형태로 제공**하는 기능도 구현하였다.
    
![20](https://github.com/user-attachments/assets/fad7b8c5-8800-4205-8819-dc536af9692a)
    
![21](https://github.com/user-attachments/assets/8c9d963c-7a18-438f-b06f-78f91e4cc0d3)
    

### 3. Customer기능

![22](https://github.com/user-attachments/assets/ef6e07a1-b401-4b12-b71e-a738d62a245e)

- 실질적으로 **매장**에서 **고객**들이 이용할 수 있는 **키오스크 서비스**로, 프로젝트에서 제일 주력을 기울인 **서비스**
- 고객은 **매장 식사**와 **포장** 주문 중 **원하는 방식**을 선택하여 **키오스크**를 이용할 수 있음.
    
![23](https://github.com/user-attachments/assets/338648a0-4737-4dfc-b0b9-9e0ce766964d)
    
- 원하는 **메뉴**를 클릭하면, 선택된 **메뉴**의 원하는 **옵션 추가** 후 **장바구니**에 담을 수 있음
    - **옵션**을 **추가**하면 **실시간**으로 **변동되는 가격**을 확인할 수 있게 구현하였음.

![24](https://github.com/user-attachments/assets/8ef3148c-d7b6-42f6-b972-13d66ad75775)

![25](https://github.com/user-attachments/assets/df96b0e0-79d2-4c41-a064-e52dede4adec)

![26](https://github.com/user-attachments/assets/7e9ec506-fda1-41bd-9861-a97df9fdd262)

- **장바구니** 기능 구현
    - **동일 음료**의 **다른 옵션**이거나, **다른 음료**를 여러가지 선택하였을 시 **장바구니**에 **각각의 음료**가 담기게 설정하였고, **페이징 기능** 및 메뉴가 추가될 때 마다 **총 결제 금액**이 **실시간**으로 **변경**되게 설계하였음.

![27](https://github.com/user-attachments/assets/6230ba2e-3958-44ff-a8c7-4afd16f70152)

- **장바구니**에서 잘못 주문한 메뉴 **취소** 가능!

![28](https://github.com/user-attachments/assets/498f58f2-a652-41e1-a392-fb88b35ca8e3)

![29](https://github.com/user-attachments/assets/a3166e4f-34ca-4fa9-89e6-57eb8e80d1c9)

- **결제** 화면 구현
    - 원하는 **메뉴**를 모두 **장바구니**에 담은 후 결제하기 버튼을 누르면 본인이 선택한 메뉴를 확인할 수 있는 확인창이 뜨고, 결제 방식을 **선택** 후 결제 **완료** 할 수 있음.
    
![30](https://github.com/user-attachments/assets/39ff57bf-74ca-4e83-aeca-1b7b732a01f3)
    
![31](https://github.com/user-attachments/assets/8642e09b-8ce7-494b-b5d7-82fc5e95c4e8)
    

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
