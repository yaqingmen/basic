package TestUtil;

import org.junit.jupiter.api.Test;
import reflect.Hello;
import reflect.HelloImpl;
import reflect.jdkProxyImpl;

public class TestJdkProxyImpl {
    @Test
    public void test(){
        jdkProxyImpl jdk = new jdkProxyImpl();
        Hello proxy = (Hello)jdk.bind(new HelloImpl());
        proxy.sayHelloWorld();
        System.out.println("-----------");
        proxy.sayHelloMenyaqing();
        System.out.println("-----------");
        System.out.println(proxy.add(3,4));
        System.out.println("-----------");
    }
}
