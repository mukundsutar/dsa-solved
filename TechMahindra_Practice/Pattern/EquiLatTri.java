package TechMahindra_Practice.Pattern;

public class EquiLatTri {
    public static void main(String[] args) {
        int len = 5;

        for (int i = 1; i <= len; i++) {
            for (int j = len; j >= i; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
