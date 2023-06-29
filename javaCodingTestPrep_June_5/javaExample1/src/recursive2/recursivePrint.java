package recursive2;

public class recursivePrint {

     static void printRecursive(int count){

        if(count<=0){
            return;
        }

        System.out.println("Count:" +count);
        printRecursive(count-1);
    }

    public static void main(String args[]){

        printRecursive(6);

    }
}
