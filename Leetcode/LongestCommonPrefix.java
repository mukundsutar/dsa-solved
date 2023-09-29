package Leetcode;

public class LongestCommonPrefix {
    public static void common(String strs[]) {
        StringBuilder prefix_1 = new StringBuilder();
        // String prefix_2="";  -->

        // if(strs.length==1){
        //     return prefix_2= strs[1];
        // } else if(strs[0]==""){
        //     return "";
        // }

        for (int i = 0; i < strs.length - 1; i++) {
            int mini = Math.min(strs[i].length(), strs[i + 1].length());

            if (i == strs.length - 2) {
                prefix_1.setLength(0);
            }

            for (int j = 0; j < mini; j++) {
                if (strs[i].charAt(j) == strs[i + 1].charAt(j) && j <= mini) {
                    prefix_1.append(strs[i].charAt(j));
                } else{
                    break;
                }
            }
        }

        System.out.println(prefix_1);
    }

    public static void main(String[] args) {
        String strs[] = { "flower","flow","flight" };

        common(strs);
    }
}
