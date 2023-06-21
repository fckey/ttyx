# 企业级微服务架构项目——团团优选 
## 一、项目概述 
### 1. 项目介绍
社区团购是真实居住社区内居民团体的一种互联网线上线下购物消费行为，是依托真实社区的一种区域化、小众化、本地化、网络化的团购形式。简而言之，它是依托社区和团长社交关系实现生鲜商品流通的新零售模式。
### 2. 业务流程
从具体模式看，主要围绕平台、团长、用户三个角色展开：

1、团长（如社区宝妈、便利店老板等）创建一个群，提前发布优惠商品的链接供用户购买，团长从中抽取佣金；

2、用户提前一天下单；

3、平台在收集好订单之后，调动供应链，从仓库发货到自提点（团长家或者便利店）；

4、用户前往自提点提货

![有关的用户业务流程图](docs\images\001.png)

### 3. 功能架构 
系统的功能架构主要分为三层 
1、前台会员应用层

2、前台团长应用层

3、基础模块支撑层
![img](docs\images\002.png)

### 4.技术架构

![img](docs\images\003.png)

### 5.核心技术

SpringBoot：简化新Spring应用的初始搭建以及开发过程

SpringCloud：基于Spring Boot实现的云原生应用开发工具，SpringCloud使用的技术：（Spring Cloud Gateway、Spring Cloud OpenFeign、Spring Cloud Alibaba Nacos等）

MyBatis-Plus：持久层框架

Redis：缓存数据库

Redisson：基于redis的Java驻内存数据网格，实现分布式锁

RabbitMQ：消息中间件

ElasticSearch +Kibana: 全文检索服务器 +可视化数据监控

ThreadPoolExecutor：线程池来实现异步操作，提高效率

OSS：文件存储服务

Knife4j（Swagger）：Api接口文档工具

Nginx：负载均衡

MySQL：关系型数据库

微信支付

微信小程序

Docker：容器技术

DockerFile：管理Docker镜像命令文本

-----
# 联系我


sl.fang@qq.com


