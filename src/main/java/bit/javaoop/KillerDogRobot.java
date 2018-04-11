package bit.javaoop;

import bit.javaoop.animal.BarkingMouth;
import bit.javaoop.animal.CanSpeak;
import bit.javaoop.animal.MeowingMouth;
import bit.javaoop.animal.Mouth;
import bit.javaoop.robot.CanDrive;
import bit.javaoop.robot.CanKill;
import bit.javaoop.robot.DrivingSystem;
import bit.javaoop.robot.Position;

public class KillerDogRobot implements CanSpeak, CanDrive, CanKill {

    private DrivingSystem drivingSystem;
    private Mouth mouth;

    public KillerDogRobot(Position position) {
        this.drivingSystem = new DrivingSystem(position);
        this.mouth = new MeowingMouth();
    }

    @Override
    public void speak() {
        mouth.speak();
    }

    @Override
    public void drive(Position position) {
        drivingSystem.drive(position);
    }

    @Override
    public void kill() {
        System.out.println("Kill!");
    }
}
