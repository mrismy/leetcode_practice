public class Main{
    public static void main(String[] args) {
        Child c = new Child();
    }
} 
    
class Parent {
   int x=10;
    public Parent() {
        System.out.println("1. Parent Constructor Called");
    }
    public Parent(int x) {
        System.out.println("Parent Parameterized Constructor with value: " + x);
    }
}

class Child extends Parent {
    // Constructor A: Takes one argument
    public Child(int age) {
        super(5); // 2. Explicit or Implicit call to Parent
        

        System.out.println("2. Child Constructor with Age: " + age);
    }
    public Child(int age, String name) {
        this(age); // Calls Constructor A
        System.out.println(this.x);
        System.out.println("3. Child Constructor with Name: " + name);
    }
    // Constructor B: Default (no arguments)
    public Child() {
        this(10,"rismy"); // 3. Calls Constructor A (Look Sideways)
        System.out.println("4. Child Default Constructor");
    }
}



