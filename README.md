# dubbo
spring boot+dubbo项目

在dubbo项目的github地址中下载2.5.x版本的master代码，在idea中打开，使用tomcat添加war包部署，启动，发现dubbo-admin是2.5.10版本，故2.5.4可能在tomcat8+jdk1.8中使用不了。
打好war包后可放入tomcat启动，使用地址localhost:端口号访问就可以看到service中有发布的服务。

1.先启动mysql的服务，新建springdb的数据库，增加user表。
2.启动zookeeper的zKServer.cmd。
3.启动provider的main方法。
4.启动customer的main方法。
5.启动dubbo-admin的tomcat服务。
6.进入dubbo-admin控制界面查看服务是否发布成功。
