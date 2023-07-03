package linkedList.demo01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 合并k个有序链表 使用k容量的优先队列（二叉堆）
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("aaa");
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode mergeKList(ArrayList<ListNode> list) {
        ListNode dummy = new ListNode(0, null);
        ListNode p = dummy;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(list.size(), new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for (ListNode node : list) {
            if (node != null) {
                minHeap.add(node);
            }
        }
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            p.next = node;
            p = p.next;
            if (node.next != null) {
                minHeap.add(node.next);
            }
        }

        return dummy.next;
    }
}
