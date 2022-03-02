package n1e03;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    //T3 not parameterized
    public static <T1 extends AnimalTest, T2 extends Number, T3> void f (T1 test1, T2 test2, T3 test3){
        System.out.println(test1.getClass().getName() + " / " +
                test2.getClass().getName() + " / " +
                test3.getClass().getName());
    }

    public static void main(String[] args) {
        String s = "Hello";
        Integer i = 12345678;
        Float fl = 1234.5678f;
        Double d = 1234.5678;
        List<String> list = new ArrayList<>();
        AnimalTest at = new AnimalTest();

        // method can not be called
        //f(s, i, list);

        // method can not be called
        //f(list, at, s);

        // method can not be called
        //f(i, list, at);


        f(at, i, s);
        System.out.println("**********");
        f(at, fl, i);
        System.out.println("**********");
        f(at, d, list);

    }
}
