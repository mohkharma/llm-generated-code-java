package codestral.task186;

// Java solution using PriorityQueue for merging k sorted lists
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Task186_MISTRAL_codestral_latest {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null||lists.length==0) return null;
        PriorityQueue<ListNode> queue= new PriorityQueue<>(lists.length, (a,b)->a.val-b.val);
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);
        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }
}