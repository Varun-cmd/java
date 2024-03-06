import java.util.Scanner;

class studnet{
    int roll;
    String name;
    int marks;

}




public class objects {
    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Number of students:");
        n=in.nextInt();
        studnet[] s =  new studnet[n];
        for(int i=0;i<n;i++)
        {
            s[i].name=in.nextLine();
            s[i].roll=in.nextInt();
            s[i].marks=in.nextInt();
        }

        for(studnet i :s)
        {
            System.out.println("name ="+i.name);
            System.out.println("marks ="+i.marks);
            System.out.println("roll ="+i.roll);

        }






    }

}
