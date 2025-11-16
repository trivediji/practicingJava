import java.util.*;
class calc extends Thread
{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        int c=a+b;
        System.out.println("The sum of "+a+" and "+b+" is :"+c);
    }
}
class message extends Thread{
    public void run(){
    System.out.println("This is starting of message ");
    try{
    for(int i=0;i<5;i++)
    {
        System.out.println("This should be displayed ");
        Thread.sleep(2000);
    }
}
catch(Exception e){
System.out.println(e);
}
}}
public class threaddemo {
    public static void main(String[] args) {
        calc c1=new calc();
        message m1=new message();
        c1.start();
        m1.start();
        
    }
    
}
