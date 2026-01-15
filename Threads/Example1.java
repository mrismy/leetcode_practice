// public class Example1 {

//     public static void main(String[] args) {
//         A threadA = new A();
//         B threadB = new B();
//         Thread t1 = new Thread(threadA);
//         Thread t2 = new Thread(threadB);
//         t1.start();
//         t2.start();

//     }
// }
// class A implements Runnable{
//     @Override
//     public void run(){
//         for(int i=0;i<50;i++){
//             System.out.println("Thread A: " + i);
//             try {
//                 Thread.sleep(500); // Sleep for 500 milliseconds
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B implements Runnable{
//     @Override
//     public void run(){
//         for(int i=0;i<50;i++){
//             System.out.println("Thread B: " + i);
//             try {
//                 Thread.sleep(700); // Sleep for 700 milliseconds
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Example1 {

    public static void main(String[] args) {
        Runnable threadA = ()-> {
                for(int i=0;i<50;i++){
                    System.out.println("Thread A: " + i);
                    try {
                        Thread.sleep(500); // Sleep for 500 milliseconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        
        Runnable threadB = ()->{
                for(int i=0;i<50;i++){
                    System.out.println("Thread B: " + i);
                    try {
                        Thread.sleep(700); // Sleep for 700 milliseconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);
        t1.start();
        t2.start();

    }
}


