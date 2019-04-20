package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class jdkProxyImpl implements InvocationHandler {
    /**
     * 真实对象
     */
    private Object target = null;

    /**
     * 建立代理对象和真实对象的关系
     * @param target 真是对象
     * @return 代理对象
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    /**
     * 实现代理逻辑
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Object object = new Object();
        System.out.println("调用代理对象前的逻辑");
        Object object = method.invoke(target,args);
        System.out.println("调用代理对象后的逻辑");
        return object;
    }
}
