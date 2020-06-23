1.登录方式：
http://localhost:8081/oauth/token?grant_type=password&username=tang&password=123&scope=backend&client_secret=secret&client_id=clientId

2.返回token，放到请求头访问：

http://localhost:8082/order/get