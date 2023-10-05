
package Array;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr={7,-2,10,9,32,50,70,100};
        int temp;
        //Printing array before
        System.out.println("Array Before");
        for(int i:arr) System.out.print(i+" ");
        //Reverse logic
        for(int i=0;i<arr.length/2;i++){
            temp=arr[(arr.length-1)-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;



        }///Printing array
        System.out.println();
        System.out.println("Array Reversed");
        for(int i:arr) System.out.print(i+" ");

    }
}


