package BL;

public class GewinntBL {

    private Field[][] field = new Field[6][7];
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

    public void makeMove(int x) {
        for (int i = 5; i <= 0; i--) {
            if (field[x][i] == Field.EMPTY) {
                field[x][i] = currentPlayer;
                currentPlayer = (currentPlayer == Field.P1) ? Field.P2 : Field.P1;
            }
        }

    }
}
