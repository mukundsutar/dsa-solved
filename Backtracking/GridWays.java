package Backtracking;

public class GridWays {
    public static int findGridWays(int i, int j, int n, int m) {
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        } else if(i==n || j==m){
            return 0;
        }

        //recursion kaam
        int w1=findGridWays(i+1, j, n, m);  //down
        int w2=findGridWays(i, j+1, n, m);  //right

        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3, m=3;

        System.out.println(findGridWays(0, 0, n, m));
    }
}
