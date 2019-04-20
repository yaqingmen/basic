package reflect;

public class HelloImpl implements Hello {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");

    }

    @Override
    public void sayHelloMenyaqing() {
        System.out.println("hello menyaqing!");

    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
