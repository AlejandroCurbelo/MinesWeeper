package minesweeper.ui.swing;

import javax.swing.JButton;
import minesweeper.ui.CellDisplay;

public class SwingCellDisplay extends JButton implements CellDisplay{

    private int x;
    private int y;

    public SwingCellDisplay(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void display(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
