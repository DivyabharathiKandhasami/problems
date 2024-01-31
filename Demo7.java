import java.util.Scanner;
import java.util.*;
public class Demo7 {
    public static void main(String[] args) {
        int counter[] = new int[256];
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is my name ");

        String a = "This is my name";
        int i, len;
        len = a.length();
        for (i = 0; i < len; i++) {
            counter[(int) a.charAt(i)]++;
        }

        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }

    }
}