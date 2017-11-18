/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /*
 * while list1!=null && list2!=null
 *	 	keep on adding smallest of first elemnents of two list
 *		Move pointer to next element
 * Add remaining node of larger list
 */
class Q21MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode l1Curr=l1;
        ListNode l2Curr=l2;
        //for output node
        ListNode l3head=null;
        ListNode l3Curr=null;
        while(l1Curr!=null && l2Curr!=null){
            if(l1Curr.val <= l2Curr.val){
                ListNode temp=new ListNode(l1Curr.val);
                if(l3head==null){
                    l3head=temp;
                    l3Curr=temp;
                }
                else{
                l3Curr.next=temp;
                l3Curr=l3Curr.next;
                }
                l1Curr=l1Curr.next;
            }
            else{
                ListNode temp=new ListNode(l2Curr.val);
                if(l3head==null){
                    l3head=temp;
                    l3Curr=temp;
                }
                else{
                l3Curr.next=temp;
                l3Curr=l3Curr.next;
                }
                l2Curr=l2Curr.next;
            }
        }
        while(l1Curr!=null){
            ListNode temp=new ListNode(l1Curr.val);
                l3Curr.next=temp;
                l3Curr=l3Curr.next;
                l1Curr=l1Curr.next;
        }
        while(l2Curr!=null){
            ListNode temp=new ListNode(l2Curr.val);
                l3Curr.next=temp;
                l3Curr=l3Curr.next;
                l2Curr=l2Curr.next;
        }
        return l3head;
    }
}