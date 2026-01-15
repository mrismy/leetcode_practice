class Parent {
    String name;

    // Parent constructor now requires a String
    public Parent(String name) {
        this.name = name;
        System.out.println("Parent Constructor: " + name);
    }
}

class Child extends Parent {
    int age;

    public Child(String name, int age) {
        super(name); // MANDATORY: Must pass the name to the Parent constructor
        this.age = age;
        System.out.println("Child Constructor: " + age);
    }
}
class example_1 {
    public static void main(String[] args) {
        Child c = new Child("John", 10);
        System.out.println("Name: " + c.name); // Accessing inherited variable
        System.out.println("Age: " + c.age);   // Accessing own variable
    }
}