package linkedList.code206;

import java.util.LinkedList;
import java.util.Stack;

public class Solution2 {
    public ListNode reverseList(ListNode head) {
        // cursively
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode res = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }

    public ListNode reverseList2(ListNode head) {
        // iteratively 栈方式，效率低
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode res = stack.peek();
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            if (!stack.isEmpty()) {
                node.next = stack.peek();
            } else {
                node.next = null;
            }
        }
        return res;
    }

    public ListNode reverseList3(ListNode head) {
        // iteratively 构造虚拟节点 prev cur next
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
