## Overvirew
springboot JSP支持简单示例

---

#### 依赖
```
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <scope>provided</scope>
</dependency>

<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <scope>provided</scope>
</dependency>
```


运行项目有三种方式，在maven中jasper依赖有加provided和注释掉该依赖范围运行的效果不大一样，具体对比如下：

有添加provided的情况：
1. 直接运行启动类，访问页面404错误 ❌
2. 使用maven插件启动：`mvn spring-boot:run` 访问正常
3. 打包城jar，通过java -jar xxx.jar 运行报错
4. 打包成war，通过java -jar xxx.jar 运行正常

没有添加provided的情况：
1. 直接运行启动类，访正常✅
2. 使用maven插件启动：`mvn spring-boot:run` 访问正常
3. 打包城jar，通过java -jar xxx.jar 运行报错
4. 打包成war，通过java -jar xxx.jar 运行正常

