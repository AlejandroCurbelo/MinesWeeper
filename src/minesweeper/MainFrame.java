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
        add(buttons(),BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }

    public void add(NewGameCommand command) {
        commands.put(command.name(), command);
    }
    
    private Component background() {
        return new JLabel(new ImageIcon("media/background.png"));
    }

    private Component buttons() {
        JPanel panel = new JPanel();
        panel.add(button("10x10"));
        panel.add(button("20x20"));
        panel.add(button("30x30"));
        return panel;
    }

    private Component button(String name) {
        JButton button = new JButton(name);
        button.addActionListener(execute("newGame"+name));
        return button;
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
