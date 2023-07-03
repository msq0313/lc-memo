package linkedList.code83;

/**
 * 删除排序链表中的重复项
 *
 */
public class Main {
    public static void main(String[] args) {

    }

    static class ListNode {
        int val;
        ListNode next;
    }
    static ListNode removeDuplicates(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        // 断开与后面重复元素的连接
        if (slow != null) {
            slow.next = null;
        }
        return head;
    }
}
