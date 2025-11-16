import java.util.*;
class car
{
private int slno;
private String brand;
public void setSerialNumber(int slno)
{
    this.slno=slno;
}
public int getSerialNumber()
{
    return slno;
}
public void setBrand(String brand)
{
    this.brand=brand;
}
public String getBrand()
{
    return brand;
}
}
class encapsulate
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        car obj=new car();
        int slno=sc.nextInt();
        obj.setSerialNumber(slno);
        sc.nextLine();
        String brand=sc.nextLine();
        obj.setBrand(brand);
        System.out.println(obj.getSerialNumber());
        System.out.println(obj.getBrand());
    }
}