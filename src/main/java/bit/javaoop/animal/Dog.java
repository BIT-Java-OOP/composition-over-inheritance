package bit.javaoop.animal;

public class Dog implements CanSpeak, CanPoop {

    private String name;
    private DigestiveSystem digestiveSystem;

    public Dog(String name, DigestiveSystem digestiveSystem) {
        this.name = name;
        this.digestiveSystem = digestiveSystem;
    }


    @Override
    public void poop() {
        digestiveSystem.poop();
    }

    @Override
    public void speak() {
        System.out.println("Bark!");
    }

    public String getName() {
        return name;
    }
}
