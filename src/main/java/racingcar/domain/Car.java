package racingcar.domain;

public class Car {

    private String name;
    private int distance;

    public Car(String name, int distance) {
        this.name = name;
        this.distance = 0;
    }

    public void move() {
        this.distance++;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}