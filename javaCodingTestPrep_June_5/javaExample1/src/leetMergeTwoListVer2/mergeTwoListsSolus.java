package leetMergeTwoListVer2;

//public class ListNode{  : wrong
class ListNode{

    int val;
    ListNode next;
    ListNode() {
        this.val=10;
        System.out.println("Empty constructor is called.");
    }
    ListNode(int val){ this.val =val;}
    ListNode(int val, ListNode next){
        this.val = val;
        this.next= next;
    }
}

public class mergeTwoListsSolus {

            public static void main( String arg[]) {

            ListNode temp = new ListNode(0);
            ListNode curr= new ListNode();
            //ListNode curr;  //error: variable curr might not have been initialized.

            System.out.println("temp:"+ temp.val );
             System.out.println("curr:"+ curr.val);



            }
}
