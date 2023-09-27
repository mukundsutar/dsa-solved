package Hackerrank;

public class FizzBizz {
    public static void doFizzBizz(int n) {
        for (int i = 1; i <= n; i++) {
            int three = i % 3;
            int five = i % 5;

            if (three == 0 && five == 0) {
                System.out.println("FizzBuzz");
            } else if (three == 0) {
                System.out.println("Fizz");
            } else if (five == 0) {
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 15;

        doFizzBizz(n);
    }
}

/*
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
 */
