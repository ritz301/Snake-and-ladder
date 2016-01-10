package snakenladder;

import java.awt.Color;
import javax.swing.JLabel;

public class ladders {

    public void addladders(JLabel[][] g, int[] h, int[] t) {
        int a,b;
        for(int i=0;i<10;i++){
            a = h[i]/10;
            b = h[i]%10;
            g[9-a][10-b].setOpaque(true);
            g[9-a][10-b].setBackground(Color.DARK_GRAY);
            try{
               int v = Integer.parseInt(g[9-a][10-b].getText());
               g[9-a][10-b].setText("<html><b><span style='color:white;'>H"+Integer.toString(i+1)+ "&nbsp;&nbsp;&nbsp;" + g[9-a][10-b].getText()+"</span></html>");
            }
            catch(Exception e){
                g[9-a][10-b].setText("<html><b><span style='color:white;'>H"+Integer.toString(i+1)+ "&nbsp;&nbsp;&nbsp;" + Integer.toString(h[i]) +"</span></html>");
            }
        }
        for(int i=0;i<10;i++){
            a = t[i]/10;
            b = t[i]%10;
            g[9-a][10-b].setOpaque(true);
            g[9-a][10-b].setBackground(Color.DARK_GRAY);
            try{
               int r = Integer.parseInt(g[9-a][10-b].getText());
               g[9-a][10-b].setText("<html><b><span style='color:white;'>T"+Integer.toString(i+1)+ "&nbsp;&nbsp;&nbsp;" + g[9-a][10-b].getText()+"</span></html>");
            }
            catch(Exception e){
                g[9-a][10-b].setText("<html><b><span style='color:white;'>T"+Integer.toString(i+1)+ "&nbsp;&nbsp;&nbsp;" + Integer.toString(t[i]) +"</span></html>");
            }
        }
    }
    
}
