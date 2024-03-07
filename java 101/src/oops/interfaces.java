package oops;
interface A{
    String  name= "varun";    // variables inside an interface are static and final
    int age = 21;

    void show_age();          // methods are strictly public abstract
    void show_name();
}

interface B{
    void run();

}

class c implements A,B{                     // class can implement multiple interfaces.

    public void show_name()
    {
        System.out.println(name);
    }
    public void show_age(){
        System.out.println(age);
    }

    public void run(){
        System.out.println("Executing");
    }
}



public class interfaces {

    public static void main(String[] args) {
        A obj = new c();
        c obj2 = new c();
        obj2.run();



    }

}

// class -> class extends
// interface -> interface extends
// interface -> class "implements"