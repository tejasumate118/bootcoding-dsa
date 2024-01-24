/*
Problem 258: Add Digits
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.



Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
 */
package leetcode;

import java.util.Scanner;

public class Problem_258 {
    public static void main(String[] args) {
        System.out.println("Enter a Number to find its digit sum: ");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The sum of digits is: "+ addDigits(num));

    }
    public static int addDigits(int num) {
        return sum(num);
    }
    public static int sum(int num){
        int result=0;
        while(num!=0){
            result+=num%10;
            num=num/10;
        }
        if(result>=10){
            result=sum(result);
        }
        return result;

    }
}
