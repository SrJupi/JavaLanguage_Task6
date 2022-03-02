package n1e04;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    //T3 not parameterized
    public static <T> void f (List<T> listOfTs){
        for (T obj :
                listOfTs) {
            System.out.print(obj.toString() + " ");
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Test");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(34);
        integerList.add(56);
        integerList.add(78);

        List<AnimalTest> animalClassList = new ArrayList<>();
        animalClassList.add(new AnimalTest());
        animalClassList.add(new AnimalTest());
        animalClassList.add(new AnimalTest());

        System.out.println("Printing: " + stringList.toString());
        f(stringList);
        System.out.println("\n****************");

        System.out.println("Printing: " + integerList.toString());
        f(integerList);
        System.out.println("\n****************");

        System.out.println("Printing: " + animalClassList.toString());
        f(animalClassList);
        System.out.println("\n****************");


    }
}
