package exceptions;

class employees{
    String name;
    private static int empID=1;
    int ID;
    int age;
    employees(String n, int age){
        this.age=age;
        this.name =n;
        this.ID=empID++;
    }

    public void disp()
    {
        System.out.println("Name:"+this.name+"\nEmp ID:"+this.ID);
        System.out.println("Next id is: "+empID);
    }

    @Override
    protected void finalize()
    {
        empID--;
    }


}
public class Garbage_Collection {

    public static void main(String[] args) {
        employees e3 = new employees("ram",22);
        employees e2 = new employees("ravi",23);
        employees e1 = new employees("varun",21);
        e3.disp();
        e2.disp();
        e1.disp();

        { // interns objects are removed manually
            employees i1 = new employees("alpha", 33);
            employees i2 = new employees("beta", 22);
            employees i3 = new employees("gamma", 11);

            i1.disp();
            i2.disp();
            i3.disp();
            i1=i2=i3=null;
            System.gc();
            System.runFinalization();
            e3.disp();      // empID is reduced based on the removal of intern data
        }







    }







}
