package com.potato.leetcode.linkedlist;

import com.potato.leetcode.model.ListNode;

/**
 * @author dehuab
 */
public class ReversListSolution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode p = head;
        ListNode q = head.next;
        ListNode r;
        head.next = null;
        while (q != null) {
            r = q.next;
            q.next = p;
            p = q;
            q = r;
        }
        head = p;
        return head;
    }
}
