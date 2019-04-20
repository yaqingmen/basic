package reflect;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class cglibProxyImpl implements MethodInterceptor {

    /**
     * 得到代理对象
     * @param cls 被代理的类
     * @return 代理对象
     */
    public Object getProxy(Class cls) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 代理逻辑
     * @param o   代理对象
     * @param method 方法
     * @param objects 方法参数
     * @param methodProxy 方法代理
     * @return 代理逻辑返回
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("动态代理之前的逻辑");
        Object object = methodProxy.invokeSuper(o,objects);
        System.out.println("动态代理之后的逻辑");
        return object;
    }
}
