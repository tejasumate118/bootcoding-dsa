package leetcode;

public class Problem_1750 {

    public int minimumLength(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            char current = s.charAt(left);
            if (s.charAt(left) == s.charAt(right)){
                while (left<=right && s.charAt(left) == current) left++;
                while (left<=right && s.charAt(right) == current) right--;
            } else {
                break;
            }
        }
        if (left > right) return 0;
        String resString = s.substring(left,right+1);
        return  resString.length();
    }

    //End of solution

    public static void main(String[] args) {
        Problem_1750 TestCase=new Problem_1750();
        //Test Cases-->
        System.out.println(TestCase.minimumLength("ca"));
        System.out.println(TestCase.minimumLength("cabaabac"));
        System.out.println(TestCase.minimumLength("aabccabba"));
        System.out.println(TestCase.minimumLength("bbbbbbbbbbbbbbbbbbb"));
    }
}
