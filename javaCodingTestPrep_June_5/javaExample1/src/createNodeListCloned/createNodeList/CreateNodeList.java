package createNodeListCloned.createNodeList;
//https://math-coding.tistory.com/160

class Node {
    //static, 내부 클래스를 선언할 때 static이 붙게 되면 결국 인스턴스를 생성하는 부분에서 외부 인스턴스 없이 내부 인스턴스를 바로 생성할 수 있음
    //ListNode == node
//    private
    int val; //data val
    public Node nextNode; //next will point to the 'next node'

    Node() {
        val = 0;
        nextNode = null; // next is pointing to nothing == Tail node is pointing to Nothing. The lats node
    }
    Node(int inputX) {
        val = inputX;
        nextNode = null;
    }
    Node(int inputX, Node link) {
        val = inputX;
        nextNode = link;
    }

////end of ListNode Class
}

class LinkedListEx {
    int size=0;
    Node head;
    LinkedListEx() {
        head = null;
    }
    public boolean isEmpty() {
        return this.head == null;
        // true, or False

    }
    Node add(Node head, Node nodeToAdd, int position){
        // Add nodeToAdd to ith position of the existing node.
        Node myNode= head; //1. create then set, Node Object=head

        if(size< position){
            System.out.println("Cannot add Node. due to size<Position");

            return null;
        }

        if(head == null){
            //2.when the list is empty.

            myNode= nodeToAdd; //set created NodeObject 'headNode' ='nodeToAdd'
            head= myNode; // set, head = NodeObject
        }
        else{
            //else if the list was not empty,
            for(int i =1; i<position; i++){
                myNode= myNode.nextNode;

            }
            nodeToAdd.nextNode = myNode.nextNode;
            myNode.nextNode = nodeToAdd;
        }
        size++;
        return head;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        //print elemetns in a LinkedList
        Node temp= head; //creating a temp node, assign 'head' to current node
        // make a 'temp' node point to the head.
        while(temp != null){//while head is not empty.== list is not empty
            System.out.print(temp.val +", ");
            temp =temp.nextNode;
        }
    }

    public void insertFirst(int data){
        Node newNode= new Node();
        newNode.val =data;
        newNode.nextNode= head;
        head= newNode; // update 'head' to the newNode.

    }

    Node GetNodeAt(int position){
        //function returns the node of the given position.
        Node current= head;//1. creatw a new Node and set to head

        for(int i=0; i<position; i++ )
        {//Iterate the body of for loop for 'position' times.
            current = current.nextNode;
        }
        return current;
    }


}


public class CreateNodeList {
    //1.
    public static void main(String args[]){

        LinkedListEx fruits = new LinkedListEx();
        fruits.insertFirst(10);
        fruits.printList();

        System.out.println();
        fruits.insertFirst(20);
        fruits.printList();

        System.out.println();
        fruits.insertFirst(30);
        fruits.printList();


        System.out.println();
        fruits.insertFirst(40);
        fruits.printList();


        System.out.println();
        System.out.println(fruits.GetNodeAt(0));
        Node nodeAt=fruits.GetNodeAt(0);
        System.out.println(nodeAt.val);
        //get '10' which is 0th element of the list
    }

//end of CreateNodeList class
}

