package reflect;

public class ReflectServiceImpl {

    private  String name;
    public ReflectServiceImpl(String name) {
        this.name = name;
        System.out.println(name);
    }
    public void sayHello(String name){
        System.out.println("你好：" + name);
    }

}
