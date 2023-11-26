package TechMahindra_Practice.Pattern;

public class IncreasingTri {
    public static void main(String[] args) {
        int len=4;

        for (int i = 1; i <=len; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
