package com.wangyy.myhr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class MyhrApplicationTests {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(10);
        ListNode listNode2 = new ListNode(20);
        ListNode listNode3 = new ListNode(30);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);

        ListNode listNode = ReverseList(listNode1);
        System.out.println(listNode.val);

    }

    static ListNode ReverseList(ListNode head) {
        while(head != null){
            if(head.getNext()!= null){
                System.out.println("head" + head.val + "---" + head.getNext().val);
                head = head.getNext();
            }else{
                return head;
            }
        }
        return head;
    }




    @Test
    void contextLoads() {
        ArrayList<String> l1 = new ArrayList<String>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l1.add("1");
        l2.add(1);
        System.out.println(l1.get(0).getClass());
        System.out.println(l2.get(0).getClass());
        System.out.println(l1.getClass() == l2.getClass());
    }

    @Test
    void contextLoads1() {
        int [] a = {1,2,3,4,5};
        System.out.println(a[-1]);
        
        ArrayList arrayList = new ArrayList();
        for (Object o : arrayList) {
            
        }
    }



}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode listNode){
        this.next = listNode;
    }
}
