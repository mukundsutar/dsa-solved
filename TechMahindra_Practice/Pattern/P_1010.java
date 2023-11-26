package TechMahindra_Practice.Pattern;

public class P_1010 {
    public static void main(String[] args) {
        System.out.println("__________");

        int len = 4;

        for (int i = 0; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
