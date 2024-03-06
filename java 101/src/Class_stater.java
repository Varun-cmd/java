import java.util.Scanner;

class calculator {

    public boolean calculate(int a,int b)
    {
        System.out.println(a+b);
        System.out.println(a-b);
        return true;
    }


}
public class Class_stater {

    public static void main(String[] args) {

        System.out.println("hello");
        calculator a = new calculator();
        if(a.calculate(6,6))
            System.out.println("success");


        // multi Dimension arrays    JAGGED arrays
        int[][] arr= new int[3][];
        arr[0]= new int[3];
        arr[1]= new int[2];
        arr[2]= new int[3];


        System.out.println("Enter array elements");

        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
                arr[i][j]=in.nextInt();

        }
        System.out.print("\n 2-d Array\n");
        for (int[] ints : arr) {
            for (int anInt : ints) System.out.print(anInt);
            System.out.println();
        }




    }

}
