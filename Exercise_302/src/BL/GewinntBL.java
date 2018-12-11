package BL;

public class GewinntBL {

    public Field[][] field = new Field[7][7];
    private Field currentPlayer = Field.P1;

    public GewinntBL() {
        reset();
    }

    public void reset() {
        for (int y = 0; y < 7; y++) {
            for (int x = 0; x < 6; x++) {
                field[x][y] = Field.EMPTY;
            }
        }
    }

    public int makeMove(int x) {
        //System.out.println("abc");
        for (int i = 6; i >= 0; i--) {
            //System.out.println(i);
            if (field[x][i] == Field.EMPTY) {
                field[x][i] = currentPlayer;
                currentPlayer = (currentPlayer == Field.P1) ? Field.P2 : Field.P1;
                //System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
