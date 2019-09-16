
# Spring Cloud 多模块项目 Demo

## 环境、版本
Spring Boot 2.1.8.RELEASE


## 创建一个 Maven 项目
1. New Project - Maven
2. 填写 GroupId 和 ArtifactId
3. 填写 Project name 和 指定项目存储位置
4. 完成

修改：
1. 以后的每个模块都对应一个子目录，这里生成的 src 目录不使用，删除。



## 创建第一个 module : 注册中心 Eureka

1. 在 项目上右键，选择 New - Module 
2. 选择 Spring Initializr （社区版为 Spring Assistant）
3. 填写项目属性（Project properties）：Group Id、 Artifact Id、 Project name、Project description、 Package name 等，如下图：
 ![NewModule-eureka](./res/NewModule-eureka.png)
4. Next - 选择组件 Spring CLoud Discovery - Eureka Server
5. Next - 填写 Module name 和指定模块的存储位置
6. **在 Application 前加上 @EnableEurekaServer 注解**
7. 在 resources 目录下的 application.properties 中添加一些基础的属性，服务名，端口等，如：

	```
	server.port=10240
	spring.application.name=demo-eureka
	
	eureka.instance.hostname=localhost
	# 不向注册中心注册自己
	eureka.client.register-with-eureka=false
	eureka.client.service-url.defaultZone=http://${eureka.instance.hostname}:${server.port}/eureka/
	```

运行效果：
 ![eureka-run](./res/eureka-run.png)