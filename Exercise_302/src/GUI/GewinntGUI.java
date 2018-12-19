package GUI;

import BL.Field;
import BL.GewinntBL;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GewinntGUI extends JFrame {
    
    private GewinntBL bl = new GewinntBL();
    private JLabel[][] labels = new JLabel[7][6];
    
    public GewinntGUI() throws HeadlessException {
        int rows = 7;
        int cols = 7;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(new GridLayout(rows, cols, 1, 1));
        for (int i = 0; i < cols; i++) {
            JButton button = new JButton("V");
            button.setName("" + i);
            button.setOpaque(true);
            this.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton bt = (JButton) e.getSource();
                    //System.out.println(bt.getName());
                    int res;
                    try {
                        res = bl.makeMove(Integer.parseInt(bt.getName()));
                        Field changed = bl.field[Integer.parseInt(bt.getName())][res];
                        labels[Integer.parseInt(bt.getName())][res].setBackground(changed.getC());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    
                    Field winner = bl.testWinner();
                    if (winner != Field.DRAW) {
                        JOptionPane.showMessageDialog(null, "The winner is: " + winner);
                    }
                }
            });
        }
        
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JLabel label = new JLabel();
                label.setName("" + i + " " + j);
                label.setBackground(Color.black);
                label.setOpaque(true);
                labels[j][i - 1] = label;
                this.add(labels[j][i - 1]);
            }
        }
        
    }
    
    public static void main(String[] args) {
        new GewinntGUI().setVisible(true);
    }
}
