## 动态代理
### 1. jdk动态代理
#### 实现代码
* Hello 接口，定义无返回值sayHelloWorld(),sayHellomenyaqing(),和有返回值
* HelloImpl Hello接口的实现类
* jdkProxyImpl 动态代理 实现InvocationHandler接口和invoke方法
#### 测试代码
* TestJdkProxyImpl 主要分三步：

1 . 创建类的对象
```$xslt
    jdkProxyImpl jdk = new jdkProxyImpl();
```
2 . 创建动态代理对象
```$xslt
    Hello proxy = (Hello)jdk.bind(new HelloImpl());
```
 3 . 直接用动态代理对象调用真实对象的方法
```$xslt
    proxy.sayHelloWorld();
    proxy.sayHelloMenyaqing();
    proxy.add(3,4);
```
#### 对于第三点要注意：
* 只有在接口中定义，且在实现类中实现的方法才能被动态代理对象直接调用，否则会报错没有该方法。

   
    