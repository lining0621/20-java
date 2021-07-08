# 项目说明

## 技术框架

## 环境部署：
- mysql(业务数据库)
```shell
    apt-get -y update
    apt-get -y install mysql-server
    mysql_secure_installation
    mysql --version
    systemctl status mysql.service    
```

- redis(缓存数据库)
```shell
    apt-get -y install redis-server
    systemctl start redis-server
    echo "/打开etc/redis/redis.conf，并修改端口、密码和访问地址"  
    echo "登录：redis-cli -h 127.0.0.1 -p 6379 -a '123456'"
```

- nacos(注册、发现、配置)
```shell
    echo "数据库初始化：mysql -uroot -p nacos < /software/tool/nacos/conf/nacos-mysql.sql"
    echo "修改数据库连接信息：nacos/conf/application.properties"
    echo "cd /software/tool/nacos/bin && sh nacos-startup.sh -m standalone"
```

- torna(接口文档)
```shell
    echo "数据库初始化：mysql -uroot -p torna < torna-1.9.0/nacos-mysql.sql"
    echo "修改数据库连接信息：torna-1.9.0/application.properties"
    echo "cd /software/tool/torna-1.9.0 && sh torna-startup.sh"
```

## 模块介绍
- demo-admin(服务监管)
```shell

```
- demo-account(服务监管)
```shell

```
- demo-report(服务监管)
```shell

```
- demo-sample(服务监管)
```shell

```