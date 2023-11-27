package TechMahindra_Practice.Pattern2;

public class Tri {
    public static void main(String[] args) {
        int len = 4;

        for (int i = 1; i <= len; i++) {
            for (int j = len; j >= i; j--) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("  ");
            }

            for (int j = len; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = len - 1; i >= 1; i--) {
            for (int j = len; j >= i; j--) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("  ");
            }

            for (int j = len; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
