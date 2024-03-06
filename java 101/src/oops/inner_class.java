package oops;

class a{
    public void show()
    {
        System.out.println("a class showww");
    }
     class b{
        public void config(){
            System.out.println("B config");
        }
    }
   static class c{
        public void config(){
            System.out.println("C config");
        }
    }
}
 abstract class  test{
    abstract void disp();

}



public class inner_class {
    public static void main(String[] args) {
        a class_a_object = new a();
        class_a_object.show();
        a.b new_inner_object= class_a_object.new b();   // if the class is non static
        new_inner_object.config();
        a.c new_c_object = new a.c();                   // class is satatic so we dont need parent obj to creater innerobject.

        a obj = new a(){
          public void show(){
              System.out.println("Updated showww!!!!");  // anonymous class
          }
        };
        test t = new test() {
            void disp(){
                System.out.println("abstract class display!");
            }
        };




    }
}
