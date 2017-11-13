1，rpc 和 domain 是最底层的，只能被别的module 依赖
   rpc定义接口，需要depoly到nexus，供别人依赖引用，
   domain是dao层面，包括数据库实体类，和mybatis需要的mapper,mapper.xml
   
2，soa需要依赖domain和rpc，作为接口的实现，这个三个module是必须的

3，api不是必须的，如果你的服务需要对外（出内网）提供rest服务，则需要此模块，通常
API需要依赖rpc，消费rpc服务

4，web不是必须的必须的，通常如果你的项目有后台管理页面，则需要此模块。通常web需要依赖
rpc，消费rpc服务
5，soa是provider，api，web都是consumer

# TODO
* .gitignore不能被复制过去