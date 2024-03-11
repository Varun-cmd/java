package threads;
 class  counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class Race_condition  {
    public static void main(String[] args) {
        counter c = new counter();
        Runnable obj1 = ()->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };


        Runnable obj2 = ()->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };


        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);          // waits till the thread are complete
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(c.count);
    }
}
