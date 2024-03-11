package threads;
class a extends Thread{
    public void run()   {
        for (int i = 0; i < 5; i++) {
            System.out.println("showingggg AAAA!!");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}

class b extends Thread{

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("showingggg BBBBB!!");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class x extends b{

}



public class demo {
    public static void main(String[] args) throws InterruptedException {
            a test=  new a();
            b test2= new b();
            Runnable Runnable= () ->
            {
                for (int i = 0; i < 5; i++) {
                    System.out.println("showingggg RUNNABLEEEE!!");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };

        Thread t1 = new Thread(Runnable);       // assigning threads manually to objects

            test2.setPriority(Thread.MAX_PRIORITY);
            test.start();
            t1.start();
            test2.start();


    }


}
