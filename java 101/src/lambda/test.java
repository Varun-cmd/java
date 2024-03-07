package lambda;


interface A{
    public void show();
}

interface math{
    public int add(int i,int j);
}





public class test {
    public static void main(String[] args) {
        A obj = new A(){
            public void show()
            {
                System.out.println("inside interface");
            }
        };
        A obj2 = ()->{
            System.out.println("inside  A using lambda functions");
        };
        obj.show();
        obj2.show();

        math m = (i,j)->i+j;        // lambda function to accecpt and return int vals

        int res = m.add(5,5);
        System.out.println("interface math : sum val = "+res);



    }

}
