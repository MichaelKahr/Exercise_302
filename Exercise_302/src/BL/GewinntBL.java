package BL;

public class GewinntBL {

    public Field[][] field = new Field[7][7];
    private Field currentPlayer = Field.P1;

    public GewinntBL() {
        reset();
    }

    public void reset() {
        for (int y = 0; y < 7; y++) {
            for (int x = 0; x < 8; x++) {
                field[x][y] = Field.EMPTY;
            }
        }
    }

    public int makeMove(int x) {
        for (int i = 7; i >= 0; i--) {
            if (field[x][i] == Field.EMPTY) {
                field[x][i] = currentPlayer;
                currentPlayer = (currentPlayer == Field.P1) ? Field.P2 : Field.P1;
                return i;
            }
        }
        return -1;
    }

    public Field testWinner() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (field[i][j] == Field.EMPTY) {
//                    return Field.EMPTY;
                } else {
                    if (field[i][j] == field[i][j + 1] && field[i][j + 2] == field[i][j + 3] && field[i][j] == field[i][j + 3]) {
                        return field[i][j];
                    }
                }
            }
        }
        return Field.DRAW;
    }
}
