package snakenladder;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class input extends JFrame {
    private JPanel panel;
    private JPanel panel1;
    private JPanel mainPanel;
    private JPanel panel2;
    private InputEngine inputEngine;
    private game newgame;
    
    public input(SnakeNladder game){
        this.setSize(300,300);
        this.setTitle("Snake and Ladder");
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void start(int mode){
        newgame = new game();
        newgame.main(newgame,mode);
    }
    
    public void main(input Input) {
        inputEngine = new InputEngine(Input);
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        JLabel title = new JLabel("Snake & Ladder");
        panel1.add(title);
        panel1.setPreferredSize(new Dimension(50,50));
        panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 15, 10, 15));
        GridLayout g = new GridLayout(2, 2,10,10);
        panel2.setLayout(g);
        JButton b1 = new JButton("Computer");
        b1.setName("Computer");
        b1.addActionListener(inputEngine);
        JButton b2 = new JButton("2P");
        b2.setName("2P");
        b2.addActionListener(inputEngine);
        JButton b3 = new JButton("3P");
        b3.setName("3P");
        b3.addActionListener(inputEngine);
        JButton b4 = new JButton("4P");
        b4.setName("4P");
        b4.addActionListener(inputEngine);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        Input.setContentPane(mainPanel);
        this.setVisible(true);
    }   
}

class InputEngine implements ActionListener {
    input parent;
    
    InputEngine(input parent) {
        this.parent = parent;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object eventSource = e.getSource();
        JButton clickedButton = (JButton) eventSource;
        String name = clickedButton.getName();
        int gamemode;
        switch (name) {
            case "Computer":
                gamemode = 1;
                parent.dispose();
                parent.start(gamemode);
                break;
            case "2P":
                gamemode = 2;
                parent.dispose();
                parent.start(gamemode);
                break;
            case "3P":
                gamemode = 3;
                parent.dispose();
                parent.start(gamemode);
                break;
            default:
                parent.dispose();
                System.exit(0);
                break;
        }
    }
    
}
