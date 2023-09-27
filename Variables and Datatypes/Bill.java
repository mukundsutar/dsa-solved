import java.util.Scanner;

public class Bill {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        float pencil = in.nextInt();
        float pen = in.nextInt();
        float eraser = in.nextInt();

        float subtotal = pencil + pen + eraser;

        float gst = (18 * subtotal) / 100;

        float total = gst + subtotal;

        System.out.println("Your Bill: " + total);
    }
}