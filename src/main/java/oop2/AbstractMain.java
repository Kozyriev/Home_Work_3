package oop2;

public class AbstractMain {

    public static void main(String[] args) {

        AbstractClassEmployees abstractClassEmployees = new AbstractClassEmployees() {
            @Override
            public int salary() {
                return 0;
            }
        };

        System.out.println(abstractClassEmployees.workerLevel());
        System.out.println(abstractClassEmployees.salary());

        System.out.println("==================================");

        Manegers manegers = new Manegers();
        System.out.println(manegers.salary());
        System.out.println(manegers.workerLevel());

    }
}
