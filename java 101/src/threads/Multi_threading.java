package threads;

class car implements Runnable{

    @Override
    public void run() {
        System.out.println("Running");
    }
}




public class Multi_threading {
    public static void main(String[] args) {
        car c1 = new car();
        Thread t1 = new Thread(c1);
        t1.start();
        try {
            t1.wait(255);

        } catch (Exception ignored) {
        }
        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("Inside anonymous class ");
                }catch (Exception ignored){}
            }
        };
        obj1.run();

        Thread t2 = new Thread(() -> System.out.println("Inside runnable"));
        t2.start();



    }
}
