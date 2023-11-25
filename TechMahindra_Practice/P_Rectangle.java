package TechMahindra_Practice;

public class P_Rectangle {
    public static void main(String[] args) {
        int height = 14;
        int width = 5;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
