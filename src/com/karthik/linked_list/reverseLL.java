package com.karthik.linked_list;

class reverseLL {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        while(curr != null){
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        head.next = null;
        head = prev;
    }
}