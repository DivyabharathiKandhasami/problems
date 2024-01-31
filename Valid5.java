// checking and removing special characters in the string
  import java.util.Scanner;

public class Valid5 {
    public static void main(String[] args) {

        boolean flag;

        Scanner sc = new Scanner(System.in);
        do {

            String characters = "\\w+[a-zA-Z0-9]";

            System.out.println("Enter your characters:");

            String input = sc.next();

            flag = input.matches(characters);
            if (!flag) {
                System.out.println("In-valid data");
            }

        } while (!flag);
        {
            System.out.println("Valid-data");
        }
    }
}
