package n3e01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generic {
    public static void method1 (School<List<?>> schoolContainer){
        System.out.println("Printing method1: ");
        //can call School methods:
        schoolContainer.printSchool();

        //can not call list methods on schoolContainer
        //schoolContainer.add.....

        //can extract list and use it
        List list = schoolContainer.getT();
        list.add(30);

        schoolContainer.printSchool();



    }

    public static void method2 (List<School<?>> listContainer){
        System.out.println("Printing method2: ");
        //can use list methods
        listContainer.add(new School<>(60));

        //can not use school method on listContainer
        //listContainer.printSchool...

        //can use school methods getting each school object in foreach loop
        for (School obj :
                listContainer) {
            System.out.println(obj.getT());
        }





    }

    public static void main(String[] args) {
        // Create School container with a list inside
        School <List<?>> schoolList = new School<List<?>>(
                new ArrayList<>(Arrays.asList("Test1", "Test2", "Test3")));
        method1(schoolList);

        // Create List with School containers inside
        List<School<?>> listList = new ArrayList<>();
        listList.add(new School<>("Test"));
        listList.add(new School<>("Test2"));
        listList.add(new School<>("Test3"));

        method2(listList);


    }
}
