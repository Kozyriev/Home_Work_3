package oop2;

public class PassengerCars implements Cars{


    @Override
    public int tankCapacity() {
            return 45;
    }
    @Override
    public String color() {
            return "White";
        }
    public int weight(){
            return 1350;
    }

}
