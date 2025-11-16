import java.util.*;
class area{
    int length;
    int breadth;
    area()
    {
        
    }
    area(int a,int b)
    {
        this.length=a;
        this.breadth=b;
    }
    void arear(){
        int ar=length*breadth;
        System.out.println("Area is"+ar);
    }
}
public class Usingconstructor {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        area a1=new area(a,b);
        a1.arear();
        area a2=new area();
        a2.arear();
    }
    
}
