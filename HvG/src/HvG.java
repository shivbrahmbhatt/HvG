import java.util.Scanner;

public class HvG {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grid size:");
        int gridSize = scanner.nextInt();

        Land land = new Land(gridSize);

        while(true)
        {
            System.out.println("Enter direction (n/s/e/w):");
            char direction = scanner.next().charAt(0);

            land.playTurn(direction);
            land.display();
        }
    }
}