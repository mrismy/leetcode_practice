public class Example {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        threadA.start();
        threadB.start();
    }
}
class A extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Thread B: " + i);
            try {
                Thread.sleep(700); // Sleep for 700 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}