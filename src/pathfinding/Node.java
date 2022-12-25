package pathfinding;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Node extends JButton implements ActionListener {

    Node parent;
    int col;
    int row;
    int gCost;
    int hCost;
    int fCost;
    boolean start;
    boolean goal;
    boolean solid;
    boolean open;
    boolean checked;

    public Node(int col, int row) {

        this.col = col;
        this.row = row;

        setBackground(Color.white);
        setForeground(Color.black);
        addActionListener(this);
    }

    public void setAsStartNode() {
        setBackground(Color.blue);
        setForeground(Color.white);
        setOpaque(true);
        setBorderPainted(false);
        addActionListener(this);
        start = true;
    }

    public void setAsGoalNode() {
        setBackground(Color.orange);
        setForeground(Color.black);
        setOpaque(true);
        setBorderPainted(false);
        addActionListener(this);
        goal = true;
    }

    public void setAsSolidNode() {
        setBackground(Color.black);
        setForeground(Color.black);
        setOpaque(true);
        setBorderPainted(false);
        solid = true;
    }

    public void setAsOpen() {
        open = true;
    }

    public void setAsChecked() {
        if (start == false && goal == false) {
            setBackground(Color.orange);
            setForeground(Color.black);
            setOpaque(true);
            setBorderPainted(false);
        }
        checked = true;
    }

    public void setAsPath() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.black);
        setOpaque(true);
        setBorderPainted(false);
    }
}
