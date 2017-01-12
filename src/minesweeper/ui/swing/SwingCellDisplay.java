package minesweeper.ui.swing;

import javax.swing.JPanel;
import minesweeper.model.Cell;
import minesweeper.ui.CellDisplay;

public class SwingCellDisplay extends JPanel implements CellDisplay {

    private boolean shown;
    private final Cell cell;

    public SwingCellDisplay(Cell cell) {
        this.shown = false;
        this.cell=cell;
    }
    
    @Override
    public void display(Cell cell) {
        shown=true;
    }

    public boolean isShown() {
        return shown;
    }
}
