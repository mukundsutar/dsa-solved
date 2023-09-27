package Leetcode;

public class SentenceWithMoreWords {
    public static int maxWords(String[] sentences) {
        // int count[]=new int [sentences.length];

        // for(int i=0; i<count.length;i++){
        // count[i]=1;
        // }
        // int largest = 0;

        int count=0; 
        
        for (int i = 0; i < sentences.length; i++) {
            count = Math.max(count, (sentences[i].split(" ")).length);

        }
        return count;
    }

    public static void main(String[] args) {
        String sentences[] = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        System.out.println(maxWords(sentences));
    }
}
