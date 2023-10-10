package Leetcode;

public class ConvertTemperature {
    public static void temperatureConverter(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        double ans[] = { kelvin, fahrenheit };

        // return ans;

        printArray(ans);
    }

    public static void printArray(double numArr[]) {
        System.out.print("[");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        double celsius = 36.50;

        temperatureConverter(celsius);
    }
}
