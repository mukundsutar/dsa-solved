package TechMahindra_Practice;

public class Diamond {
    public static void main(String[] args) {
        int len = 4;

        for (int i = 1; i <= len; i++) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = len - 1; i >= 1; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
