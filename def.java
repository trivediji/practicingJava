class demo
{
    demo()//default contructor
    {
        System.out.println("This is a deafault constructor");
    }
    demo(int a,int b)//parametarized constructor
    {
        System.out.println("This is a parametarized constructor");
    }
    void display()
    {
        System.out.println("This is a display method ");
    }
}
public class def {
    public static void main(String args[]){
        demo d=new demo();
        d.display();
        demo d1=new demo(50,70);

    }
    
}
