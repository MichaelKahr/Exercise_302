package BL;

public class GewinntBL {

    public Field[][] field = new Field[7][6];
    private Field currentPlayer = Field.P1;

    public GewinntBL() {
        reset();
    }

    public void reset() {
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 7; x++) {
                field[x][y] = Field.EMPTY;
            }
        }
    }

    public int makeMove(int x) {
        //System.out.println("abc");
        for (int i = 5; i >= 0; i--) {
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

    public Field testWinner() {
        //Check vertical
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                if (field[i][j] != Field.EMPTY) {

                    try {
                        if (field[i][j] == field[i][j + 1] && field[i][j + 2] == field[i][j + 3] && field[i][j] == field[i][j + 3]) {
                            return field[i][j];
                        }
                    } catch (Exception ex) {

                    }
                }
            }
        }
        //Chech horizontally
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x <= 5; x++) {
                System.out.println(field[x][y] + "x: " + x + "Y: " + y);
                if (field[x][y] != Field.EMPTY) {
                    try {
                        if (field[x][y] == field[x + 1][y] && field[x + 2][y] == field[x + 3][y] && field[x][y] == field[x + 3][y]) {
                            return field[x][y];
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    }
                }

            }
        }
        //Check left top
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 3; x++) {
                if (field[x][y] != Field.EMPTY) {

                    try {
                        if (field[x][y] == field[x + 1][y + 1] && field[x + 2][y + 2] == field[x + 3][y + 3] && field[x][y] == field[x + 3][y + 3]) {
                            return field[x][y];
                        }
                    } catch (Exception e) {

                    }
                }
            }
        }
        //Check left bottom
        for (int y = 0; y < 4; y++) {
            for (int x = 5; x > 2; x--) {
                if (field[x][y] != Field.EMPTY) {

                    try {
                        if (field[x][y] == field[x - 1][y + 1] && field[x - 2][y + 2] == field[x - 3][y + 3] && field[x][y] == field[x - 3][y + 3]) {
                            return field[x][y];
                        }
                    } catch (Exception e) {

                    }
                }
            }
        }
        //Check right top
        for (int y = 5; y >= 3; y--) {
            for (int x = 0; x <= 3; x++) {
                if (field[x][y] != Field.EMPTY) {
                    try {
                        if (field[x][y] == field[x + 1][y - 1] && field[x + 2][y - 2] == field[x + 3][y - 3] && field[x][y] == field[x + 3][y - 3]) {
                            return field[x][y];
                        }
                    } catch (Exception e) {

                    }
                }
            }
        }
        //Check right bottom
        for (int y = 5; y >= 3; y--) {
            for (int x = 6; x >= 3; x--) {
                if (field[x][y] != Field.EMPTY) {
                    if (field[x][y] == field[x - 1][y - 1] && field[x - 2][y - 2] == field[x - 3][y - 3] && field[x][y] == field[x - 3][y - 3]) {
                        return field[x][y];
                    }
                }
            }
        }
        if (field[1][1] != Field.EMPTY) {
            if (field[1][1] == field[2][2] && field[3][3] == field[4][4] && field[2][2] == field[4][4]) {
                return field[1][1];
            }
        }
        if (field[2][1] != Field.EMPTY) {
            if (field[2][1] == field[3][2] && field[4][3] == field[5][4] && field[3][2] == field[5][4]) {
                return field[1][1];
            }
        }
        return Field.DRAW;
    }
}
