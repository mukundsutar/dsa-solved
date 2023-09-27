package Strings;

public class LowercaseCount {
    public static int printLowercaseCount(String str) {
        int count=0;
        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str= "Hello World";

        System.out.println(printLowercaseCount(str));
    }
}
