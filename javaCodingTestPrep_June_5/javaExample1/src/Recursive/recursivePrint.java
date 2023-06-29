package Recursive;
//Use a recursive technique to call a function 'printHelloRecursive'
// that prints 'hello' 4 times.

public class recursivePrint {
    public static void main (String[] arg){

       printHelloRecursive(4);
    }

     static void printHelloRecursive(int count){
        if (count <=0) {
            return ;
            //1.Only in a 'void' return type method:
            // a 'return' without any expression serves as an Immediate Termination Point for the method.
            //2. Return 0; == literally returning int '0'
        }
        System.out.println("Count: "+ count);
//            count--;
        printHelloRecursive(count-1);

    }
}


