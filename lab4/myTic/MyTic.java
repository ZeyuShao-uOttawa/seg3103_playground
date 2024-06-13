public class MyTic {
    private final int gridHeight = 3;
    private final int gridWidth = 3;

    public char[][] board;
    public boolean gameEnd = false;

    public void startGame() {
        this.board = new char[gridHeight][gridWidth];
    }

    public void turn(char value, int[] location) {
        if (location[0] <= -1 || location[0] >= 3 || location[1] <= -1 || location[1] >= 3) {
            throw new IllegalArgumentException("Location out of bound");
        }
        if (this.board[location[0]][location[1]] != '\u0000') {
            throw new IllegalArgumentException("Inputted value in slot that is already filled");
        }
        this.board[location[0]][location[1]] = value;

        checkGameEnd();
    }

    public void checkGameEnd() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                this.gameEnd = true;
                return;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                this.gameEnd = true;
                return;
            }
        }
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            this.gameEnd = true;
            return;
        }
    }
}