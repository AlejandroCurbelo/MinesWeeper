package minesweeper;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import minesweeper.control.Command;
import minesweeper.control.NewGameCommand;

public class MainFrame extends JFrame {

    private final Map<String,Command> commands = new HashMap<>();
    
    public MainFrame() {
        setTitle("Buscaminas");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(background(),BorderLayout.NORTH);
        add(buttonbar(),BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }

    public void add(NewGameCommand command) {
        commands.put(command.name(), command);
    }
    
    private Component background() {
        return new JLabel(new ImageIcon("media/background.png"));
    }

    private Component buttonbar() {
        JPanel panel = new JPanel();
        panel.add(buttonsGameChoise(),BorderLayout.NORTH);
        panel.add(buttonsOptions(),BorderLayout.SOUTH);
        return panel;
    }
    
    private Component buttonsGameChoise() {
        JPanel panel = new JPanel();
        panel.add(buttonNewGame("10x10"));
        panel.add(buttonNewGame("20x20"));
        panel.add(buttonNewGame("30x30"));
        return panel;
    }

    private Component buttonNewGame(String name) {
        JButton button = new JButton(name);
        button.addActionListener(execute("newGame"+name));
        return button;
    }

    private Component buttonsOptions() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Load game");
        //button.addActionListener(execute());
        panel.add(button);
        
        button = new JButton("Rating");
        //button.addActionListener(execute());
        panel.add(button);
        return panel;
    }
    
    private ActionListener execute(String name) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                commands.get(name).execute();
            }
        };
    }

}
