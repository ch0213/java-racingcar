package racingcar.domain;

public class Car {
    private final Name name;

    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public Position getPosition() {
        return position;
    }

    public void move(int amount) {
        this.position = position.move(amount);
    }
}
