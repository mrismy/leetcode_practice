
class Parent {
    int x = 10;
    public Parent(){
        System.out.println("Parent Constructor");
    }
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    int y = 20;

    public Child(){
        //super();
        System.out.println("Child Constructor");
    }
    void display() {
        System.out.println("Child display");
    }
}

public class example {
public static void main(String[] args) {
    Child c = new Child();
    System.out.println("x: " + c.x); // Accessing inherited variable
    System.out.println("y: " + c.y); // Accessing own variable
    c.show(); // Calling inherited method
    c.display(); // Calling own method
}
}