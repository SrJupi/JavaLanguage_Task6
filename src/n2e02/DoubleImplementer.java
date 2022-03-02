package n2e02;

public class DoubleImplementer implements Interface1, Interface2{

    @Override
    public void interface1method() {
        System.out.println("Interface 1 method!");
    }

    @Override
    public void interface2method() {
        System.out.println("Interface 2 method!");

    }
}
