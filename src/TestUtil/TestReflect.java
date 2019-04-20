package TestUtil;

import reflect.ReflectServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {

    public Object reflect() {
        Object object = null;
        try {
            object = (ReflectServiceImpl)Class.forName("reflect.ReflectServiceImpl").
                    getConstructor(String.class).newInstance("门亚清");//构造函数参数
            Method method = object.getClass().getMethod("sayHello");
            method.invoke(object);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void main(String[] args) {
        TestReflect t= new TestReflect();
        System.out.println(t.reflect());
    }
}
