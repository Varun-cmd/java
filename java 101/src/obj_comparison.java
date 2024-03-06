class laptop{
    String brand;
    int price;
    laptop(int p,String b)
    {
        this.brand=b;
        this.price=p;
    }
    public boolean isequal(laptop l1){
        if((this.price==l1.price)&&(this.brand.equals(l1.brand)))
            return true;
        return false;
    }

}


class obj_comparison{
    public static void main(String[] args) {

        laptop lap1 = new laptop(999,"apple");
        laptop lap2 = new laptop(999,"apple");
        System.out.println(lap1.isequal(lap2));

    }
}