package Hackerearth;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine(); 
        String str= sc.nextLine();

        System.out.println(n*2);
        System.out.println(str);

        sc.close();
    }
}
