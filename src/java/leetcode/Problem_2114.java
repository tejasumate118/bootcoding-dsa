package leetcode;

public class Problem_2114 {
    public static int mostWordsFound(String[] sentences) {
        int result=0;
        for(int i=0;i<sentences.length;i++){
            int count=0;
            for(int j=0;j< sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                count++;}
            }
            if( count>result){
                result=count;
            }
        }

        return result+1;
    }

    public static void main(String[] args) {
        String[] arr={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));
    }
}
