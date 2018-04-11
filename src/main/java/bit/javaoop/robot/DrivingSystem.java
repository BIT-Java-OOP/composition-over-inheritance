package bit.javaoop.robot;

public class DrivingSystem {
    private Position position;

    public DrivingSystem(Position position) {
        this.position = position;
    }

    public void drive(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
