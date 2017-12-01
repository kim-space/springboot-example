## Overvirew
Mybatis XML版应用 ,使用`lombok`插件简化实体模型，数据采用`mysql`，`Druid`为数据库连接池

---
##### 依赖
```xml
<dependencies>
		<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>1.3.1</version>
		</dependency>

		<dependency>
			<groupId>com.alibaba</groupId>
			<artifactId>druid-spring-boot-starter</artifactId>
			<version>${druid-starter.version}</version>
		</dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>${lombok.version}</version>
			<scope>provided</scope>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		
		<!--pagehelper-->
		<dependency>
			<groupId>com.github.pagehelper</groupId>
			<artifactId>pagehelper-spring-boot-starter</artifactId>
			<version>1.2.1</version>
		</dependency>
	</dependencies>
```

##### application.properties配置
```
spring:
  datasource:
    type: com.alibaba.druid.pool.DruidDataSource
    driver-class-name: com.mysql.jdbc.Driver
    url: jdbc:mysql://localhost:3306/spring?useSSL=false
    username: root
    password: 123456
    druid:
      initial-size: 10
      min-idle: 5
      max-active: 20
      max-wait: 60000
      time-between-eviction-runs-millis: 60000
      min-evictable-idle-time-millis: 300000
      validation-query: SELECT 1 FROM DUAL
      test-on-borrow: false
      test-while-idle: true
      test-on-return: false
      pool-prepared-statements: false
      max-pool-prepared-statement-per-connection-size: 20
      filters: stat,wall
      connection-properties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=5000
      use-global-data-source-stat: true
      web-stat-filter:
        enabled: true
        url-pattern: /*
        exclusions: /druid/*,*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico
      stat-view-servlet:
        enabled: true
        url-pattern: /druid/*
        reset-enable: false
        login-username: admin
        login-password: root
mybatis:
  type-aliases-package: com.kimtd.mybatis.entity
  mapper-locations: classpath:mapping/*.xml
pagehelper:
  helper-dialect: mysql
  reasonable: true
  support-methods-arguments: true
  params: count=countSql

```

##### Druid监控配置
基于application.properties的配置信息，启用druid的数据库监控配置，配置账户和密码信息
> 访问入口 ：`http://localhost:8080/druid

> 用户名：`admin` 密码： `root`
