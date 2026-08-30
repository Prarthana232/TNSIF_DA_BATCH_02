package functionalinterface;

@FunctionalInterface
interface Message {
    void display(String name);
}

@FunctionalInterface
interface Addition {
    void add(int a, int b);
}

public class parameterized {

    public static void main(String[] args) {

        // Functional Interface with One Parameter
        Message msg = (name) -> {
            System.out.println("Welcome " + name);
        };

        msg.display("Bindu");

        // Functional Interface with Two Parameters
        Addition obj = (a, b) -> {
            System.out.println("Sum = " + (a + b));
        };

        obj.add(10, 20);
    }
}