package Gameoflife;

public class GameOfLife {
    private boolean[][] grid;
    private int rows;
    private int columns;

    public GameOfLife(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.grid = new boolean[rows][columns];
    }

    public int getRows() { return rows; }
    public int getColumns() { return columns; }

    public void setAlive(Cell cell) {
        if (isValidCell(cell)) {//neue Methode um zeile zu validieren
            grid[cell.getRow()][cell.getCol()] = true;//Alle Zellen  im Spielfeld gelten als lebendig.
            
        }
    }

    public void setDead(Cell cell) {
        if (isValidCell(cell)) {
            grid[cell.getRow()][cell.getCol()] = false;//Alle Zellen außerhalb des Spielfelds gelten als tot.
        }
    }

    public boolean isCellLiving(Cell cell) {
        return isValidCell(cell) && grid[cell.getRow()][cell.getCol()];
    }

    public void nextRound() {
        boolean[][] newGrid = new boolean[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Cell currentCell = new Cell(i, j);
                int livingNeighbors = countLivingNeighbors(currentCell);//countLivingNeighbors() prüft die 8 umliegenden Zellen (oben, unten, links, rechts und diagonal) und zählt, wie viele davon lebendig sind.

                if (isCellLiving(currentCell)) {
                    newGrid[i][j] = livingNeighbors == 2 || livingNeighbors == 3;//Überleben: Eine lebende Zelle bleibt am Leben, wenn sie genau 2 oder 3 lebende Nachbarn hat.
                } else {
                    newGrid[i][j] = livingNeighbors == 3;//Wiederbelebung: Eine tote Zelle wird lebendig, wenn sie genau 3 lebende Nachbarn hat.
                }
            }
        }

        grid = newGrid;
    }

    private boolean isValidCell(Cell cell) {//neue Methode um zeile zu validieren
        return cell.getRow() >= 0 && cell.getRow() < rows &&
               cell.getCol() >= 0 && cell.getCol() < columns;
    }

    private int countLivingNeighbors(Cell cell) {
        int count = 0;
        Cell[] neighbors = {
            cell.getUpper(), cell.getLower(), cell.getLeft(), cell.getRight(),
            cell.getUpperLeft(), cell.getUpperRight(), cell.getLowerLeft(), cell.getLowerRight()
        };

        for (Cell neighbor : neighbors) {
            if (isCellLiving(neighbor)) {
                count++;
            }
        }

        return count;
    }
}
