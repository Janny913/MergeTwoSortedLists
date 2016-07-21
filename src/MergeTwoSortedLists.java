

/**
 * Created by jianiyang on 16/7/20.
 */
public class MergeTwoSortedLists {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwo(ListNode l1, ListNode l2){
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode mergeHead;

        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwo(l1.next, l2);
        }else{
            mergeHead = l2;
            mergeHead.next = mergeTwo(l1, l2.next);
        }

        return mergeHead;

    }

    private static ListNode l1(){
        ListNode d1 = new ListNode(4, null);
        ListNode c1 = new ListNode(3, d1);
        ListNode b1 = new ListNode(2, c1);
        ListNode a1 = new ListNode(1, b1);
        return a1;
    }
    private static ListNode l2(){
        ListNode d2 = new ListNode(8, null);
        ListNode c2 = new ListNode(7, d2);
        ListNode b2 = new ListNode(6, c2);
        ListNode a2 = new ListNode(5, b2);
        return a2;

    }



    public static void main(String[] args){
        MergeTwoSortedLists res = new MergeTwoSortedLists();
        ListNode output = res.mergeTwo(l1(), l2());
        while(output != null){
            System.out.print(output.val);
            output = output.next;
        }


    }
}
