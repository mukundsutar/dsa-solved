package Strings;

public class StringBuilderCompression {
    public static StringBuilder compress(String str) {
        StringBuilder comp= new StringBuilder("");

        for(int i=0; i<str.length();i++){
            Integer count= 1;

            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            comp.append(str.charAt(i));

            if(count>1){
                comp.append(count.toString());
            }
        }
        return comp;
    }
    public static void main(String[] args) {
        String str= "aaaabbcccdd";

        System.out.println(compress(str));
    }
}
