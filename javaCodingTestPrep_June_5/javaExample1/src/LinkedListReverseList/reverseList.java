//package LinkedListReverseList;
//
//public class reverseList {
//    // a->b->c->d->e
//    //result: e->d->c->b->a
//    const reverseListFunction = (head)=>{
//        let prev = null;
//        let curr = head;
//        while(curr != null){
//            const next= curr.next;
//            //1.result:  N     a     ->         b -> c -> d -> e
//            //           prev  curr  curr.next  next
//            //
//            curr.next = prev;
//            //result: N     <-          a      b -> c -> d -> e
//            //        prev  curr.next   curr   next
//
//            prev = curr; // set 'prev' to 'curr'
//            curr = next;
//        }
//        return prev
//
//    }
//}
