package Leetcode;

public class isPangram {
    public static boolean checkPangram(String sentence) {
        int count = 0;

        for (int i = 97; i < 123; i++) {
            for (int j = 0; j < sentence.length(); j++) {
                if ((char)i == sentence.charAt(j)) {
                    count++;
                    break ;
                }
            }
        }

        System.out.println(count);

        if (count == 26) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkPangram(sentence));
    }
}
