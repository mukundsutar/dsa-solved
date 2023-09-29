package Projects;

import java.util.Scanner;

public class hangman {
    public static void printArray(String blank[]) {
        System.out.println();

        for (int i = 0; i < blank.length; i++) {
            System.out.print(blank[i]);
        }
        System.out.println();
    }

    public static void hang(int initial) {

        String hanged[] = { " __  ",
                "\n|  | ",
                "\n|",
                "\n|",
                "\n|",
                "\n|____",
                "\n|   |" ,"\n","\nStrike "};

        if(initial==0){
            hanged[8]="";
        }else if (initial == 1) {
            hanged[2] = hanged[2] + " \\O/";

            hanged[8]+=initial;
        } else if (initial == 2) {
            hanged[2] = hanged[2] + " \\O/";
            hanged[3] = hanged[3] + "  | ";

            hanged[8]+=initial;
        } else if (initial == 3) {
            hanged[2] = hanged[2] + " \\O/";
            hanged[3] = hanged[3] + "  | ";
            hanged[4] = hanged[4] + " / \\";

            hanged[8]+=initial;
        }

        printArray(hanged);
    }

    public static void ask() {
        System.out.print("Enter your guess: ");
    }

    public static void check(String word, String blank[]) {
        char arr[] = word.toCharArray(); // make "word" string to char array

        int initial = 0;
        boolean isPresent = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("You will get 10 chances to guess the word. ");
        System.out.println("But only 3 strikes. Stay Vigilant. ");

        for (int i = 0; i < word.length()*2; i++) { // input loop
            ask();
            char letter = sc.next().charAt(0);

            for (int j = 0; j < word.length(); j++) { // search loop
                if (letter == arr[j]) {
                    blank[j] = String.valueOf(letter) + " ";
                    isPresent=true;
                    break;
                } else {
                    isPresent = false;
                }
            }

            if (isPresent == false) {
                initial++;
            }

            hang(initial);

            printArray(blank);

            if (initial==3) {
                System.out.println("\nYou Failed!!!");
                break;
            }
            System.out.println("--------------------");//next new input
            System.out.println();
        }

        sc.close();
    }

    public static void main(String[] args) {
        String word = "butler";
        String blank[] = { "* ", "* ", "* ", "* ", "* ", "*" };

        check(word, blank);

        // hang(0);
    }
}
