package inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        System.out.println("----- Single Inheritance -----");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\n----- Multilevel Inheritance -----");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println("\n----- Hierarchical Inheritance -----");
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}