package n2e01;

public class Generic {

    public static <T extends MyInterface >void methodGeneric (T obj){
        obj.method1();
        obj.method2();
    }

    public static void main(String[] args) {
        methodGeneric(new Implementer());
    }
}
