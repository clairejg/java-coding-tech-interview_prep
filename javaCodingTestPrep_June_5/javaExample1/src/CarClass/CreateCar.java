package CarClass;




class Car{
    String model;
     Car(String userModel){
        model=userModel;
    }

}
public class CreateCar {
    public static void main(String[] arg)
    {
        Car myCar = new Car("Benz");
        System.out.println(myCar.model);
    }

}
