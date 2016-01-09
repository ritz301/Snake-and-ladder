package snakenladder;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Player extends JFrame {
    private boolean flag = true;
    private int pos = 100;
    private int i;
    private int j;
    private int i_old = -1;
    private int j_old = -1;
    private String s;
    public Player(){
        //Define the look
    }
    public void move(int value,JLabel[][] grid){
        if(flag == true){
            flag = false;
            return;
        }
        else{
            try{
                grid[i_old][j_old].setText(Integer.toString(100-10*i-j));
                grid[i_old][j_old].setForeground(Color.black);
            }
            catch (Exception e){
                //do nothing
            }
            pos = pos - value;
            i = pos/10;
            j = pos%10;
            s = grid[i][j].getText();
            System.out.println(pos);
            grid[i][j].setText("P");
            grid[i][j].setForeground(Color.red);
            i_old = i;
            j_old = j;
        }
    }
}
