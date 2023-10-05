package Array;


import java.util.Scanner;
public class InsertingElements {
    public static void main(String[] args) {
        //Input array.
        int[] arr=generateArray();
        System.out.println("Array Before Updating");
        display(arr);
        cases(arr);
    }

    //Insert At Start Logic
    public static int[] insertAtStart(int[] arr,int num){
        int[] dummy=new int[arr.length+1];
        for(int i=1;i< dummy.length;i++) dummy[i]=arr[i-1];
        dummy[0]=num;
        return dummy;
    }

    //Insert At last logic
    public static int[] insertAtLast(int[] arr,int num) {
        int[] dummy = new int[arr.length + 1];
        for (int i = 0; i < dummy.length - 1; i++) dummy[i] = arr[i];
        dummy[dummy.length - 1] = num;
        return dummy;
    }


    //Insert At Mid or anywhere logic
    public static int[] insertAtMiddle(int[] arr,int idx, int num){
        int[] dummy=new int[arr.length+1];
        if(idx<0||idx>arr.length){
            System.out.println("Index Out of Bounds");
            return arr;
        } else if (idx==0) {
           dummy= insertAtStart(arr,num);

        }else if (idx== arr.length){
            dummy=insertAtLast(arr,num);

        } else if (idx>0&&idx<dummy.length) {
            for(int i=0;i<idx;i++){
                dummy[i]=arr[i];

            }dummy[idx]=num;
            for(int i=idx;i< arr.length;i++){
                dummy[i+1]=arr[i];
            }
        }
        return dummy;


    }
    //Display Logic
    public static void display(int[] arr){
        for(int element: arr) System.out.print(element+" ");

    }
    public static int[] generateArray(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of array");
        int len= sc.nextInt();
        int[] arr= new int[len];
        System.out.println("Enter "+ len+ " numbers separated by spaces");
        for (int i=0;i<len;i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }


    public static void cases(int[] arr){
        Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.println("Do you want to update array? (true or false)");
        boolean update=sc.nextBoolean();



        if(update){
            System.out.println("What operation do you want to perform?");
            System.out.println("Available Operations are:");
            System.out.println("1: Insert at Start of an array.");
            System.out.println("2: Insert at End of an array. ");
            System.out.println("3: Insert in Middle of an array.");
            System.out.println("Enter the number in front to perform operation");
            int operation=sc.nextInt();
            switch (operation){
                case 1: //Insert At Zero Index and Display.
                    System.out.println();
                    System.out.println("Enter the number to insert at 'Index 0'.");
                    int num= sc.nextInt();
                    System.out.println("Array after Updating Element at START");
                    arr=insertAtStart(arr,num);
                    display(arr);
                    break;
                case 2://Insert at Last index And Display.
                    System.out.println();
                    System.out.println("Enter the number to insert at Last Index");
                    int numb= sc.nextInt();
                    System.out.println("Array after Updating Element at End");
                    arr=insertAtLast(arr,numb);
                    display(arr);
                    break;
                case 3://Insert at Middle and Display.
                    System.out.println();
                    System.out.println("Enter the Number to insert at Middle");
                    int number= sc.nextInt();
                    System.out.println("Enter the Index at which the number should be inserted.");
                    int idx= sc.nextInt();
                    System.out.println("Array after Updating Element at Middle");
                    arr=insertAtMiddle(arr,idx, number);
                    display(arr);
                    break;
                default:
                    System.out.println("Enter a valid input.");

            }
            cases(arr);


    }else return;



}}
