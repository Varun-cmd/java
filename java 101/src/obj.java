import java.util.Scanner;

class student{
    int roll;
    String name;
    int marks;

}




public class obj {
    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Number of students:");
        n=in.nextInt();
        student[] students =  new student[n];
        student[] s = new   student[n];
        for (int i = 0; i < n; i++) {
            students[i]=s[i];
        }
        for(int i=0;i<n;i++)
        {
            s[i].name=in.nextLine();
            s[i].roll=in.nextInt();
            s[i].marks=in.nextInt();
        }

        for(student i :s)
        {
            System.out.println("name ="+i.name);
            System.out.println("marks ="+i.marks);
            System.out.println("roll ="+i.roll);

        }






    }

}
