package oops1;


class Car{

    void details(String color,int seatingcapacity, String fuel, double miallage){
    System.out.println("Car color is "+color);
        System.out.println("My car is "+seatingcapacity+" seater");
        System.out.println("My car is "+fuel+"Engine");
        System.out.println("My car has a mileage of " +miallage+ "km/litr");


    }
}

class Maruti extends Car{
    String model = "Swift dzire";

}

class BMW extends Car{
    String model = "X1";

}

public class Main1 {
    public static void main(String[] args) {
        Maruti dzire = new Maruti();
        System.out.println("My car model is "+dzire.model);
        dzire.details("White", 5,"Petrol",16);
    }

}
