public class MyTic {
    private final int gridHeight = 3;
    private final int gridWidth = 3;

    public char[][] board;

    public void startGame(){
        this.board = new char[gridHeight][gridWidth];
    }

    public void turn(char value, int[] location){
        this.board[location[0]][location[1]] = value;
    }

    public static void main(){

    }
}