package functionalinterface;

@FunctionalInterface
interface GreetingDemo {
    void sayHello();
}

// Traditional Implementation Class
class GreetingImpl implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("Hello from Traditional Method");
    }
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Traditional Way
        System.out.println("Traditional Method:");
        Greeting obj1 = new GreetingImpl();
        obj1.sayHello();

        // Lambda Expression
        System.out.println("\nLambda Expression:");
        Greeting obj2 = () -> {
            System.out.println("Hello from Lambda Expression");
        };

        obj2.sayHello();
    }
}