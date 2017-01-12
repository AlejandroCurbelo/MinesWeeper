package minesweeper.ui.swing;

import javax.swing.JPanel;
import minesweeper.model.Minefield;
import minesweeper.ui.MinefieldDisplay;

public class SwingMinefieldDisplay extends JPanel implements MinefieldDisplay {

    private Minefield minefield;

    @Override
    public void display(Minefield minefield) {
        this.minefield=minefield;
        removeAll();
        setBoard();
    }
    
    private void setBoard() {
        for (int i = 0; i < minefield.getSize(); i++) {
            for (int j = 0; j < minefield.getSize(); j++) {
                add(new SwingCellDisplay(i,j));
            }
            //cambia de línea
        }
    }
    
}
