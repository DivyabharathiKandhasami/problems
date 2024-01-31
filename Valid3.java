
import java.util.Scanner;

 // checking the numbers with minimum number and maximum number  of digits
public class Valid3
 {
     public static void main(String[] args)
     {
         boolean flag;
         Scanner sc = new Scanner(System.in);
         do {
             String age = "\\d{2,3}";
             System.out.println("Enter your age is:");
             String input = sc.next();
             flag = input.matches(age);
             if (!flag)
             {
                 System.out.println("Invalid Data");
             }
         }
         while (!flag) ;
         {
             System.out.println("valid data");
         }
     }
 }






