package minesweeper.control;

public class NewGameCommand implements Command {

    private final int type;

    public NewGameCommand(int type) {
        this.type = type;
    }

    @Override
    public String name() {
        return "newGame"+type+"x"+type;
    }

    @Override
    public void execute() {
        System.out.println(name());
    }
    
}
