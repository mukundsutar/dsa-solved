package TechMahindra_Practice.Pattern3;

public class TriTypes {
    public static void main(String[] args) {
        int len = 4;

        // ◢
        for (int i = 1; i <= len; i++) {
            System.out.println();

            for (int j = len - 1; j >= i; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }

        System.out.println();

        // ◣
        for (int i = 1; i <= len; i++) {
            System.out.println();

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }

        System.out.println();

        // ◥
        for (int i = 1; i <= len; i++) {
            System.out.println();

            for (int j = 2; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = len; j >= i; j--) {
                System.out.print("* ");
            }
        }

        System.out.println();

        // ◤
        for (int i = 1; i <= len; i++) {
            System.out.println();

            for (int j = len; j >= i; j--) {
                System.out.print("* ");
            }
        }
    }
}
