package TechMahindra_Practice;

public class Butterfly {
    public static void main(String[] args) {
        int len = 5;

        for (int i = len; i >= 1; i--) {
            for (int j = len; j >= i; j--) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i * 2 - 1 - 1; j++) {
                System.out.print("  ");
            }

            for (int j = len; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= len; i++) {
            for (int j = len; j >= i; j--) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i * 2 - 1 - 1; j++) {
                System.out.print("  ");
            }

            for (int j = len; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
