import java.util.Scanner;

public class NewEmployee {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new employee's name ");
        String userInputName = scan.nextLine();

        Employee emp = new Employee(userInputName); //created instance of Employee class
        emp.printEmployee();
    }
}
class Employee{
    public String name;
    //end of field of class. class variable.

    //class's method.
    public Employee(){}
    //객체가 생성될 때 초기화를 위해 실행되는 메소드, 생성자의 목적은 객체 초기화
//    생성자 여러 개 작성 가능 (오버로딩)
//생성자는 new를 통해 객체를 생성할 때, 객체당 한 번 호출
    public Employee(String name){
        this.name= name;
    }

    public void printEmployee(){
        System.out.println("Employee name: " + name);

    }

}

//    객체 소멸:
//    new에 의해 할당된 객체 메모리 -> JVM의 가용메모리로 되돌려 주는 행위
//        ∴ 자바 응용프로그램에서 임의로 객체를 소멸할 수 없음 -> 장점이자 단점
//        (Heap이 부족할 때 임의로 해제하고 싶어도 불가능)