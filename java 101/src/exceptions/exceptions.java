package exceptions;

public class exceptions {
    public static void main(String[] args) {
    String name=null;

        try {
//            int x= 100/0;
            int len = name.length();
        }


        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("program ends successfully!");

    }

}
