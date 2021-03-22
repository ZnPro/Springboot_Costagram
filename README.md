# 인스타그램 클론 코딩

### 의존성

- Sring Boot DevTools
- Lombok
- Spring Data JPA
- MySQL Driver
- Spring Security
- Spring Web
- oauth2-client

```xml
<!-- 시큐리티 태그 라이브러리 -->
<dependency>
	<groupId>org.springframework.security</groupId>
	<artifactId>spring-security-taglibs</artifactId>
</dependency>

<!-- JSP 템플릿 엔진, 안되면 9.0.43버전 이상 -->
<dependency>
	<groupId>org.apache.tomcat</groupId>
	<artifactId>tomcat-jasper</artifactId>
	<version>9.0.22</version>
</dependency>

<!-- JSTL -->
<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
</dependency>

```

### 데이터 베이스

```
create user 'costa'@'%' identified by 'costa1234';
GRANT ALL PRIVILEGES ON *.* TO 'costa'@'%';
create database costa;
```

### 주의사항

resoruces/static 폴더가 디폴트 경로
이 경로를 제대로 확인 안해주면 style.css랑 image를 못 불러옴