package Leetcode;

public class FinalValueOfVariable {
    public static int finalValue(String operations[]) {
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                result++;
            } else if (operations[i].equals("--X") || operations[i].equals("X--")) {
                result--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] operations = { "--X", "X++", "X++" };
        System.out.println(finalValue(operations));
    }
}
