package exceptions;

public class custom_exception extends Exception {
    static String[] cars = {"car1","car2","car3"};
    static int[] speed ={80,50,250};

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println(cars[i]+" :"+speed[i]);
        }
        try {
            for (int i = 0; i < 3; i++) {
                   if (speed[i] > 100)
                       System.out.println(cars[i]+ "selected");
                   else
                         throw new custom_exception();
            }
        }
        catch (custom_exception e)
        {
            System.out.println("Not fast enough, moving to next car!");
        }

    }
}
