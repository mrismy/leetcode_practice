import java.util.ArrayList;
abstract class Test1 {
    int num=10;
     abstract void display();
     Test1(int num){
        System.out.println("Constructor of abstract class with parameter: " + num);
     }
    //   void show(){
    //     System.out.println("This is a concrete method in an abstract class.");
    // }
}

 interface Test2 {
    int num=100;
    void print();
    default void defaultMethod() {
        System.out.println("This is a default method in an interface.");
    }
    static void staticMethod() {
        System.out.println("This is a static method in an interface.");
    }
}

class Test3 implements Test2 {
    //num=200; // This will cause a compilation error because interface fields are final by default
    public void print() {
        System.out.println("Implementation of abstract method print()." + num);
    }
    public void defaultMethod() {
        System.out.println("Overridden default method in implementing class.");
    }
    public void show() {
        System.out.println("This is a concrete method in an abstract class."+num);
    }
}
class Demo extends Test1{
    Demo() {
        super(5);
    }
    public void display() {
        //num=100;
        System.out.println("Implementation of abstract method display()."+num);
    }
    public void show() {
        System.out.println("This is a concrete method in an abstract class."+num);
    }
}
public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo demo1 = new Demo();
        demo.display();
        demo.show();
        System.out.println(demo);
        System.out.println("----------");
        Test2 test = new Test3();
        System.out.println(demo.equals(demo1));
        test.defaultMethod();
        test.print();
        test.defaultMethod();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        float a=115.8524f;
        int e=(int)a;
        System.out.println(e);
        int b=256;
        long d=b;
        System.out.println(d);
        byte c=(byte)b;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        String str="Hello";
        String rev="Hello";
        System.out.println(str==rev);
        System.out.println(System.identityHashCode(str));
        str=str.concat("World");
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb.capacity());
        System.out.println(System.identityHashCode(sb));
        sb=sb.append("World");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());

    }

    public Test() {
    }
}