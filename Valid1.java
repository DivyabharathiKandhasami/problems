
    import java.util.Scanner;
    public class Valid1 {
        public static void main(String[] args) {
            boolean flag;
            Scanner sc = new Scanner(System.in);
                 // checking Integer number.
            {
                do {
                    String digit = "\\d";
                    System.out.println("Enter a value of digit:");
                    String input = sc.next();

                    flag = input.matches(digit);
                    if (!flag) {
                        System.out.println("you must enter an integer:");
                    }
                }
                while (!flag);
                {
                    System.out.println("Valid data");
                }
            }
        }
    }