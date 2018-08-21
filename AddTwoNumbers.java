package leetcode;

/**
 * Created by priya on 19/08/18.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    class ListNode{
        private int val;
        private ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        int carry = 0;
        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val + carry;
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            temp.next = newNode;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null){
            while(l1!=null){
                int sum = l1.val + carry;
                ListNode newNode = new ListNode(sum%10);
                carry = sum/10;
                temp.next = newNode;
                temp = temp.next;
                l1 = l1.next;
            }
        }
        else if(l2 != null){
            while(l2!=null){
                int sum = l2.val + carry;
                ListNode newNode = new ListNode(sum%10);
                carry = sum/10;
                temp.next = newNode;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;
            temp = temp.next;
        }
        return result.next;
    }
}
