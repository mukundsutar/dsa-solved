package TechMahindra_Practice;

public class TwoTri {
    public static void main(String[] args) {
        int len = 4;

        for (int i = 1; i <= len; i++) {
            for (int j = len; j >= i; j--) {
                System.out.print("_ ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }

            for (int j = len; j >= i; j--) {
                System.out.print("_ ");
            }

            System.out.println();
        }

    }
}
