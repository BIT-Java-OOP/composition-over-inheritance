package bit.javaoop.robot;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPosition(Position newPosition) {
        x = newPosition.x;
        y = newPosition.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
