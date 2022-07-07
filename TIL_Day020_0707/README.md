# 복습내용 목차

----

## MyBatis를 활용한 Spring DB

- MyBatis
- MyBatis 연동 스프링 프로젝트 작성 순서
  1. MVC 프로젝트 생성
  2. pom.xml 기본 설정
  3. 프로젝트 설정
  4. pom.xml에 데이터베이스 의존성 설정
  5. 데이터베이스 연결 정보설정
  6. 클래스 구성 : CRUD 기능 구현
     - 전체 상품 조회(SELECT)
     - 상품 등록(INSERT)
     - 상품 상세 정보 조회(detailView)
     - 상품 정보 수정(UPDATE)
     - 상품 정보 삭제(DELETE)



#### 학습 후기

- xml 설정 등 DB연동을 위해 준비물이 생각보다 많음
  - 설정문을 외우기 보다는 전체 흐름을 외우기 위해 노력
  - CRUD의 경우 Controller, service, DAO, VO, Mapper 등 다양한 클래스들의 작동 원리 및 순서에 초점을 맞춰 복습. 변형에 대처할 수 있게 학습

[VO, DAO, DTO, CRUD](https://m.blog.naver.com/ljc8808/220462395989)