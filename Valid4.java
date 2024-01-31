
// checking SBIN characters in a format
import java.util.Scanner;
public class Valid4 {
    public static void main(String[] args)
    {
   boolean flag ;
   Scanner sc = new Scanner(System.in);
   String isbn = "SBIN-\\d{5}";
   System.out.println("Enter the SBIN number:" );
   String input = sc.next();
   flag = input.matches(isbn);
   if(!flag)
   {
       System.out.println("valid data");

   }

   while(!flag);
        {
            System.out.println("IN-Valid data");
        }

    }
}
