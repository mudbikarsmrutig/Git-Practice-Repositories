package gitpractice;

public class test1
{
    public void m1()
    {
        System.out.println("m1 method running from red");
    }
    public static void main(String[] args)
    {

        System.out.println("test 1 running");
        System.out.println("Test 1 running from ryzon");
        System.out.println("Changes from red branch");
        System.out.println("Chanes from green branch  ");
        System.out.println(" new new changes from red");
        System.out.println(" new new changes from green");
        System.out.println("print from green branch");

       test1 t1=new test1();
       t1.m1();
        

        test1 t1=new test1();
        t1.m2();

    }
    public void m2()
    {
        System.out.println("m2 running from green");
        System.out.println("changes from red");
        System.out.println("changes from green");
        System.out.println("change from red branch");
        System.out.println("changes from red");
    }
}
