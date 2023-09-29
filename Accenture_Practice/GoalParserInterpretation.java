package Accenture_Practice;

public class GoalParserInterpretation {
    public static String interpret(String command) {
        String decrypted = "";

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                decrypted = decrypted + "G";
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                decrypted = decrypted + "o";
            } else if (command.charAt(i) == 'a' && command.charAt(i + 1) == 'l') {
                decrypted = decrypted + "al";
            }
        }

        return decrypted;
    }

    public static void main(String[] args) {
        String command = "G()()()()(al)";

        System.out.println(interpret(command));
    }
}
