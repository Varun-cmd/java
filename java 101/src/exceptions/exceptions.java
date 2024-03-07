package exceptions;

import java.util.Scanner;

class customException extends Exception{
    public customException(String exp){
        super  (exp);
    }

}


public class exceptions {
    public static void main(String[] args) {
    String name="varun";
        System.out.println("Enter a number ");
        Scanner in = new Scanner(System.in);
        int i=in.nextInt();
        try {
            int x= i%2;
            int len = name.length();
            if (x!=0)
              throw new ArithmeticException();          // forcefully throws an exception.
            else
                throw  new customException("Even number");  // custom exception handling
        }


        catch(ArithmeticException e)
        {
            System.out.println("inside arithmetic exception");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("program ends successfully!");

    }

}
