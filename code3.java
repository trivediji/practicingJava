interface volume
{
    double PI=3.14;
    public void cal_Vol();
}
class cylinder implements volume{
    
    public void cal_Vol()
    {
        
    }
    public void cal_Vol(int height,int radius)
    {
        System.out.println("The Volume of the cylinder "+(volume.PI*height*radius));
    }
}
public class code3 {
    
}
