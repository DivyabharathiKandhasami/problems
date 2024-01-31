
import java.util.Scanner;
public class Valid2 {
    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        // checking the fixed digits of number

        do {
            String yearOfpattern = "\\d{4}";
            System.out.println("Enter your year:");
            String input = sc.next();
            flag = input.matches(yearOfpattern);
            if (!flag) {
                System.out.println("you are must enter  a Integer:");
            }
        }
            while (!flag);
            {
                System.out.println("Happy New year");
            }
        }
    }





