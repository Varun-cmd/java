class parent{
    void disp1()
    {
        System.out.println("parent called!");
    }
}
class child extends parent{
    void disp2(){
        System.out.println("child called");
    }
}

public class typecasting {
    public static void main(String[] args) {
        parent a = new child();
        a.disp1();                      // upcasting

        child b = (child)a;
        b.disp2();                      // downcasting

    }

}
