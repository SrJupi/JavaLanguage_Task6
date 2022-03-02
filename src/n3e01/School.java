package n3e01;

import java.util.List;

public class School <T> {
    private T t;

    public School(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void printSchool(){
        System.out.println("Printing School:");
        System.out.println(t.toString());
    }
}
