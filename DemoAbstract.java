abstract class student{
    int rollNo=2345;
    int regNo=234567;
    abstract void course();
}
class kiitian extends student
{
    void course()
    {
        System.out.println("roll no. is"+rollNo);
        System.out.println("Registration No. is "+regNo);
    }
}
public class DemoAbstract {
    public static void main(String args[])
    {
        kiitian kiit=new kiitian();
        kiit.course();
    }
    
}
