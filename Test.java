/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                cur.next=l1;
                l1=l1.next;
                cur=cur.next;
            }else{
                cur.next=l2;
                l2=l2.next;
                cur=cur.next;
            }
        }
        if(l1!=null){
            cur.next=l1;
        }
        if(l2!=null){
            cur.next=l2;
        }
        return dummy.next;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur=head;
        ListNode pre=cur.next;
        while(pre!=null){
            if(pre.val==cur.val){
                pre=pre.next;
                cur.next=pre;
            }else{
                cur=cur.next;
                pre=pre.next;
            }
        }
        return head;
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=getLen(headA);
        int len2=getLen(headB);
        int len=len1-len2;
        ListNode lcur=headA;
        ListNode scur=headB;
        if(len<0){
            lcur=headB;
            scur=headA;
            len=-len;
        }
        while(len!=0){
               lcur=lcur.next; 
               len--;
        }
        while(lcur!=scur){
            lcur=lcur.next;
            scur=scur.next;
        }
        if(lcur!=null){
            return lcur;
        }
        return null;
    }
    private int getLen(ListNode head){
        int len=0;
        ListNode cur=head;
        while(cur!=null){
            len++;
            cur=cur.next;
        }
        return len;
    }
}

