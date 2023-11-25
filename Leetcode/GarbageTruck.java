package Leetcode;

public class GarbageTruck {
    public static int calculateTime(String[] garbage, int[] travel) {
        int time = 0;

        int paper = 0;
        int glass = 0;
        int metal = 0;

        for (int i = 0; i < garbage.length; i++) {
            for (char ch : garbage[i].toCharArray()) {
                if (ch == 'P') {
                    paper = i;
                } else if (ch == 'G') {
                    glass = i;
                } else if (ch == 'M') {
                    metal = i;
                }

                time++;
            }
        }

        for (int i = 1; i < travel.length; i++) {
            travel[i] = travel[i] + travel[i - 1];
        }

        if (paper != 0) {
            time = time + travel[paper - 1];
        }
        if (glass != 0) {
            time = time + travel[glass - 1];
        }
        if (metal != 0) {
            time = time + travel[metal - 1];
        }

        return time;
    }

    public static void main(String[] args) {
        String garbage[] = { "G", "P", "GP", "GG" };
        int travel[] = { 2, 4, 3 };

        System.out.println(calculateTime(garbage, travel));
    }
}
