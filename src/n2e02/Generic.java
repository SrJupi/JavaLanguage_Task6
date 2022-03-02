package n2e02;

public class Generic {

    public static <T extends Interface1> void method1(T obj){
        obj.interface1method();
    }

    public static <T extends Interface2> void method2(T obj){
        obj.interface2method();
    }

    public static void main(String[] args) {
        //DoubleImplementer instance
        DoubleImplementer doubleImplementer = new DoubleImplementer();

        //Call method1 with doubleImplementer class as argument
        System.out.print("Call method 1 from Generic class: ");
        method1(doubleImplementer);

        //Call method2 with doubleImplementer class as argument
        System.out.print("Call method 2 from Generic class: ");
        method2(doubleImplementer);
    }
}
