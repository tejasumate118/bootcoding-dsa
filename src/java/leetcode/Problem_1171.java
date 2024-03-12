package leetcode;

import java.util.HashMap;

class Problem_1171{
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeZeroSumSublists(ListNode head) {
            HashMap<Integer,ListNode> map=new HashMap<>();
            ListNode dummy=new ListNode(0,head);
            int prefixsum=0;
            ListNode current=dummy;
            while(current!=null){
                prefixsum+=current.val;
                if(!map.containsKey(prefixsum)){
                    map.put(prefixsum,current);
                }else{
                    ListNode temp=map.get(prefixsum).next;
                    int sum=prefixsum;
                    while(temp!=current){
                        sum+=temp.val;
                        map.remove(sum);
                        temp=temp.next;
                    }
                    map.get(prefixsum).next=current.next;
                }
                current=current.next;
            }
            return dummy.next;
        }
    }
}