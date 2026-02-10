public class Swap{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping without using a temporary variable
        b= a+b;
        a = b-a;
        b = b-a;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);


    }
}