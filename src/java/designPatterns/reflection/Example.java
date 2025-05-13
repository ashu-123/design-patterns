package reflection;

public class Example {

    private String name;

    public Example() {
    }

    public Example(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Example setName(String name) {
        this.name = name;
        return this;
    }

    public static void sayName() {
        System.out.println("John");
    }
}
