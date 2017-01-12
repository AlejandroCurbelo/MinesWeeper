package minesweeper.model;

public class Minefield {
    
    private final int size;
    private final Cell[][] board;

    public Minefield(int size) {
        this.size=size;
        this.board = new MineImpl[size][size];
        setMines();
    }

    private void setMines() {
        for (int i = 0; i < size; i++) {
            board[(int) (Math.random() * size)][(int) (Math.random() * size)] = new MineImpl(true);
        }
    }
    
    private class MineImpl implements Cell {

        private final boolean mine;
        
        public MineImpl() {
            mine=false;
        }
        
        public MineImpl(boolean type) {
            mine=type;
        }

        @Override
        public boolean isMine() {
            return mine;
        }
    }
    
}