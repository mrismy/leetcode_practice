public class Mutation {

    public static void main(String[] args) throws InterruptedException {
        count counter = new count();
        Runnable threadA = ()-> {
                for(int i=0;i<10000;i++){
                    //System.out.println("Thread A: " + i);
                        counter.increment();
                }
            };
        
        Runnable threadB = ()->{
                for(int i=0;i<10000;i++){
                    //System.out.println("Thread B: " + i);
                        counter.increment();
                }
            };
        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);
        t1.start();
        t2.start();
         t1.join();
         t2.join();
        System.out.println("Final Count: " + counter.value());

    }   
}
class count{
    int c=0;
    public synchronized void increment(){
        c++;
    }
    void decrement(){
        c--;
    }
    int value(){
        return c;
    }
}
