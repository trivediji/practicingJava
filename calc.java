import java.util.*;
public class calc
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        int menu;
        
        System.out.println("Enter the 1st number");
        a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        b=sc.nextInt();
        {
            System.out.println("Enter:");
            System.out.println("1.To Add");
            System.out.println("2.To Subtract");
            System.out.println("3.To Multiply");
            System.out.println("4.To divide");
            System.out.println("Quit");
            menu=sc.nextInt();
            switch(menu)
            {
                case 1:
                int c=a+b;
                System.out.println(" "+c);
                break;
                case 2:
                int sub=a-b;
                System.out.println(" "+sub);
                break;
                case 3:
                int mul=a*b;
                System.out.println(" "+mul);
                break;
                case 4:
                int div=a/b;
                System.out.println(" "+div);
                break;
                case 5:
                break;
                default:
                System.out.println("You have entered a wrong choice");
                break;
            }}
            
        }

    }
