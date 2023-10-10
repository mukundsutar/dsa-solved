package Hackerrank;

public class PhoneNumbers {
    public static String checkNum(String num, String str[], int i) {
        if (str[i].equalsIgnoreCase("one")) {
            return "1";
        } else if (str[i].equalsIgnoreCase("two")) {
            return "2";
        } else if (str[i].equalsIgnoreCase("three")) {
            return "3";
        } else if (str[i].equalsIgnoreCase("four")) {
            return "4";
        } else if (str[i].equalsIgnoreCase("five")) {
            return "5";
        } else if (str[i].equalsIgnoreCase("six")) {
            return "6";
        } else if (str[i].equalsIgnoreCase("seven")) {
            return "7";
        } else if (str[i].equalsIgnoreCase("eight")) {
            return "8";
        } else if (str[i].equalsIgnoreCase("nine")) {
            return "9";
        } else if (str[i].equalsIgnoreCase("zero")) {
            return "0";
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "five one zero six double eight nine six four";
        String str[] = s.split(" ");
        String num = "";
        String temp = "";

        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase("triple")) {
                temp = checkNum(num, str, i + 1);

                temp = temp + temp;
            } else if (str[i].equalsIgnoreCase("double")) {
                temp = checkNum(num, str, i + 1);
            } else {
                temp = checkNum(num, str, i);
            }

            num = num + temp;
        }

        System.out.println(num);
    }
}
