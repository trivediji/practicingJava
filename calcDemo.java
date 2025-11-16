class calc{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }
    void add(double a,double b)
    {
        System.out.println(a+b);
    }
}
public class calcDemo {
    public static void main(String args[])
    {
        calc c1= new calc();
        c1.add(10,20);
        c1.add(12,92,88);
        c1.add(13.099,123.098);
    }
    
}
