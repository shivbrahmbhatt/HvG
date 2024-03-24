import java.util.Random;
public class Goblin {
    private int x;
    private int y;

    public Goblin(int gridSize)
    {
        Random random = new Random();
        x = random.nextInt(gridSize);
        y = random.nextInt(gridSize);
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    @Override
    public String toString()
    {
        return "\uD83D\uDC7A";
    }
}