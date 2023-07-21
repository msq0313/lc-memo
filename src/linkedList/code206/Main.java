package linkedList.code206;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode res = new Solution2().reverseList2(node1);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
