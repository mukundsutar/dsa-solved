package TechMahindra_Practice;

public class RightIncreasingTri {
    public static void main(String[] args) {
        int len = 4;

        for (int i = 1; i <= len; i++) {
            for (int j = len; j >= i; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
