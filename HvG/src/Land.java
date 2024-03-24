import java.util.Random;
public class Land {
    private char[][] grid;
    private  Human human;
    private  Goblin goblin;
    private final Random random = new Random();

    public Land(int gridSize)
    {
        grid = new char[gridSize] [gridSize];
        human = new Human(gridSize);
        goblin = new Goblin(gridSize);
        initializeGrid();
    }

    private void initializeGrid()
    {
        for(char[] row : grid)
        {
            java.util.Arrays.fill(row, '↟');
        }
    }
    public void playTurn(char direction)
    {
        human.move(direction);
        if(human.getX() == goblin.getX() && human.getY() == goblin.getY())
        {
            initiateCombat();
        }
    }

    private void initiateCombat()
    {
        int humanStrength = random.nextInt(10) + 1;
        int goblinStrength = random.nextInt(10) + 1;

        System.out.println(humanStrength > goblinStrength ? "Human wins!" : (goblinStrength > humanStrength ? "Goblin wins!" : "It's a tie!"));
    }

    public void display()
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(i == human.getX() && j == human.getY())
                {
                    System.out.print(human);
                }else if(i == goblin.getX() && j == goblin.getY())
                {
                    System.out.print(goblin);
                }else
                {
                    System.out.print(grid[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
