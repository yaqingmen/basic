## 反射技术
###相关代码
* reflect.ReflectServiceImpl 
创建一个简单类，含有一个有参构造函数和一个方法
* TestUtil.TestReflect 
该类中的reflect()方法用来通过反射创建类实例和调用方法

1.通过反射构建对象
```$xslt
 object = (ReflectServiceImpl)Class.forName("reflect.ReflectServiceImpl").
         getConstructor(String.class).newInstance("门亚清");//构造函数参数
```
2.反射方法
```$xslt
    Method method = object.getClass().getMethod("sayHello");
    method.invoke(object);
```