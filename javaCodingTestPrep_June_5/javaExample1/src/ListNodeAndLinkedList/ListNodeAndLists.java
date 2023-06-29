package ListNodeAndLinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode head;

    ListNode() {
        this.val = 0;
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
        new_node.next = head;
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

        last.next = new_node;
    }

    // Prints the contents of the linked list
    void printList()
    {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}
class ListNodeAndLists {

    public static void main(String arg[]){
        LinkedList linkedList = new LinkedList();

//        List<Integer> listA= new List<Integer>(); // Illegal
        linkedList.push(1);
        linkedList.append(3);
        linkedList.append(5);

        System.out.print("Created Linked list is: ");
        linkedList.printList();

        LinkedList linkedList2 = new LinkedList();
        linkedList2.push(2);
        linkedList2.push(4);
        linkedList2.push(6);

        System.out.print("Created Linked list 2 is: ");
        linkedList2.printList();


    }


}