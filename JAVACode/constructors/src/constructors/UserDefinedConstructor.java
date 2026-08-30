package constructors;

public class UserDefinedConstructor {

    int id;
    String name;

    UserDefinedConstructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        UserDefinedConstructor obj = new UserDefinedConstructor(101, "Bindu");
        obj.display();
    }
}