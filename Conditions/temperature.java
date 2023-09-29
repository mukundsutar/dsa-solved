import java.util.Scanner;

public class temperature {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Patient's Temperature: 45");
        double temp = sc.nextDouble();

        if (temp >= 100.0f) {
            System.out.println("High Fever");
        } else {
            System.out.println("No Fever");
        }

        sc.close();
    }
}
