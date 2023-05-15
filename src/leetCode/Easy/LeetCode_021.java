package src.leetCode.Easy;

//21. 合并两个有序链表
//        简单
//        3.1K
//        相关企业
//        将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//        示例 1：
//        输入：l1 = [1,2,4], l2 = [1,3,4]
//        输出：[1,1,2,3,4,4]

//        示例 2：
//        输入：l1 = [], l2 = []
//        输出：[]

//        示例 3：
//        输入：l1 = [], l2 = [0]
//        输出：[0]
//
//        提示：
//        两个链表的节点数目范围是 [0, 50]
//        -100 <= Node.val <= 100
//        l1 和 l2 均按 非递减顺序 排列

public class LeetCode_021 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode listNode = mergeTwoLists(l1,l2);
        System.out.println(listNode);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        //递归
//        if (list1 == null){
//            return list2;
//        } else if (list2 == null) {
//            return list1;
//        } else if (list1.val < list2.val) {
//            list1.next = mergeTwoLists(list1.next, list2);
//            return list1;
//        }else {
//            list2.next = mergeTwoLists(list1, list2.next);
//            return list2;
//        }


        //迭代
        ListNode preHead = new ListNode(-1);
        ListNode pre = preHead;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                pre.next = list1;
                list1 = list1.next;
            }else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        pre.next = list1 == null ? list2 : list1;

        return preHead.next;


//        ListNode head = null;
//        ListNode tail = null;
//        while (list1 != null || list2 != null){
//            int n1 = list1 != null ? list1.val : 101;
//            int n2 = list2 != null ? list2.val : 101;
//            if (head == null && n1 != 101 && n2 != 101){
//                if (n1 <= n2){
//                    head = tail = new ListNode(n1);
//                    list1 = list1.next;
//                }else {
//                    head = tail = new ListNode(n2);
//                    list2 = list2.next;
//                }
//            }else if (head != null && n1 != 101 && n2 != 101){
//                if (n1 <= n2){
//                    tail.next = new ListNode(n1);
//                    list1 = list1.next;
//                    tail = tail.next;
//                }else {
//                    tail.next = new ListNode(n2);
//                    list2 = list2.next;
//                    tail = tail.next;
//                }
//            }
//            if (head == null && n1 <= n2 && n1 != 101 && n2 != 101){
//                head = tail = new ListNode(n1);
//                list1 = list1.next;
//                //tail = tail.next;
//            } else if (head == null && n1 > n2 && n1 != 101 && n2 != 101) {
//                head = tail = new ListNode(n2);
//                list2 = list2.next;
//                //tail = tail.next;
//            } else if (head != null && n1 <= n2 && n1 != 101 && n2 != 101) {
//                tail.next = new ListNode(n1);
//                list1 = list1.next;
//                tail = tail.next;
//            } else if (head != null && n1 > n2 && n1 != 101 && n2 != 101) {
//                tail.next = new ListNode(n2);
//                list2 = list2.next;
//                tail = tail.next;
//            }else if (head != null && n1 == 101){
//                tail.next = new ListNode(n2);
//                list2 = list2.next;
//                tail = tail.next;
//            } else if (head != null && n2 == 101) {
//                tail.next = new ListNode(n1);
//                list1 = list1.next;
//                tail = tail.next;
//            }
    }

}
