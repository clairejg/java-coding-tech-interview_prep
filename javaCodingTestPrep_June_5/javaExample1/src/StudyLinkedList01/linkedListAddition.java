package StudyLinkedList01;
import java.util.LinkedList;

public class linkedListAddition {
    public static void main(String[] args){
        LinkedList<String> userCars = new LinkedList<String>();
       // 1.In order to create a 'LinkedList', we have to create
        // an object of the 'LinkedList Class'
        //2. LinkedList= new LinkedList(); == creating an Empty LinkedList by using the Constructor.
        //DataType:LinkedList<DataType> Vars = new

        userCars.add("volvo");
        userCars.add("BMW");
        userCars.add("Jeep");
        userCars.add("Tesla");
        userCars.add("Benz");

        System.out.println(userCars);

        //userCars.get(0); Wrong
        System.out.println(  userCars.get(0));
        //1.get(index number of the element)
        // get(index Number): this method returns the element in the specific position.

        System.out.println(userCars.size());
        userCars.remove(4);
        userCars.remove("Tesla");

        System.out.println(userCars);

    }

}
