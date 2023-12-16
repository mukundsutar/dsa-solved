package TechMahindra_Practice.Pattern3;

public class Rhombus {
    public static void main(String[] args) {
        int len = 4;

        // ▰
        for (int i = 1; i <= len; i++) {
            System.out.println();

            for (int j = i; j <= len; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= len; j++) {
                if (i == 1 || i == len || j == 1 || j == len) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }

        for (int i = len; i >= 1; i--) {
            System.out.println();

            for (int j = i; j <= len; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= len; j++) {
                if (i == 1 || i == len || j == 1 || j == len) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}
