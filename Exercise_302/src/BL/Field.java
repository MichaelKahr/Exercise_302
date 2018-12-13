package BL;

import java.awt.Color;

/**
 *
 * @author mikeykahr
 */
public enum Field {
    P1(1,Color.red), P2(0,Color.blue), EMPTY(-1,Color.black), DRAW(420,Color.gray);

    private int value;
    private Color c;

    private Field(int value,Color c) {
        this.value = value;
        this.c = c;
    }

    public int getValue() {
        return value;
    }

    public Color getC() {
        return c;
    }
    

}
