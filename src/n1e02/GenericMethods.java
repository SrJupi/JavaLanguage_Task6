package n1e02;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    public static <T1, T2, T3> void f (T1 test1, T2 test2, T3 test3){
        System.out.println(test1.getClass().toString() + " / " +
                test2.getClass().toString() + " / " +
                test3.getClass().toString());
    }

    public static void main(String[] args) {
        String s = "Hello";
        Integer i = 12345678;
        List<String> list = new ArrayList<>();
        AnimalTest at = new AnimalTest();

        f(s, i, list);
        System.out.println("**********");
        f(list, at, s);
        System.out.println("**********");
        f(i, list, at);
        System.out.println("**********");
        f(at, s, s);

    }
}
