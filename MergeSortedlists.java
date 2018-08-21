package leetcode;

/**
 * Created by priya on 19/08/18.
 */
public class MergeSortedlists {
    class ListNode{
        private int val;
        private ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null){
            return null;
        }
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        while(l1!=null && l2!=null){
            ListNode newNode;
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null){
            temp.next = l1;
        }
        else{
            temp.next = l2;
        }
        return result.next;
    }
}
