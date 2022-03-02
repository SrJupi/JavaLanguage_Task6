package n1e01;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "!";

        NoGenericMethods noGenericMethods = new NoGenericMethods(s1, s2, s3);
        System.out.println(noGenericMethods);

        noGenericMethods = new NoGenericMethods(s2, s3, s1);
        System.out.println(noGenericMethods);

        noGenericMethods = new NoGenericMethods(s3, s1, s2);
        System.out.println(noGenericMethods);

        noGenericMethods = new NoGenericMethods(s1, s3, s2);
        System.out.println(noGenericMethods);

        noGenericMethods = new NoGenericMethods(s3,s2, s1);
        System.out.println(noGenericMethods);

        noGenericMethods = new NoGenericMethods(s2, s1, s3);
        System.out.println(noGenericMethods);



    }
}
