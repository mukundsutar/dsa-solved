import java.util.Scanner;

public class Bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextInt();
        float pen = sc.nextInt();
        float eraser = sc.nextInt();

        float subtotal = pencil + pen + eraser;

        float gst = (18 * subtotal) / 100;

        float total = gst + subtotal;

        System.out.println("Your Bill: " + total);

        sc.close();
    }
}