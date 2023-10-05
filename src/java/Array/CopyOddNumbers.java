package Array;

import java.util.Scanner;

public class CopyOddNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the length of array.");
        Scanner sc=new Scanner(System.in);
        int orgLen=sc.nextInt();
        int[] originalArray = new int[orgLen];
        for(int i=0;i<orgLen;i++){
            System.out.println("Enter the number");
            originalArray[i]= sc.nextInt();
        }


        // Count the number of odd elements in the original array
        int count = 0;
        for (int i=0;i<originalArray.length;i++) {
            if (originalArray[i] % 2 != 0) {
                count++;
            }
        }
        //Odd array length
        int[] oddNumbers = new int[count];

        // Copy odd numbers
        int index = 0;
        for (int i=0;i<originalArray.length;i++) {
            if (originalArray[i] % 2 != 0) {
                oddNumbers[index] = originalArray[i];
                index++;
            }
        }

        // Print array
        System.out.println("Original Array: ");
        for (int i=0;i<originalArray.length;i++) {
            System.out.print(originalArray[i]+ " ");
        }
        System.out.println();

        System.out.println("Odd Numbers Array: ");
        for (int i=0;i<count;i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}

