import java.util.*;
class rectangle 
{
    int length;
    int width;
    void find_Area(int a,int b)
    {
        this.length=a;
        this.width=b;
        System.out.println("the area of the recatangle"+(a*b));
    }
}
class Box extends rectangle
{
    int height;
    void find_Volume(int a,int b,int h)
    {
        super.length=a;
        super.width=b;
        this.height=h;
        System.out.println("The Volume of the box"+(a*b*h));
    }
}
public class code2 {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length : ");
        int a=sc.nextInt();
        System.out.println("Enter width");
        int b=sc.nextInt();
        rectangle r1= new rectangle();
        r1.find_Area(a,b);
        System.out.println("\n\nNow Entering Data for Box:");
        System.out.print("Length : ");
        int c=sc.nextInt();
        Box bx = new Box();
        bx.find_Volume(c,b,a);
        
    }
}
