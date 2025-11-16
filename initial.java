import java.util.*;
class customer{
    int CustID;
    String Custname;
    int CustAge;
    void acceptDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ID of the customer");
        CustID=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the customer");
        Custname=sc.nextLine();
        System.out.println("Enter the age of the cuustomer");
        CustAge=sc.nextInt();

    }
    void displayDetails()
    {
        System.out.println("Customer ID : "+CustID);
        System.out.println("Name : "+Custname);
        System.out.println("Age : "+CustAge);

    }
}
public class initial {
    public static void main(String args [])
    {
        customer[] c1 = new customer[3];
        for (int i=0 ;i<c1.length;i++)
        {
            c1[i]=new customer();
            System.out.println("Enter the detail of"+(i+1));
            c1[i].acceptDetails();
        }
        for (int i=0;i<3;i++)
        {
            System.out.println("\n\nDetail of"+(i+1));
            c1[i].displayDetails();
        }

    }
    
}
