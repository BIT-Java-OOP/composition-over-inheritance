package bit.javaoop.animal;

public class Cat implements CanSpeak,CanPoop{
    private String name;
    private DigestiveSystem digestiveSystem;

    public Cat(String name) {
        this.name = name;
        this.digestiveSystem = new DigestiveSystem();
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void poop() {
        digestiveSystem.poop();
    }

    public String getName() {
        return name;
    }
}
