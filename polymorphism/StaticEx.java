public class StaticEx {
    public static void main(String[] args) {
        A.show(); 
        B.show(); 

        B aRef = new B();
        aRef.show(); 
    }
}
class A {
    static void show() {
        System.out.println("A");
    }
}

class B extends A {
    static void show() {
        System.out.println("B");
    }
}

