package TechMahindra_Practice;

public class Prime {
    public static void main(String[] args) {
        int num = 7;
        boolean flag = false;
        int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97 };

        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);

            for (int i = 2; i <= arr[x] / 2; i++) {
                if (arr[x] % i == 0) {
                    flag = true;
                    break;
                }
            }
        }

        if (!flag) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
