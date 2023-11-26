package TechMahindra_Practice.Pattern;

public class P_Alphabets {
    public static void main(String[] args) {
        System.out.println("__________");

        int len = 4;
        char ch = 'A';

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }
}
