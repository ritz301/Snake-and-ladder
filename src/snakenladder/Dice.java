package snakenladder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Dice extends JApplet{

private final Player p;
private final JLabel[][] g;
private int pos = 100;

Dice(Player pl,JLabel[][] grid) {
    p = pl;
    g = grid;
    this.setContentPane(new RollDicePanel());
}//end constructor

//====================================================== method main
/** Create JFrame and set content pane to a RollDicePanel.
     * @param args */

class RollDicePanel extends JPanel {
//=============================================== instance variables
private final Die _left; // component for one die
//end instance variables
//====================================================== constructor
/** Create border layout panel with two Die's and one button. */
RollDicePanel() {
//--- Create the dice
_left = new Die();
//--- Create the button to roll the dice
JButton rollButton = new JButton("Roll");
rollButton.addActionListener(new RollListener());
//--- Create panel for two dice
JPanel dicePanel = new JPanel();
dicePanel.add(_left);
JLabel label1 = new JLabel("ME");
JLabel label2 = new JLabel("CPU");
//--- Add components to content pane
this.add(label1);
JPanel rolldice = new JPanel();
rolldice.setLayout(new BoxLayout(rolldice, BoxLayout.Y_AXIS));
rolldice.add(rollButton);
rolldice.add(dicePanel);
this.add(rolldice);
this.add(label2);
}//end constructor
/////////////////////////////////// inner listener class RollListener
/** Inner listener class for Roll button. */
private class RollListener implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
_left.roll();
}
}
}
class Die extends JPanel {
//=============================================== instance variables
private int _value; // value that shows on face of die
private final int _diam = 9; // Diameter of spots
//end instance variables
//=============================================== class variables
private final Random random = new Random(); // random generator
//end class variables
//====================================================== constructor
/** Initialize to white background and 60x60 pixels. Initial roll.*/
public Die() {
setBackground(Color.white);
//-- Preferred size is set, but layout may change it.
setPreferredSize(new Dimension(50,50));
roll(); // Set to random initial value
}//end constructor
//====================================================== method roll
/** Produce random roll in range 1-6. Causes repaint().
@return Result of roll (1-6).
*/
public int roll() {
int val = random.nextInt(6) + 1; // Range 1-6
pos = pos - val;
if(pos<0)
    System.exit(0);
p.move(val,g);
setValue(val);
return val;
}//end roll
//================================================== method getValue
/** Returns result of last roll.*/
public int getValue() {
return _value;
}//end setValue
//================================================== method setValue
/** Sets the value of the Die. Causes repaint().
@param spots Number from 1-6.
*/
public void setValue(int spots) {
_value = spots;
repaint(); // Value has changed, must repaint
}//end setValue
//============================================ method paintComponent
/** Draws spots of die face. */
@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g); // required
    int w = getWidth();
    int h = getHeight(); // should use to resize spots too.
    switch (_value) {
        case 1: drawSpot(g, w/2, h/2);
        break;
        case 3: drawSpot(g, w/2, h/2);
        // Fall thru to next case
        case 2: drawSpot(g, w/4, h/4);
        drawSpot(g, 3*w/4, 3*h/4);
        break;
        case 5: drawSpot(g, w/2, h/2);
        // Fall thru to next case
        case 4: drawSpot(g, w/4, h/4);
        drawSpot(g, 3*w/4, 3*h/4);
        drawSpot(g, 3*w/4, h/4);
        drawSpot(g, w/4, 3*h/4);
        break;
        case 6: drawSpot(g, w/4, h/4);
        drawSpot(g, 3*w/4, 3*h/4);
        drawSpot(g, 3*w/4, h/4);
        drawSpot(g, w/4, 3*h/4);
        drawSpot(g, w/4, h/2);
        drawSpot(g, 3*w/4, h/2);
        break;
        }
    }
    private void drawSpot(Graphics g, int x, int y) {
        g.fillOval(x-_diam/2, y-_diam/2, _diam, _diam);
    }
}
}
