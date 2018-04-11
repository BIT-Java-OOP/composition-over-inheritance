package bit.javaoop;

import bit.javaoop.robot.Position;

public class Main {
    public static void main(String[] args) {
        KillerDogRobot dogRobot= new KillerDogRobot(new Position(1,1));

        dogRobot.kill();
        dogRobot.speak();
    }
}
