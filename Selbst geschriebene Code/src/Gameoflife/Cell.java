package Gameoflife;

public class Cell {
    private final int row;// da sie unmutable sind.
    private final int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }

    public Cell getLeft() { return new Cell(row, col - 1); }
    public Cell getRight() { return new Cell(row, col + 1); }
    public Cell getUpper() { return new Cell(row - 1, col); }
    public Cell getLower() { return new Cell(row + 1, col); }
    public Cell getUpperLeft() { return new Cell(row - 1, col - 1); }
    public Cell getUpperRight() { return new Cell(row - 1, col + 1); }
    public Cell getLowerLeft() { return new Cell(row + 1, col - 1); }
    public Cell getLowerRight() { return new Cell(row + 1, col + 1); }
}
