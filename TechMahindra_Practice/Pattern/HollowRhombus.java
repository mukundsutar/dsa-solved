package TechMahindra_Practice.Pattern;

public class HollowRhombus {
    public static void main(String[] args) {
        int len = 4;

        for (int i = 1; i <= len; i++) {
            for (int j = len; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= len; j++) {
                if (i == 1 || i == len) {
                    System.out.print("* ");
                } else {
                    if (j == 1 || j == len) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
}
