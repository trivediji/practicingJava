import java.util.*;
public class anagram
{
    public static void main(String[]args)
    {
        String Str1,Str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two string which you want to compare");
        Str1=sc.nextLine();
        Str2=sc.nextLine();
        Str1= Str1.replace(" ","");
        Str2= Str2.replace(" ","");
        Str1=Str1.toLowerCase();
        Str2=Str2.toLowerCase();
        char []arr1=Str1.toCharArray();
        char []arr2=Str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("It is an Anagram");
        }
        else
        {
            System.out.println("It is not an anagram");
        }
    }
}