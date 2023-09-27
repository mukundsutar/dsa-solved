package Leetcode;

public class AppearTwice {
    public static char[] twice(String s) {
        int stringSize = s.length();
        char str[] = new char[stringSize];
        char unique[]= new char[stringSize];

        for (int i = 0; i < stringSize; i++) {
            str[i]=s.charAt(i);
        }

        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < stringSize; j++) {
                if(str[i]==str[j]){
                    unique[i]= str[i];
                    break;
                }
            }
        }

        return unique;
    }

    public static void printArray(char unique[]) {
        // for (int i = 0; i < str.length; i++) {
        //     System.out.print(str[i] + " ");
        // }

        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }
    }

    public static void main(String[] args) {
        String s = "abccbaacz";

        printArray(twice(s));
    }
}
