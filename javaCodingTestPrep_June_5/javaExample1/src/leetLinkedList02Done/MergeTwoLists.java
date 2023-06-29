
package leetLinkedList02Done;

class ListNode {
     int val;
     ListNode next;
     ListNode head;

     ListNode() {

         this.val = 0;
         System.out.println("Empty constructor is called.");
     }

     ListNode(int val) {
         this.val = val;
         next = null;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }

 }


class LinkedList {
    ListNode head;

    // Inserts a new node at the front of the list
    void push(int new_data)
    {
        ListNode new_node = new ListNode(new_data);
        System.out.println("Head's val: "+ head); //where head's val ==null initiatively.
        new_node.next = head; // because 'head' is currently 'Null'?
        head = new_node;
    }

    // Appends a new node at the end of the list
    void append(int new_data)
    {
        ListNode new_node = new ListNode(new_data);

        if (head == null) {
            head = new_node;
            return;
        }
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        //when 'last' became the Last Node in the list,
        // 'last.next' is pointing to the 'new_node'

        last.next = new_node;
    }

    // Prints the contents of the linked list
    void printList()
    {
        ListNode currNode = head; // create new node, and then set it to 'head'
        while (currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
    }

//    ListNode returnHead(LinkedList linkedList1){
//        System.out.println(" returnHead() body called");
//        while(linkedList1 !=null);
//        ListNode headNode = linkedList1.head;
//        System.out.println(" returnHead() while loop called");
//              return headNode;
//    }
}
class MergeTwoLists {
    public static void main(String arg[]){
        LinkedList linkedList1 = new LinkedList();

//        List<Integer> listA= new List<Integer>(); // Illegal
        linkedList1.push(1);
        linkedList1.append(3);
        linkedList1.append(5);

        System.out.print("\nCreated 'Linked list' is: ");
        linkedList1.printList();
        System.out.println ("\nCreated 'Linked list.head' is: "+ linkedList1.head);
        System.out.println ("Created 'Linked list.head.val' is: "+ linkedList1.head.val);


        LinkedList linkedList2 = new LinkedList();
        linkedList2.push(2);
        linkedList2.append(4);
        linkedList2.append(6);

        System.out.print("\nCreated Linked list 2 is: ");
        linkedList2.printList();
        System.out.println ("\nCreated 'LinkedList2.head' is: "+ linkedList2.head);
        System.out.println ("Created  'LinkedList2.head.val' is: "+ linkedList2.head.val);

        System.out.print("Created 'Linked list 2' is: ");
        linkedList2.printList();

        ListNode mergedList = mergeTwoLists(linkedList1.head, linkedList2.head);

        System.out.print("\nCreated Merged Linkedlist is: ");
        while(mergedList!=null){

            System.out.print(mergedList.val+",");
            mergedList = mergedList.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //public static ListNode mergeTwoLists(ListNode list1Head, ListNode list2Head) {
        //If we want to pass the list as a parameter, all we have to pass is a reference to the first node.
        //l1:1,3,5.  l2:2,4,6

        ListNode head = new ListNode(); //1.create temp node
        ListNode tail= head; //2. 'tail' node is going to be the node that traverses the list.

        while(list1 !=null && list2 !=null){
            //iterate until we reach the end of one list
            if(list1.val < list2.val){
                //then, add 'list1'' to 'tail.next'
                tail.next= list1;  //result: tail.next= 1
                list1=list1.next; //result: list1: 3,5
                // 1.NULL ->  1 -> 3 -> 5.
                //1.head,Tail
                // list1 = 3->5

            }
            else{
                tail.next= list2;
                list2=list2.next;
            }
            // 5.when one of the lists reaches the end, we exited the while loop. with this state: headNode -> 1->2->3->4->5(tailNode).

            tail= tail.next;  // tail=1

            //append the rest of the list to 'tail.next'
            //// where tail.next is pointing to the list 1 at this moment. So to append the rest lists.

          tail.next = list1 == null ? list2 : list1;
          // ternary operator: deciding which list to append to the tailNode.
            //result: tail.next = list2.
        }

        System.out.println("\nmergeList function() call");
        return head.next; // because 'head' is a empty node. we have to return head.next to
        // technically return the head.
        // 'head.next == integer 1'
    }
}