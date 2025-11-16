class human{
    int age=10;
    String name="Om";
    human()
    {
        super();
        System.out.println("It is a default constructor");
        System.out.println(age);
        System.out.println(name);
    }
    human(String nam,int a)
    {
        age=a;
        name=nam;
        System.out.println(a);
        System.out.println(nam);
    }
    void sleep()
    {
        System.out.println("I am sleeping");
    }
    void drink()
    {
        System.out.println("I am drinking water");
    }
}
class student extends human
{
    void properties(){
    System.out.println("It will have all the properties of the parent class");

    }
}
public class inh {
    public static void main(String args[])
    {
        //student s1=new student();
        //s1.properties();
        //s1.sleep();

     human s2=new human("om kumar",20);
     s2.sleep();
     human s3=new human();
     s3.sleep();
     System.out.println("========================");
     student s1= new student();
     s1.drink();
     s1.properties();
        
    }
    
}
