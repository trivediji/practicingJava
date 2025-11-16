interface a{
    void display();
}
interface b extends a{
    void show();
}
class c implements b{
    @Override
    public void show ()
    {
        System.out.println("this is show method");
    }
    @Override
    public void display()
    {
        System.out.println("This is Display Method");
    }
}
public class second {
    public static void main(String args[]){
        c C=new c();
        C.show();
        C.display();

    }
    
}
