import java.util.*;

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        parseParagraph(s);

    }

    public static void parseParagraph(String s)
    {
        String[] words = s.split(" ");
        for (String word : words) {
            char[] tempWord = word.toLowerCase().toCharArray();
            if (getValue(tempWord) >= 100) {
                System.out.println(word);
            }
        }
    }

    public static int getValue(char[] tempWord)
    {
        int wordValue = 0;

        for (char z : tempWord) {
            if (z >= 'a' && z <= 'z') {
                wordValue += z - 96;
            }
        }

        return wordValue;
    }

}