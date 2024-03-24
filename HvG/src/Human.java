import java.util.Random;
public class Human {
    private int x;
    private int y;

    public Human(int gridSize)
    {
        x = gridSize / 2;
        y = gridSize / 2;
    }

    public void move(char direction) {
        switch (direction)
        {
            case 'n':
                x--;
                break;
            case 's':
                x++;
                break;
            case 'e':
                y++;
                break;
            case 'w':
                y--;
                break;
        }
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
        return "\uD83E\uDDCD\uD83C\uDFFD";
    }
    }