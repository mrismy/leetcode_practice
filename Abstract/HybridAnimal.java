
    interface Dog {
      default void sound() {
        System.out.println("Dog: Woof!");
      }
    }

    interface Cat {
      default void sound() {
        System.out.println("Cat: Meow!");
      }
    }

public class HybridAnimal implements Dog, Cat {
  @Override
  public void sound() {
    // You can define custom logic to decide which sound to make
    Dog.super.sound(); // Calls Dog's sound()
    Cat.super.sound();  // Or you can choose to call Cat's sound()
  }

  public static void main(String[] args) {
    HybridAnimal hybrid = new HybridAnimal();
    hybrid.sound(); // Calls Dog's sound
  }
}

