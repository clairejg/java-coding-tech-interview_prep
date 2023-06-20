import java.util.ArrayList;
import java.util.*;
public class arrayListBoolean {



        public static void main(String[] args) {

            List<Boolean> list = new ArrayList<>(Collections.nCopies(5, false));

            System.out.println(list);   // [element1, true, last element]
        }

}
