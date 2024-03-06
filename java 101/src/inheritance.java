import java.util.Scanner;

class vehicles{
    public int wheels;
    public double price;
}
class cars extends  vehicles{
    public String brand;

    cars(String b,double p){
        this.brand=b;
        this.wheels=4;
        this.price=p;

    }
    public void show()
    {
        System.out.println("\n Brand:"+this.brand+"\n Wheels "+this.wheels+"\n PRICE "+super.price);
    }
}

class bike extends vehicles{
    String brand;
    int gears;
    bike(String brand,int g,double p)
    {
        this.brand=brand;
        this.gears=g;
        this.price=p;

    }
    public void show()
    {
        System.out.println("\n Brand:"+this.brand+"\n Wheels "+this.wheels+"\n PRICE "+super.price+"\n gear:"+this.gears);
    }

}



public class inheritance {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String choice=in.nextLine();
        if (choice.equals("car")) {
            System.out.println("Enter number of cars");
            int n =in.nextInt();
            in.nextLine();
            cars[] c= new cars[n];
            for (int i = 0; i < n; i++) {
            System.out.println("car brand:");
            String brand = in.nextLine();
            System.out.println("car price:");
            double p = in.nextDouble();
            in.nextLine();
            c[i]=new cars(brand, p);
            }
            for (int i = 0; i < n; i++) {
                c[i].show();
            }


        }
        else{
            System.out.println("Enter number of bikes:");
            int n=in.nextInt();
            in.nextLine();
            bike[] b=new bike[n];
            for (int i = 0; i < n; i++) {
                System.out.println("bike brand:");
                String brand = in.nextLine();
                System.out.println("bike price:");
                double p = in.nextDouble();
                System.out.println("bike gears:");
                int g = in.nextInt();
                in.nextLine();
                b[i] = new bike(brand, g, p);
            }
            for (int i = 0; i < n; i++) {
                b[i].show();
            }

        }


    }

}
