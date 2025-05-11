package Gameoflife;

public class GoLTest {
    public static void main(String[] args) {
        GameOfLife game = new GameOfLife(27, 20);

        
        game.setAlive(new Cell(1, 1));
        game.setAlive(new Cell(2, 2));
        game.setAlive(new Cell(3, 3));

        for (int i = 0; i < 10; i++) {
            System.out.println("Generation " + i);
            ConsolePrinter.printGameOfLife(game);
            game.nextRound();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
