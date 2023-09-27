package Backtracking;

public class BT_Subsets {
    public static void findsubsets(String str, int i, String ans) {
        // base case
        if(i==str.length()){
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        
        // recursion
        // -->Yes
        findsubsets(str, i + 1, ans + str.charAt(i));

        // -->No
        findsubsets(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";

        findsubsets(str, 0, "");
    }
}
