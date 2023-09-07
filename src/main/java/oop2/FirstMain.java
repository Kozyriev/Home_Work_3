package oop2;

public class FirstMain {

    public static void main(String[] args) {
        Cars cars = new Cars() {

            @Override
            public int tankCapacity() {
                return 50;
            }
        };
        System.out.println(cars.tankCapacity());
        System.out.println(cars.color());
        System.out.println(cars.getClass());

        //FirstMain$1


        System.out.println("=====================================");

        Trucks trucks = new Trucks();
        System.out.println(trucks.color());
        System.out.println(trucks.tankCapacity());
        System.out.println(trucks.weight());
        System.out.println(trucks.liftingCapacity());

        System.out.println("=====================================");

        PassengerCars passengerCars = new PassengerCars();
        System.out.println(passengerCars.color());
        System.out.println(passengerCars.weight());
        System.out.println(passengerCars.tankCapacity());

    }

}
