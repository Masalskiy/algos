package basic_algo_struct.linkedList;
// https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
public class DoubleNumberList {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        ListNode third = new ListNode(7);
        ListNode second = new ListNode(6, third);
        ListNode head = new ListNode(5, second);
        //567 *2 = 1134
        doubleIt(head);

    
    }

    public static ListNode doubleIt(ListNode head) {
        // усли при умножении на 2 ведущее число >4, то появляется новый разряд
        //499*2=998
        //999*2=1998
        if(head.val>4){
            head = new ListNode(0, head);
        }
        for(ListNode actual = head; actual != null; actual = actual.next){
            actual.val = (actual.val * 2)%10;
            if(actual.next!=null && actual.next.val>4 ){
                actual.val += 1;
            }
            // если у следующего при умножении есть еденица, а это числа >4
                // умножить текущее значение, взять еденицы и +1
            //иначе
                //умножить текущее значение, взять еденицы
            System.out.println(actual.val);
        }
        return head;
    }

}
