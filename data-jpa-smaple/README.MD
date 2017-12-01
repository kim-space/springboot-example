## Overvirew
基于`spring-data-jpa`的示例 ，使用`lombok`插件简化实体模型，数据采用`mysql`

---
##### 依赖
```xml
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>${lombok.version}</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
```

##### application.properties配置
```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/spring
    driver-class-name: com.mysql.jdbc.Driver
    username: root
    password: 123456
  jpa:
    properties:
      hibernate.hbm2ddl.auto: create-drop
#      hibernate.dialect: org.hibernate.dialect.MySQL5Dialect
```

