package TechMahindra_Practice;

public class P_FloydTri {
    public static void main(String[] args) {
        int len = 8;
        int num = 1;

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
