package leetLinkedList01;
//Given head, the head of a linked list, determine if the linked list has a cycle in it.
// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
// Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
// Return true if there is a cycle in the linked list. Otherwise, return false.
//
//ex)  Given Linked List: 3->1->0->-4
//                           ^       |
//                           |--------
//explanation:
//        Input: head = [3,2,0,-4], pos = 1
//        Output: true
//        Explanation: There is a cycle in the linked list,
//        where the tail connects to the 1st node (0-indexed).
//

//public class Solution {
//    public boolean hasCycle(ListNode head) {
//
//    }
//}

import java.util.LinkedList;
import java.util.*;
//import java.util.ListNode;


class ListNode {
      //static, 내부 클래스를 선언할 때 static이 붙게 되면 결국 인스턴스를 생성하는 부분에서 외부 인스턴스 없이 내부 인스턴스를 바로 생성할 수 있음
      //ListNode == node
      private int val; //data val
      public ListNode next; //next will point to the 'next node'

       ListNode() {
          val = 0;
          next = null; // next is pointing to nothing == Tail node is pointing to Nothing. The lats node
      }

      ListNode(int inputX) {
         val = inputX;
          next = null;
      }

//      public
      ListNode(int inputX, ListNode link) {
          val = inputX;
          next = link;
      }


      int getData() {
          return val;
      }
  }


public class LinkedListCycle {

    public static void main(String args[]){
//        public
        ListNode head=null; // head = int. is wrong
        ListNode userNode = new ListNode(100);
        head= userNode;

        boolean result=hasCycle(head);
        System.out.println(result);


    }

    public static boolean hasCycle(ListNode head) {
        //input of this function is object of Class ListNode.
// There is no class such as 'ListNode' Thus, We must declare 'ListNode' class of our own.
// ListNode: is a node in a linked list.
        ListNode fast = head;
        ListNode slow = head;

        if (head == null) {
            return false;
        }

        //fast=fast.next;
        // while(slow!= fast)
        // {

        //     if(fast==null || fast.next==null)
        //     {
        //         return false;
        //     }
        //     slow=slow.next;
        //     fast=fast.next.next;
        //    // return false;

        // }
        // return true;
        while (slow != null) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

}
