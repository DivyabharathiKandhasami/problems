import java.util.Arrays;
public class Demo9
{
    public static void reverseArray(char[] a) {
            int left = 0;
            int right = a.length - 1;
 //  a = { a, b, c, d, e} ----> length of the string (5)
            while (left < right) {
                // Swap the elements at the left and right indices.
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;

                // Move the left and right indices towards the center.
                left++;
                right--;
            }
        }
    public static void main(String[] args)
    {
        char[] a = { 'a', 'b', 'c', 'd', 'e' };
        reverseArray(a);
        System.out.println(Arrays.toString(a));
    }
    }

