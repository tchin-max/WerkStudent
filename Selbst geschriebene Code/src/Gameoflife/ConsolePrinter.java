package Gameoflife;

public class ConsolePrinter {
    public static void printGameOfLife(GameOfLife gol) {
        int rows = gol.getRows();
        int cols = gol.getColumns();

        System.out.println("+" + "-".repeat(cols) + "+");

        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < cols; j++) {
                System.out.print(gol.isCellLiving(new Cell(i, j)) ? "*" : " ");
            }
            System.out.println("|");
        }

        System.out.println("+" + "-".repeat(cols) + "+");
    }
}
