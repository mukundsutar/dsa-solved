package TechMahindra_Practice;

public class P_Pyramid {
    public static void main(String[] args) {
        int len = 4;
        if (len % 2 == 0) {
            int initial = 2;
        } else {
            int initial = 1;
        }

        for (int i = 1; i <= len; i++) {
            for (int x = 1; x <=len-i; x++) {
                System.out.print("#");
            }

            for (int j = 1; j <= i; j++) {
                if (len%2==0) {
                    System.out.print("**");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
