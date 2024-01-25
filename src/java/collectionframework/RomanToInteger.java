package collectionframework;


import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        String original;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman Value");
        original = sc.nextLine();
        RomanValueMap obj=new RomanValueMap();
        int result=obj.calValue(original);;
        System.out.println(result);
        System.out.println();


    }

    private static class RomanValueMap {
        /*Symbol       Value
            I             1
            V             5
            X             10
            L             50
            C             100
            D             500
            M             1000*/
        int getValue(char Roman) {
            HashMap<Character, Integer> value_map = new HashMap<Character, Integer>();
            value_map.put('I', 1);
            value_map.put('V', 5);
            value_map.put('X', 10);
            value_map.put('L', 50);
            value_map.put('C', 100);
            value_map.put('D', 500);
            value_map.put('M', 1000);
            return value_map.getOrDefault(Roman, 0);

        }

        int result = 0;

        int calValue(String s) {
            int i=0;
            while(i<s.length()-1)
            {
                if(getValue(s.charAt(i))<getValue(s.charAt(i+1))){
                    result-=getValue(s.charAt(i));
                    i++;
                }
                else{
                    result+=getValue(s.charAt(i));
                    i++;
                }}
            result+=getValue(s.charAt(s.length()-1));
            return result;

        }
    }
}





