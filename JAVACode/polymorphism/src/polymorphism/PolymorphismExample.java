package polymorphism;

// Method Overloading (Compile-time Polymorphism)
class Addition {

    void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }
}

// Method Overriding (Run-time Polymorphism)
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {

        // Compile-time Polymorphism
        System.out.println("----- Method Overloading -----");
        Addition obj = new Addition();
        obj.add(10, 20);
        obj.add(10, 20, 30);

        // Run-time Polymorphism
        System.out.println("\n----- Method Overriding -----");
        Animal a = new Dog();
        a.sound();
    }
}