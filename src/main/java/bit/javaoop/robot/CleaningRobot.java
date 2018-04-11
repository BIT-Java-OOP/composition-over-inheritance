package bit.javaoop.robot;

public class CleaningRobot implements CanDrive, CanClean {
    private DrivingSystem drivingSystem;

    public CleaningRobot(Position position) {
        this.drivingSystem = new DrivingSystem(position);
    }

    @Override
    public void clean() {
        System.out.println("Cleaned!");
    }

    @Override
    public void drive(Position position) {
        drivingSystem.drive(position);
    }

    public Position getPosition() {
        return drivingSystem.getPosition();
    }
}
