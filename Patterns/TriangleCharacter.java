package Patterns;

public class TriangleCharacter {
    public static void main(String[] args) {
        int num = 4;
        char ch= 'A';

        /*
         * A
         * BC
         * DEF
         * GHIJ
         */
        for(int line = 1; line<=num; line++){
            for(int charac= 1;charac<=line; charac++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        for(int line=1; line<=num; line++){
            for(int charac=1; charac<=num-line+1; charac++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
