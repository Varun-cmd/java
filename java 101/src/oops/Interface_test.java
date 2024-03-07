package oops;

interface computer{
    abstract void code();

}
class lap implements computer{
    public void code(){
        System.out.println("coding in laptop");
    }
}
class pc implements computer{
    public void code(){
        System.out.println("coding in PC ");
    }
}
class dev{
    public void devapp(computer c1){
        c1.code();
    }
}
class interface_test{
    public static void main(String[] args) {
        dev d1 = new dev();
        pc p1 = new pc();
        d1.devapp(p1);
    }
}