
import java.util.HashMap;
import java.util.Map;
public class Demo6 {


        public static void main(String[] args)
        {
            String name = "Hemavar shini";
            System.out.println(repeatingLetterCount(name));
        }

         public  static  Map <Character, Integer>  repeatingLetterCount(String name)
         {
            Map <Character, Integer> countMap = new HashMap<>();

            for (char letter : name.toCharArray())
            {
                System.out.println( letter);
                if (Character.isLetter(letter))
                {
                    char lowerCaseLetter = Character.toLowerCase(letter);
                    countMap.put(lowerCaseLetter, countMap.getOrDefault(lowerCaseLetter, 0) + 1);
                }
            }

            return countMap;
        }
    }

