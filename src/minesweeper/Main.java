package minesweeper;

import minesweeper.control.NewGameCommand;

public class Main {

    private static MainFrame frame;

    public static void main(String[] args) {
        frame = new MainFrame();
        addcommads();
    }

    private static void addcommads() {
        frame.add(new NewGameCommand(10));
        frame.add(new NewGameCommand(20));
        frame.add(new NewGameCommand(30));
    }

}
