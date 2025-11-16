import java.util.*;
class box{
    int length;
    int width;
    int height;
    void volume(int a,int b,int c){
        length=a;
        width=b;
        height=c;
        System.out.println("Volume of the Box is: "+(length*width*height));
    }
}

public class boxer {
    public static void main(String[]args)
    {
        box b1=new box();
        Scanner sc = new Scanner(System.in);
        int h,w,l;
        System.out.println("Enter the height ");
        h=sc.nextInt();
        System.out.println("Enter the width ");
        w=sc.nextInt();
        System.out.println("Enter the length");
        l=sc.nextInt();
        b1.volume(h,w,l);

    }
    
}
