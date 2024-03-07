package oops;

enum phones{
    apple(1200), samsung(999), nokia(599), mi(250);

    private int price;
    phones(int i) {
        this.price=i;
    }
    public void printval()
    {
        System.out.println(this.price);
    }
}

public class enums {
    public static void main(String[] args) {
        phones s ;
        s= phones.apple;
        s.printval();

        for(phones p:phones.values()) {
            System.out.print("\n"+p+" ");
            p.printval();
        }
    }

}
