## Overvirew
springboot 自定义属性、随机数、多环境配置

---
##### 自定义属性加载
```
com.kimtd.github.name=kimtd
com.kintd.github.url=https://github.com/kim-space
```
通过`@value("${属性名}")`来加载对应的配置属性
```java
@Data
@Component
public class GithubProperties {
    
    @Value("${com.kimtd.github.name}")
    private String name;
    
    @Value("${com.kintd.github.url}")
    private String url;
}
```

##### 参数间的引用
在`application.properties`中的各个参数也可以直接引用来使用
```
com.kimtd.blog.name=kim
com.kimtd.blog.title=springboot 示例
com.kimtd.blog.desc=${com.kimtd.blog.name}在写${com.kimtd.blog.title}
```

##### 随机数
某些情况下，有些参数不希望是一个固定值，如端口号。在springboot属性配置文件中可以通过`${random}`来产生随机的值
```
# 随机字符串
com.kimtd.blog.value=${random.value}
# 随机int
com.kimtd.blog.number=${random.int}
# 随机long
com.kimtd.blog.bignumber=${random.long}
# 10以内的随机数
com.kimtd.blog.test1=${random.int(10)}
# 10-20的随机数
com.kimtd.blog.test2=${random.int[10,20]}

```
##### 命令行设置属性值
`java -jar xx.jar --server.port=8998` 使用--server.port属性来设置应用的端口。

使用两个连续的`--`就是标志着对`application.propertes`中属性进行赋值.通过命令行就能更改应用运行的参数，当需要屏蔽从命令行设置参数时，通过`SpringApplication.setAddCommandLineProperties(false)`进行屏蔽命令行访问属性的设置


##### 多环境配置
在springboot中多环境的配置文件名需要满足application-{profile}.properties的格式，{profile}对应环境标志

- application-dev.properties 开发环境
- application-test.properties 测试环境
- application-prod.properties 生产环境

加载具体的环境配置文件需要在`application.properties`中通过`spring.profiles.active`属性来设置，值对应`{profile}`的值
如 `spring.profiles.active=dev` 则会加载`application-dev.properties`配置文件内容

所以在多环境下在`application.properties`中配置通用的内通，并设置需要激活的环境配置。在各个环境配置文件中配置各自的环境配置信息