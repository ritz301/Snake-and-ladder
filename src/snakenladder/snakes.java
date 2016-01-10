package snakenladder;

import java.awt.Color;
import javax.swing.BorderFactory;
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
            g[9-a][10-b].setBackground(Color.ORANGE);
            g[9-a][10-b].setText("<html><b><span style='color:green;'>S</span></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + g[9-a][10-b].getText()+"</html>");
        }
        for(int i=0;i<10;i++){
            a = t[i]/10;
            b = t[i]%10;
            g[9-a][10-b].setOpaque(true);
            g[9-a][10-b].setBackground(Color.YELLOW);
            g[9-a][10-b].setText("<html><b><span style='color:blue;'>T</span></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + g[9-a][10-b].getText()+"</html>");
        }
        g[9-9][10-8].setBorder(BorderFactory.createMatteBorder(3, 3, 1, 1, Color.RED));
        g[9-8][10-3].setBorder(BorderFactory.createMatteBorder(1, 3, 1, 1, Color.RED));
        g[9-7][10-8].setBorder(BorderFactory.createMatteBorder(1, 3, 1, 1, Color.RED));
        g[9-6][10-3].setBorder(BorderFactory.createMatteBorder(1, 3, 1, 1, Color.RED));
        g[9-6][10-2].setBorder(BorderFactory.createMatteBorder(1, 1, 3, 1, Color.RED));
        
        g[9-9][10-6].setBorder(BorderFactory.createMatteBorder(3, 1, 1, 3, Color.GREEN));
        g[9-8][10-5].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.GREEN));
        g[9-7][10-6].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.GREEN));
        g[9-6][10-5].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.GREEN));
        g[9-5][10-6].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.GREEN));
        g[9-4][10-5].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.GREEN));
        g[9-3][10-5].setBorder(BorderFactory.createMatteBorder(3, 1, 1, 1, Color.GREEN));
        g[9-3][10-4].setBorder(BorderFactory.createMatteBorder(3, 1, 1, 3, Color.GREEN));
        g[9-2][10-7].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.GREEN));
        g[9-1][10-4].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.GREEN));
        g[9-0][10-7].setBorder(BorderFactory.createMatteBorder(1, 1, 3, 3, Color.GREEN));
        
        g[9-9][10-3].setBorder(BorderFactory.createMatteBorder(3, 3, 1, 3, Color.BLUE));
        g[9-8][10-8].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.BLUE));
        g[9-7][10-2].setBorder(BorderFactory.createMatteBorder(3, 1, 1, 1, Color.BLUE));
        g[9-7][10-1].setBorder(BorderFactory.createMatteBorder(3, 1, 1, 3, Color.BLUE));
        
        g[9-8][10-6].setBorder(BorderFactory.createMatteBorder(3, 1, 1, 3, Color.BLUE));
        g[9-7][10-5].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.BLUE));
        g[9-6][10-6].setBorder(BorderFactory.createMatteBorder(1, 1, 3, 3, Color.BLUE));
        g[9-6][10-5].setBorder(BorderFactory.createMatteBorder(1, 2, 2, 1, Color.BLUE));

        g[9-7][10-7].setBorder(BorderFactory.createMatteBorder(3, 3, 1, 1, Color.BLUE));
        g[9-6][10-4].setBorder(BorderFactory.createMatteBorder(1, 3, 1, 1, Color.BLUE));
        g[9-5][10-7].setBorder(BorderFactory.createMatteBorder(1, 3, 3, 1, Color.BLUE));

        g[9-7][10-2].setBorder(BorderFactory.createMatteBorder(3, 1, 1, 3, Color.RED));
        g[9-7][10-3].setBorder(BorderFactory.createMatteBorder(3, 3, 1, 1, Color.RED));
        g[9-6][10-8].setBorder(BorderFactory.createMatteBorder(1, 3, 1, 1, Color.RED));
        g[9-5][10-3].setBorder(BorderFactory.createMatteBorder(1, 3, 1, 1, Color.RED));
        g[9-4][10-8].setBorder(BorderFactory.createMatteBorder(1, 3, 3, 1, Color.RED));
        
        g[9-6][10-7].setBorder(BorderFactory.createMatteBorder(1, 1, 3, 1, Color.MAGENTA));
        g[9-6][10-8].setBorder(BorderFactory.createMatteBorder(1, 1, 3, 1, Color.MAGENTA));
        g[9-6][10-9].setBorder(BorderFactory.createMatteBorder(1, 1, 3, 1, Color.MAGENTA));
        g[9-5][10-2].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.MAGENTA));
        g[9-4][10-9].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.MAGENTA));
        g[9-3][10-1].setBorder(BorderFactory.createMatteBorder(1, 3, 3, 1, Color.MAGENTA));
        
        g[9-5][10-8].setBorder(BorderFactory.createMatteBorder(3, 3, 1, 3, Color.MAGENTA));
        g[9-4][10-3].setBorder(BorderFactory.createMatteBorder(1, 1, 3, 3, Color.MAGENTA));
        g[9-4][10-2].setBorder(BorderFactory.createMatteBorder(3, 3, 3, 1, Color.MAGENTA));
        
        g[9-4][10-5].setBorder(BorderFactory.createMatteBorder(1, 3, 1, 1, Color.RED));
        g[9-3][10-6].setBorder(BorderFactory.createMatteBorder(1, 3, 1, 1, Color.RED));
        g[9-2][10-5].setBorder(BorderFactory.createMatteBorder(1, 3, 3, 1, Color.RED));
        g[9-2][10-6].setBorder(BorderFactory.createMatteBorder(1, 1, 3, 3, Color.RED));
        
        g[9-1][10-2].setBorder(BorderFactory.createMatteBorder(3, 1, 1, 3, Color.BLUE));
        g[9-0][10-9].setBorder(BorderFactory.createMatteBorder(1, 1, 3, 3, Color.BLUE));
        g[9-0][10-8].setBorder(BorderFactory.createMatteBorder(1, 3, 3, 1, Color.BLUE));
        
    }
}
