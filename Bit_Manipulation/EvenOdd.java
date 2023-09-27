package Bit_Manipulation;

public class EvenOdd {
    public static void evenOrOdd(int num) {
        int bitmask=1;
        if((num & bitmask)==1){
            System.out.println("Odd Number");
        } else{
            System.out.println("Even Number");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(5);
        evenOrOdd(6);
        evenOrOdd(11);
    }
}
