package leetcode;

import java.util.List;

public class Problem_19{
    //Start of Solution
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size=sizeOfList(head);
        int idxToRemove=size-n;
        ListNode prev=null;
        ListNode curr=null;
        for(int i=0;i<=idxToRemove;i++){
            if(i==0)curr=head;
            else {
                prev=curr;
                curr=curr.next;

            }
        }
        ListNode next;
        if(curr.next==null&&prev==null){
            return null;
        } else if (curr.next==null&&prev!=null) {
            prev.next=null;
        } else if (curr.next!=null&&prev!=null) {
            prev.next=curr.next;

        } else if ((curr.next!=null&&prev==null)) {
            head=curr.next;
        }
        return head;


    }
    private static int sizeOfList(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    //End of Solution



    //START OF HELPER FUNCTIONS
    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummyHead.next;
    }
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1={1};
        int[] arr2={1,2};
        printLinkedList(removeNthFromEnd(createLinkedList(arr),2));
        System.out.println();
        printLinkedList(removeNthFromEnd(createLinkedList(arr1),1));
        System.out.println();
        printLinkedList(removeNthFromEnd(createLinkedList(arr2),1));
        System.out.println();
    }
}
