package TechMahindra_Practice.Pattern3;

public class HollowTri {
    public static void main(String[] args) {
        int len = 6;

        // ◮
        for (int i = 1; i <= len; i++) {
            System.out.println();

            for (int j = i; j <= len - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || j == i || i == len) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }

        // ⧩
        for (int i = len - 1; i >= 1; i--) {
            System.out.println();

            for (int j = i; j <= len - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i || j == i * 2 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}
