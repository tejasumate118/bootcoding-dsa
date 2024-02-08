package leetcode;

public class Problem_1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String check1=concat(word1);
        String check2=concat(word2);
        if(check1.equals(check2)) return true;

        return false;
    }
    public  static String concat(String[] word){
        String c="";
        for(int i=0;i<word.length;i++){
            c=c.concat(word[i]);
        }
        return c;
    }

    public static void main(String[] args) {
        String[] word1={"ac", "b"}; String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));

    }
}
