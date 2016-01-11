package snakenladder;

import java.awt.Color;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Player extends JFrame {
    private static boolean flag = true;
    private int pos = 100;
    private int i;
    private int j;
    private int i_old = -1;
    private int j_old = -1;
    private String s;
    private final Color c;
    private final int id;
    private static int instances=1;
    private int r;
    private final int h[];
    private final int t[];
    private final int top[];
    private final int btm[];
    
    private static ladders l;
    private static snakes ss;
    
    public Player(Color c,int h[],int t[],int top[],int btm[]){
        this.id = instances;
        this.h = h;
        this.t = t;
        this.top = top;
        this.btm = btm;
        //Define the look
        instances++;
        this.c = c;
    }
    
    public int getid(){
        return id;
    }
        
    public void move(int value,JLabel[][] grid){
        if(flag == true){
            flag = false;
            l = new ladders();
            ss = new snakes();
            Arrays.sort(h);
            Arrays.sort(btm);
        }
        else{
            try{
                Color e = grid[i_old][j_old].getBackground();
                grid[i_old][j_old].setText(Integer.toString(100-10*i-j));
                l.addladders(grid, top, btm);
                ss.addsnakes(grid, h, t);
                if(e==Color.DARK_GRAY)
                    grid[i_old][j_old].setForeground(Color.white);
                else
                    grid[i_old][j_old].setForeground(Color.black);
            }
            catch (Exception e){
                //do nothing
            }
            pos = pos - value;
            //System.out.println(100 - pos);
            
            //System.out.println(Arrays.binarySearch(h, 100 - pos));
            if(Arrays.binarySearch(h, 100 - pos)>=0){
                //System.out.println("dsa"+pos);
                int index = Arrays.binarySearch(h,100 - pos);
                i = (100-t[index])/10;
                j = (100-t[index])%10;
                System.out.println("bit_in " + Integer.toString(100-pos) + "id" + id + "t[]"+ index +" "+ t[index]);
            }
            else if(Arrays.binarySearch(btm, 100 - pos)>=0){
                int index = Arrays.binarySearch(btm,100 - pos);
                i = (100-top[index])/10;
                j = (100-top[index])%10;
                System.out.println("climb_in " + Integer.toString(100-pos) + "id" + id + "top[]"+ index +" "+ top[index]);
            }
            else{
                System.out.println("out" + Integer.toString(100-pos)+ "id" + id);            
                i = pos/10;
                j = pos%10;
            }
            s = grid[i][j].getText();
            try{
                r = Integer.parseInt(s);
                grid[i][j].setText("<html>P"+id+"&nbsp;"+ grid[i][j].getText()+"</html>");
            }
            catch(Exception e){
                grid[i][j].setText("<html>P"+id+"<br>"+ grid[i][j].getText()+"</html>");
            }
            if(grid[i][j].getBackground() == Color.DARK_GRAY)
                grid[i][j].setForeground(Color.white);
            else
                grid[i][j].setForeground(c);
            i_old = i;
            j_old = j;
        }
    }
}
