package Recursion;

public class RemoveDuplicates {
    public static void removeDupli(String str, int index, StringBuilder newStr, boolean alphabets[]) {
        // base case
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(index);
        if (alphabets[currChar - 'a'] == true) {
            removeDupli(str, index+1, newStr, alphabets);
        } else{
            alphabets[currChar-'a']= true;
            removeDupli(str, index+1, newStr.append(currChar), alphabets);
        }
    }

    public static void main(String[] args) {
        String str= "mukundsutar";
        removeDupli(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
