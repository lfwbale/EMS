# EMS
## 员工管理系统

* ##### 涉及技术
    * 项目通过**SpringBoot**、**Mybatis**以及**Themleaf**实现了用户对员工信息的一系列管理操作。
* ##### 功能介绍
    * 新用户首先需要在系统中提交用户信息进行注册，注册界面实现了自动生成验证码的功能。用户成功 注册后登登系统可以对员工信息进行管理，功能包括:添加员工、删除员工和修改员工信息。
* ##### 数据库表
    * 用户信息与员工信息分别保存在MySQL数据库的两张表中。
    * 用户信息包括 id username realtime password sex
    * 员工信息包括 id name salary age bir
* ##### 运行效果示例图
* ###### 用户登录界面
![1fd9b06f001035de948bbf6fe9933ce3.png](https://github.com/lfwbale/EMS/blob/master/images/登录.png)
* ###### 员工管理界面
![02c4674e638eb4fe840dce2344cf8fd3.png](https://github.com/lfwbale/EMS/blob/master/images/员工管理.png)
* ###### 增加员工信息
![3e3f0e5326d3bdbd7289b8dcbcd4f491.png](https://github.com/lfwbale/EMS/blob/master/images/增加员工信息.png)
* ###### 修改员工信息
![287f7b45580afd460d7771381ea423e3.png](https://github.com/lfwbale/EMS/blob/master/images/更新信息.png)
* ###### 用户注册
![9d527b34d50c164d040a7db47501bd40.png](https://github.com/lfwbale/EMS/blob/master/images/用户注册.png)
* ##### 项目导入说明
    * 用户信息与员工信息分别保存在MySQL数据库的两张表中。可通过 **src/main/resources/com/example/sql**路径下**init.sql**文件直接创建
    * **src/main/resources/application.properties文件中spring.datasource.url|username|password**需要根据修改为本地数据库相关参数
    * 程序通过 **EmsThymeleafApplication.java** 的main函数启动，然后可以访问 **localhost:端口号/ems/index** 页面
