class largest{
    void printLargest(int arr[])
    {
        int max=0;
        
        for (int i=0; i<arr.length; i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
public class arr {
   public static void main(String[]args)
   {
    int arr[]=new int[]{19,28,73,28,99,100,718,7289,843928};
    largest Largest=new largest(); 
    Largest.printLargest(arr);
   }

}
