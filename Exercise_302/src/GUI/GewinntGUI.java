package GUI;

import BL.GewinntBL;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GewinntGUI extends JFrame {

    private GewinntBL bl = new GewinntBL();

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

                }
            });
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JLabel label = new JLabel();
                label.setName("" + i + " " + j);
                label.setBackground(Color.black);
                label.setOpaque(true);
                this.add(label);
            }
        }

    }

    public static void main(String[] args) {
        new GewinntGUI().setVisible(true);
    }
}
