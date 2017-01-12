package minesweeper.model;

public class Minefield {
    
    private final int size;
    private final boolean[][] board;

    public Minefield(int size) {
        this.size=size;
        this.board = new boolean[size][size];
        setMines();
    }

    public int getSize() {
        return size;
    }

    public boolean[][] getBoard() {
        return board;
    }

    private void setMines() {
        for (int i = 0; i < size; i++) 
            board[(int) (Math.random() * size)][(int) (Math.random() * size)]=true;
    }

    public boolean isMine(int x, int y) {
        return this.board[x][y];
    }
}