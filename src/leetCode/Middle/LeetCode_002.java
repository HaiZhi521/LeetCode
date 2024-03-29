package src.leetCode.Middle;

//2. 两数相加
//        中等
//        9.5K
//        相关企业
//        给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
//        请你将两个数相加，并以相同形式返回一个表示和的链表。
//
//        你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//
//
//        示例 1：
//
//
//        输入：l1 = [2,4,3], l2 = [5,6,4]
//        输出：[7,0,8]
//        解释：342 + 465 = 807.
//        示例 2：
//
//        输入：l1 = [0], l2 = [0]
//        输出：[0]
//        示例 3：
//
//        输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        输出：[8,9,9,9,0,0,0,1]
//
//
//        提示：
//
//        每个链表中的节点数在范围 [1, 100] 内
//        0 <= Node.val <= 9
//        题目数据保证列表表示的数字不含前导零


public class LeetCode_002 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode nextNode;
        l1.next = new ListNode(4);
        //l1.next = new ListNode(3);
        l1.next.next = new ListNode(3);
        //l1.next.next.next = new ListNode(3);342  465
        //l1.next.next.val = 3;
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next= new ListNode(4);
        ListNode s = addTwoNumbers(l1,l2);
        System.out.println(s);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while (l1 != null ||l2 != null){
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            //判断是否是第一位
            if (head == null){
                head = tail = new ListNode(sum % 10);
            }else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum/10;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
            //判断最后一位是否有进位
            if (carry > 0){
                tail.next = new ListNode(carry);
            }
        }
        return head;
    }














    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode head = null,tail = null;
        int carry = 0;
        while (l1 != null || l2 != null){
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null){
                head = tail = new ListNode(sum % 10);
            }else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
            if (carry > 0){
                tail.next = new ListNode(carry);
            }

        }
        return head;
    }


}
