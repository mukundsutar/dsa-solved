import java.util.*;

public class AreaSquare {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int side = in.nextInt();
        int area = side * side;

        System.out.println("Area of Square: " + area);
    }
}