import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyTicTest {
    @Test 
    void gridSizeTest() {
        MyTic game = new MyTic();
        
        game.startGame();

        assertEquals(game.board.length, 3);
        assertEquals(game.board[0].length, 3);
    }

    @Test 
    void turnTest() {
        MyTic game = new MyTic();
        char[][] expectedBoard = {
            {' ', 'x', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        game.startGame();
        game.turn('x', {0,1});
        

        assertEquals(game.board, expectedBoard);
    }
}
