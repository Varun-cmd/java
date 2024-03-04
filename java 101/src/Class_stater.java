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


    }

}
