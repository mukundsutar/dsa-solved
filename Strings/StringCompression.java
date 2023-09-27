package Strings;

public class StringCompression {
    public static String compress(String str) {
        String comp= new String("");

        for(int i=0; i<str.length();i++){
            Integer count= 1;

            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            comp += str.charAt(i);

            if(count>1){
                comp += count.toString();
            }
        }
        return comp;
    }
    public static void main(String[] args) {
        String str= "aabbbc";

        System.out.println(compress(str));
    }
}
