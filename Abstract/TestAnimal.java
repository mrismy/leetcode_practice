interface Animal {
  void eat(); // Abstract method
  default void sound() {
    System.out.println("This is a default animal sound.");
  }
}

class Dog implements Animal {
  @Override
  public void eat() {
    System.out.println("Dog is eating.");
  }
  @Override
  public void sound() {
    System.out.println("Dog barks.");
  }
}

public class TestAnimal{
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat(); // Output: Dog is eating.
    dog.sound(); // Output: Dog barks.
  }
}

