public class MyTic {
    private final int gridHeight = 3;
    private final int gridWidth = 3;

    public char[][] board;

    public void startGame(){
        this.board = new char[gridHeight][gridWidth];
    }

    public void turn(char value, int[] location){
        if (location[0] <= -1 || location[0] >= 3 || location[1] <= -1 || location[1] >= 3) {
            throw new IllegalArgumentException("Location out of bound");
        }
        if (this.board[location[0]][location[1]] != '\u0000') {
            throw new IllegalArgumentException("Inputted value in slot that is already filled");
        }
        this.board[location[0]][location[1]] = value;
    }

    public static void main(){

    }
}