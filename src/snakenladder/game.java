package snakenladder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class game extends JFrame {
    
    private Dice d;
    
    public game(){
        this.setSize(500, 650);
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
                grid[i][j].setPreferredSize(new Dimension(20, 50));
                grid[i][j].setBorder(new LineBorder(Color.BLACK));
                grid[i][j].setOpaque(true);
                grid[i][j].setBackground(Color.white);
                if(i%2 == 0)
                    panel1.add(grid[i][j]);
                else
                    panel1.add(grid[i][j],10*i);
            }
        }
        int[] h = {12,45,58,67,72,77,86,83,96,98};
        int[] t = {8,26,42,31,48,57,65,71,7,62};
        int[] top = {16,23,74,36,46,61,54,88,92,97};
        int[] btm = {4 ,18,21,24,34,41,48,69,89,79};
        snakes s = new snakes();
        s.addsnakes(grid,h,t);
        ladders l = new ladders();
        l.addladders(grid,top,btm);
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
        Color[] colors;
        colors = new Color[4];
        colors[0] = Color.red;
        colors[1] = Color.blue;
        colors[2] = Color.magenta;
        colors[3] = Color.green;
        Player[] p;
        p = new Player[4];
        JLabel[] label;
        label = new JLabel[4];
        mainPanel.add(panel1);
        switch (mode) {
            case 1:
                label[0] = new JLabel("ME");
                label[1] = new JLabel("CPU");
                p[0] = new Player(colors[0],h,t,top,btm);
                p[1] = new Player(colors[1],h,t,top,btm);
                d = new Dice(p,2,grid);
                d.add(label[0],0);
                d.add(label[1]);
                break;
            case 2:
                label[0] = new JLabel("P1");
                label[1] = new JLabel("P2");
                p[0] = new Player(colors[0],h,t,top,btm);
                p[1] = new Player(colors[1],h,t,top,btm);
                d = new Dice(p,2,grid);
                d.add(label[0],0);
                d.add(label[1]);
                break;
            case 3:
                label[0] = new JLabel("P1");
                label[1] = new JLabel("P2");
                label[2] = new JLabel("P3");
                p[0] = new Player(colors[0],h,t,top,btm);
                p[1] = new Player(colors[1],h,t,top,btm);
                p[2] = new Player(colors[2],h,t,top,btm);
                d = new Dice(p,3,grid);
                d.add(label[0],0);
                d.add(label[1]);
                d.add(label[2]);
                break;
            case 4:
                label[0] = new JLabel("P1");
                label[1] = new JLabel("P2");
                label[2] = new JLabel("P3");
                label[3] = new JLabel("P4");
                p[0] = new Player(colors[0],h,t,top,btm);
                p[1] = new Player(colors[1],h,t,top,btm);
                p[2] = new Player(colors[2],h,t,top,btm);
                p[3] = new Player(colors[2],h,t,top,btm);
                d = new Dice(p,4,grid);
                d.add(label[0],0);
                d.add(label[1],0);
                d.add(label[2]);
                d.add(label[3]);
                break;
            default:
                break;
        }
        panel2.add(d);
        mainPanel.add(panel2);
        newgame.setContentPane(mainPanel);
        this.setVisible(true);
    }
}
