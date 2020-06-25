# auth-center
1.登录方式：
post:
http://localhost:8081/oauth/token?grant_type=password&username=tang&password=123&scope=backend&client_secret=secret&client_id=clientId

2.返回token，放到请求头访问：
获取用户信息:
http://localhost:8081/oauth/userInfo

3.刷新token
http://localhost:8081/oauth/token?grant_type=refresh_token&refresh_token=xxxx&client_secret=secret&client_id=clientId

必须的字段:
- grant_type:
- refresh_token:
- client_secret:
- client_id:

https://blog.csdn.net/bluuusea/article/details/80284458

# app-gateway
网关方式访问：

登录:
http://localhost:8888/api/oauth/token?grant_type=password&password=123&scope=backend&client_secret=secret&client_id=clientId

获取用户信息:
http://localhost:8888/api/oauth/userInfo
