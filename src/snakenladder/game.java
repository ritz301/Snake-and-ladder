package snakenladder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class game extends JFrame {
    public game(){
        this.setSize(500, 550);
        this.setTitle("Snake and Ladder");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void main(game newgame, int mode){
        JPanel mainPanel = new JPanel();
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(10,10));
        JPanel panel2 = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JLabel[][] grid= new JLabel[10][10];
        for (int i=0; i<10; i++) {
            for (int j=0; j<10 ; j++ ) {
                grid[i][j] = new JLabel(Integer.toString(100-10*i-j));
                grid[i][j].setHorizontalAlignment(SwingConstants.RIGHT);
                grid[i][j].setVerticalAlignment(SwingConstants.TOP);
                grid[i][j].setPreferredSize(new Dimension(12, 50));
                grid[i][j].setBorder(new LineBorder(Color.BLACK));
                grid[i][j].setName(i + " " + j);
                if(i%2 == 0)
                    panel1.add(grid[i][j]);
                else
                    panel1.add(grid[i][j],10*i);
            }
        }
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
        Player p = new Player();
        Dice d = new Dice(p,grid);
        panel2.add(d);
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        newgame.setContentPane(mainPanel);
        this.setVisible(true);
        switch (mode) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
