package OOP.sorting;



import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array?");
        int n=sc.nextInt();
        int[] arr=new int[n];
        //Taking Array Input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);

        for (int element: arr) {
            System.out.print(element+", ");

        }

    }

    private static void quickSort(int[] a, int start, int end) {
        if(end<=start) return;
        int pivot=partition(a,start,end);
        quickSort(a,start,pivot-1);
        quickSort(a,pivot+1,end);


    }
    private static int partition(int[] a,int start,int end){
        int pivot=a[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(a[j]<pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

        }
        //pivot to its final position
        i++;
        int temp=a[i];
        a[i]=a[end];
        a[end]=temp;


        return i;

    }


}
