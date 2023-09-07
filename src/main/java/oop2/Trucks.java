package oop2;

public class Trucks extends PassengerCars{

    @Override
    public int weight() {
        return 2000;
    }

    @Override
    public int tankCapacity() {
        return 75;
    }

    public int liftingCapacity(){
        return 3000;
    }
}
