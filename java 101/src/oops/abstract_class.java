package oops;

abstract class  phone {
    public void call() {
        System.out.println("callinggg");
    }
    public abstract void camera();
}
class smartphone extends phone{
    public void camera(){
        System.out.println("take a picture...");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        smartphone s1= new smartphone();
        s1.call();
        s1.camera();
    }
}
