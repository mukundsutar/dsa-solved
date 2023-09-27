package Recursion;

public class Occurences {
    public static void allOccurences(int nums[], int key, StringBuilder str, int n) {
        //base case
        if(n==nums.length){
            System.out.println(str);
            return;
        }

        //kaam
        if(nums[n]==key){
            str.append(n +" ");
        }

        allOccurences(nums, key, str, n+1);
    }
    public static void main(String[] args) {
        int nums[]= {3, 2, 4, 5, 6, 2, 7, 2, 2, 2};
        allOccurences(nums, 2, new StringBuilder(""), 0);
    }   
}
