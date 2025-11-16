
import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scanner.nextLine();
        System.out.println("Enter your roll number");
        String roll=scanner.nextLine();


        System.out.println("Enter marks of 1st subject ");
        int marksOne = scanner.nextInt();
        System.out.println("Enter marks of 2nd subject ");
        int marksTwo = scanner.nextInt();
        System.out.println("Enter marks of 3rd subject ");
        int marksThree = scanner.nextInt();
        System.out.println("Enter marks of 4th subject ");
        int marksFour = scanner.nextInt();
        int totalMarks=marksOne+marksTwo+marksThree+marksFour;
        int marks=(totalMarks/4);
        System.out.println("Name :"+name);
         System.out.println("Roll no. :"+roll);

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered.");
             System.out.println("your scored percentage"+marks);
        } else {
            if (marks >= 90) {
                System.out.println("you entered:"+marks);
                System.out.println("Grade O");
            } else if (marks >= 80) {
                System.out.println("you entered:"+marks);
                System.out.println("Grade E");
            } else if (marks >= 70) {
                System.out.println("you entered:"+marks);
                System.out.println("Grade A");
            } else if (marks >= 60) {
                System.out.println("you entered:"+marks);
                System.out.println("Grade B");
            } else if (marks >= 50) {
                System.out.println("you entered:"+marks);
                System.out.println("Grade C");
            } else {
                System.out.println("you entered:"+marks);
                System.out.println("Grade D");
            }
        }
    }
}
 
