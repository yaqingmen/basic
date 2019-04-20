package reflect;

public class ReflectServiceImpl {
    public String name;

    public ReflectServiceImpl(String name) {
        this.name = name;
        System.out.println("有一个参数的构造函数被调用了。。。");
    }
    public void sayHello(){
        System.out.println("你好："+name);
    }

}
