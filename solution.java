/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    ListNode merge(ListNode a, ListNode b)
    {
        if(a == null)
            return b;
        if( b== null)
            return a;
        if(a.val < b.val)
        {
            a.next = merge(a.next, b);
            return a;
        }
        else
        {
            b.next = merge(a, b.next);
            return b;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;

        ListNode res = lists[0];

        for(int i=1;i<lists.length;i++)
        {
            res = merge(res, lists[i]);
        }
        return res;
    }
}
