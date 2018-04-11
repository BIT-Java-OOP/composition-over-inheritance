package bit.javaoop.robot;

public class KillerRobot implements CanDrive, CanKill {

    private DrivingSystem drivingSystem;

    KillerRobot(Position position) {
        this.drivingSystem = new DrivingSystem(position);
    }

    public void kill() {
        System.out.println("Killed!");
    }

    @Override
    public void drive(Position position) {
        drivingSystem.drive(position);
    }

    public Position getPosition() {
        return drivingSystem.getPosition();
    }
}
