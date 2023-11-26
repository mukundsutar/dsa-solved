package TechMahindra_Practice.Pattern;

public class TriPattern {
    public static void main(String[] args) {
        int len = 5;

        for (int i = 1; i <= len; i++) {
            for (int j = len; j >= i; j--) {
                System.out.print("  "); // 0 space for left increasing tri, 1 space for equi tri, 2 space for right
                                      // increasing tri
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
