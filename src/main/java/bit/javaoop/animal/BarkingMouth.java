package bit.javaoop.animal;

public class BarkingMouth implements Mouth{
    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}
