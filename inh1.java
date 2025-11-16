class calculator //parent class 
{
    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
}
class calc1 extends calculator{ //child class
    int multiply(int a,int b){
        return a*b;
    }

    int add (int a,int b,int c){ //this is a overriden method
        return a+b+c;
    }
}
public class inh1 {
    public static void main(String []agrs)
    {
        calc1 ca=new calc1();
        System.out.println("Addition:"+ca.add(10,20));
        System.out.println("Subtraction:"+ca.sub(30,15));
        System.out.println("Multiplication: "+ca.multiply(4,7));
        System.out.println("Sum of three numbers: "+ca.add(6,9,8));

    }
    
}
