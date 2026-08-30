package functionalinterface;

@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Unparameterized {

    public static void main(String[] args) {

        Greeting greet = () -> {
            System.out.println("Hello, Welcome to Functional Interface");
        };

        greet.sayHello();
    }
}