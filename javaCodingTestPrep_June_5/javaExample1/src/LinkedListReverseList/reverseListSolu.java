//package LinkedListReverseList;
//
//public class reverseListSolu {
//    //a->b->c->d
//
//
//    const reverseListFunction = (head)=>{
//
//        let prev= null;
//        let curr = head;
//
//        while(curr != null){
//
//            const next = curr.next;
//            // a   ->  b ->    c
//            //curr     next
//
//            curr.next= prev;
//            //  null <- a      b  ->  c
//            //  prev    curr  next
//            prev = curr;
//            curr = next;
//
//            //   a  <-  b  <-  c
//            //  prev   curr    next
//        }
//        return prev;
//        // returning new 'head'
//
//    }
//
//
//
//}
