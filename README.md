# "spring-cloud" 微服务架构就是将一个完整的应用从数据存储开始垂直拆分成多个不同的服务，每个服务都能独立部署、独立维护、独立扩展，服务与服务间通过诸如RESTful API的方式互相调用。
1.创建配置文件存放仓库repo
2.创建一个配置文件服务器server
http://localhost:8888/cloud-config/test/master可验证Config服务器从Git存储库读到了配置文件
获取git上的资源信息遵循如下规则：
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
3.创建一个应用服务client使用分布式配置文件信息
#服务注册与发现
它主要提供的模块包括：服务发现（Eureka），断路器（Hystrix），智能路有（Zuul），客户端负载均衡（Ribbon）等。