package oop2;

public interface Cars {

    public int tankCapacity();

    public default String color() {
        return "black";
    }
}
