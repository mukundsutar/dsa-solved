package twodimentional;

import java.util.Scanner;


public class Search_Largest_Smallest {
    public static boolean search(int matrix[][], int key) {
        //Search Matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println(key + ", Found at index " + "(" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void largeAndSmall(int matrix[][]) {
        int largest= Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest= matrix[i][j];
                }
                if (matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest= " + largest);
        System.out.println("Smallest= " + smallest);
    }
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner sc= new Scanner(System.in);

        //Input Matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        //Print
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Search
        search(matrix, 5);
        largeAndSmall(matrix);
    }
}
