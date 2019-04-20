package TestUtil;

import org.junit.jupiter.api.Test;
import reflect.*;

public class TestProxy {
    @Test
    public void TestJdkProxyImpl(){
        jdkProxyImpl jdk = new jdkProxyImpl();
        Hello proxy = (Hello)jdk.bind(new HelloImpl());
        proxy.sayHelloWorld();
        System.out.println("-----------");
        proxy.sayHelloMenyaqing();
        System.out.println("-----------");
        System.out.println(proxy.add(3,4));
        System.out.println("-----------");
    }

    @Test
    public void TestCglibProxyImpl() {
        cglibProxyImpl cglib = new cglibProxyImpl();
        ReflectServiceImpl proxy = (ReflectServiceImpl)cglib.getProxy(ReflectServiceImpl2.class);
        proxy.sayHello("门亚清");
    }
}
