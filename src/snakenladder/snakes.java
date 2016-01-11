package snakenladder;

import java.awt.Color;
import javax.swing.JLabel;

public class snakes {
    snakes(){
        
    }

    public void addsnakes(JLabel g[][],int h[],int t[]) { //t l b r
        int a,b;
        for(int i=0;i<10;i++){
            a = h[i]/10;
            b = h[i]%10;
            g[9-a][10-b].setOpaque(true);
            g[9-a][10-b].setBackground(Color.RED);
            //g[9-a][10-b].setText("<html><b><span style='color:green;'>S</span></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + g[9-a][10-b].getText()+"</html>");
            try{
               int v = Integer.parseInt(g[9-a][10-b].getText());
               g[9-a][10-b].setText("<html><b><span style='color:yellow;'>S"+Integer.toString(i+1)+ "&nbsp;&nbsp;&nbsp;" + g[9-a][10-b].getText()+"</span></html>");
            }
            catch(Exception e){
                g[9-a][10-b].setText("<html><b><span style='color:yellow;'>S"+Integer.toString(i+1)+ "&nbsp;&nbsp;&nbsp;" + Integer.toString(h[i]) +"</span></html>");
            }
        }
        for(int i=0;i<10;i++){
            a = t[i]/10;
            b = t[i]%10;
            g[9-a][10-b].setOpaque(true);
            g[9-a][10-b].setBackground(Color.ORANGE);
            try{
               int v = Integer.parseInt(g[9-a][10-b].getText());
               g[9-a][10-b].setText("<html><b><span style='color:maroon;'>S"+Integer.toString(i+1)+ "&nbsp;&nbsp;&nbsp;" + g[9-a][10-b].getText()+"</span></html>");
            }
            catch(Exception e){
                g[9-a][10-b].setText("<html><b><span style='color:maroon;'>S"+Integer.toString(i+1)+ "&nbsp;&nbsp;&nbsp;" + Integer.toString(t[i]) +"</span></html>");
            }
        }        
    }
}
