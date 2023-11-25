package TechMahindra_Practice;

public class P_UpsideDownTri {
    public static void main(String[] args) {
        System.out.println("__________");

        int len = 4;

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
