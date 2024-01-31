public class Name {
    public static void main(String[] args) {
        String name = "Hemavarshini";
        System.out.println(letterCount(name));
    }

    public static int letterCount(String name) {
        int count = 0;

        for (char letter : name.toCharArray()) {
            if (Character.isLetter(letter)) {
                count++;
            }
        }

        return count;
    }
}

