public class tryquest {
    public static void main(String []args)
{
    int a=10;
    int b=8;
    int value[]={1,2,3,4};
    String n="OM";
    try
    {
        System.out.println(a/b);
        System.out.println(value[2]);
        System.out.println(n.length());
    }
    catch (Exception e)
    {
        System.out.print("Error!= "+e);

    }
    finally
    {
        System.out.println("This is the end");
    }
    System.out.println("this is executed");
}
    
}
