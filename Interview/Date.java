package Interview;

public class Date {
    public static int historyDocuments(String input1) {
        int count = 0;
        boolean stop=false;

        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == '-' && i < input1.length() - 1) {
                if(input1.charAt(i)=='.'&& stop==true){
                    stop=false;
                    continue;
                }
                count++;
                i = i + 7;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Un has 15-12-2001 India got freedom 15-07-1945";

        System.out.println(historyDocuments(str));
    }
}
