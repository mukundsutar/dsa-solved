package Leetcode;

public class ItemsMatchingRules {
    public static int countMatches(String items[][], String ruleKey, String ruleValue) {
        // String results[][] = new String[items.length][items[0].length];

        // for (int i = 0; i < items.length; i++) {
        // for (int j = 0; j < 1; j++) {
        // if (ruleKey == "type" && ruleValue == items[i][j]) {
        // results[i][j] = items[i][j];
        // } else if (ruleKey == "color" && ruleValue == items[i][j + 1]) {
        // results[i][j] = items[i][j + 1];
        // } else if (ruleKey == "name" && ruleValue == items[i][j + 2]) {
        // results[i][j] = items[i][j + 2];
        // }
        // }
        // }
        // int count=results.length;

        // return count;
        int count = 0;

        // for (int i = 0; i < items.size(); i++) {
        //     if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
        //         count++;
        //     } else if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
        //         count++;
        //     } else if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
        //         count++;
        //     }
        // }

        return count;
    }

    public static void main(String[] args) {
        String items[][] = { { "phone", "blue", "pixel" },
                { "computer", "silver", "lenovo" },
                { "phone", "gold", "iphone" } };

        System.out.println(countMatches(items, "color", "silver"));
    }
}
