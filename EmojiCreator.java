import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiCreator {
    public static String convertEmojiToUnicode(String text) {
        String patternString = "([\uD83C\uDF00-\uD83D\uDDFF])";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        StringBuffer buffer = new StringBuffer();


        while (matcher.find()) {
            String emoji = matcher.group(1);
            int[] codePoints = new int[emoji.codePointCount(0, emoji.length())];
            int index = 0;
            for (int codePoint : emoji.codePoints().toArray()) {
                codePoints[index++] = codePoint;
            }
            String unicode = "";
            for (int codePoint : codePoints) {
                unicode += "\\u" + Integer.toHexString(codePoint).toUpperCase();
            }
            matcher.appendReplacement(buffer, unicode);
        }

        matcher.appendTail(buffer);
        return buffer.toString();
    }

    public static void main(String[] args)
    {

    }
}
