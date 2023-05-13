package src.leetCode.Middle;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


//public class ListNode {
//    int val;	//结点值
//    ListNode next;	//用来指向下一个结点的ListNode对象
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//上面是官方文档定义，下面做一下解释：
//        链表是一种数据结构，由数据和指针构成，指针指向下一个结点
//        Java ListNode 就是用Java定义实现的链表结构
//        ListNode 本质上是一个Java类，它具有类所有的特性，比如，创建对象；通过对象访问类的成员变量和成员方法
//        创建一个ListNode对象：ListNode node = new ListNode();
//        node.val 表示当前所在结点的值，node.next 表示当前结点所指向下一个结点的地址值
//
//        当然了，ListNode也有泛型，使用泛型可以兼容不同的的数据类型
//class ListNode<E>{                //类名 ：Java类就是一种自定义的数据结构
//    E val;                        //数据 ：节点数据
//    ListNode<E> next;             //对象 ：引用下一个节点对象。在Java中没有指针的概念，Java中的引用和C语言的指针类似
//    ListNode(E val){              //构造方法 ：构造方法和类名相同
//        this.val=val;             //把接收的参数赋值给当前类的val变量
//    }
//}

