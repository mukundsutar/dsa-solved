package Job_a_Thon;

public class RotatingString {
    public static int isItPossilbe(String s) {
        if(s.length()==1){
            return 0;
        } else if(s.length()%2!=0){
            return 0;
        }

        int half = s.length() / 2;

        for (int i = 0; i < half; i++) {
            if (s.charAt(i) == s.charAt(i+half)) {

            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String s = "aac";

        System.out.println(isItPossilbe(s));
    }
}
