import java.util.ArrayList;

public class arrayListPassToFunction {

    public static void displayArrayList(ArrayList<String> programming){

        System.out.println(programming);
    }

    public static void main(String[] args){

        //creating an arrayList of String
        ArrayList<String> programType = new ArrayList<>();
        programType.add("Java");
        programType.add("Python");
        programType.add("JavaScript");

        displayArrayList(programType);
        //this is how we PASS the ArrayList object as function parameter
    }

//end of the .java class
}
