public class MyTic {
    private final int gridHeight = 3;
    private final int gridWidth = 3;

    public char[][] board;

    public void startGame(){
        this.board = new char[gridHeight][gridWidth];
    }

    public void turn(char value, int[] location){
        if (this.board[location[0]][location[1]] != '\u0000') {
            throw new IllegalArgumentException("Inputted value in slot that is already filled");
        }
        this.board[location[0]][location[1]] = value;
    }

    public static void main(){

    }
}