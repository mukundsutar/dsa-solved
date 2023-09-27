package Recursion;

public class Addition {
    public static int add(int n) {
        //base case
        if(n==0){
            return 0;
        }

        //kaam
        return n + add(n-1);
    }
    public static void main(String[] args) {
        System.out.println(add(5));
    }
}
