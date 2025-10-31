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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode tem = new ListNode(1);
        ListNode ret = new ListNode(0, tem);
        // setting up the base case
        if(l1.next == null && l2.next == null){
            System.out.println("ret1");
            ret.val = (l1.val+l2.val) % 10;
            if((l1.val + l2.val) < 10) ret.next = null;
            return ret;
        }else if(l1.next == null){
            System.out.println("ret2");
            if((l1.val + l2.val) < 10) tem.val = 0;
            ListNode ret2 = new ListNode((l1.val + l2.val) % 10, addTwoNumbers(tem, l2.next));
            return ret2;
        }else if(l2.next == null){
            System.out.println("ret3");
            if((l1.val + l2.val) < 10) tem.val = 0;
            ListNode ret3 = new ListNode((l1.val + l2.val) % 10, addTwoNumbers(l1.next, tem));
            return ret3;
        }else{
            System.out.println("ret4");
            if((l1.val + l2.val) >= 10) l1.next.val ++;
            ListNode ret4 = new ListNode((l1.val + l2.val) % 10, addTwoNumbers(l1.next, l2.next));
            return ret4;
        }
    }
}