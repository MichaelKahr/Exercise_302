package BL;

/**
 *
 * @author mikeykahr
 */
public enum Field {
    P1(1), P2(0), EMPTY(-1), DRAW(420);

    private int value;

    private Field(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
