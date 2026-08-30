package gettersandsetters;

public class GetterSetterExample {

    // Private variables
    private int id;
    private String name;

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        GetterSetterExample obj = new GetterSetterExample();

        // Setting values
        obj.setId(101);
        obj.setName("Bindu");

        // Getting values
        System.out.println("Student ID: " + obj.getId());
        System.out.println("Student Name: " + obj.getName());
    }
}