package n2e01;

public class Implementer implements MyInterface{
    @Override
    public void method1() {
        System.out.println("Method 1!");
    }

    @Override
    public void method2() {
        System.out.println("Method 2!");

    }

    public void method3(){
        System.out.println("Method 3!");
    }
}
