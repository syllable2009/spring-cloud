# "spring-cloud" 
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