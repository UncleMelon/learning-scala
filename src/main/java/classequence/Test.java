package classequence;

public class Test {
    Person person = new Person("Test");
    static {
        System.out.println("test static");
    }

    public Test() {
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new Myclass();
        //test static
        //Myclass static
        //person static
        //person  MyClass
        //person Test
        //test constructor
        //myclass constructor
    }
}


class Person {
    static {
        System.out.println("person static");
    }

    public Person(String str) {
        System.out.println("person " + str);
    }
}


class Myclass extends Test {
    static Person person = new Person("Myclass");

    static {
        System.out.println("Myclass static");
    }

    public Myclass() {
        System.out.println("myclass constructor");
    }
}