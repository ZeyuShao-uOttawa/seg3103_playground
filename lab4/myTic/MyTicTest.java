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
    void firstTurnTest() {
        MyTic game = new MyTic();
        char[][] expectedBoard = new char[3][3];
        expectedBoard[0][1] = 'x';
        int[] loc = {0,1};
        
        game.startGame();
        game.turn('x', loc);
        

        assertArrayEquals(game.board, expectedBoard);
    }

    @Test 
    void subsequentTurnTest() {
        MyTic game = new MyTic();
        char[][] expectedBoard = new char[3][3];
        int[] loc = {0,1};
        
        game.startGame();
        game.turn('x', loc);

        assertThrows(IllegalArgumentException.class, () -> {
            game.turn('o', loc);
        });
    }

    @Test 
    void invalidLocationTest1() {
        MyTic game = new MyTic();
        char[][] expectedBoard = new char[3][3];
        int[] loc = {3,1};
        
        game.startGame();

        assertThrows(IllegalArgumentException.class, () -> {
            game.turn('x', loc);
        });
    }

    @Test 
    void invalidLocationTest2() {
        MyTic game = new MyTic();
        char[][] expectedBoard = new char[3][3];
        int[] loc = {1,3};
        
        game.startGame();

        assertThrows(IllegalArgumentException.class, () -> {
            game.turn('x', loc);
        });
    }

    @Test 
    void invalidLocationTest3() {
        MyTic game = new MyTic();
        char[][] expectedBoard = new char[3][3];
        int[] loc = {-1,1};
        
        game.startGame();

        assertThrows(IllegalArgumentException.class, () -> {
            game.turn('x', loc);
        });
    }

    @Test 
    void invalidLocationTest4() {
        MyTic game = new MyTic();
        char[][] expectedBoard = new char[3][3];
        int[] loc = {1,-1};
        
        game.startGame();

        assertThrows(IllegalArgumentException.class, () -> {
            game.turn('x', loc);
        });
    }

    @Test 
    void gameEndTest1() {
        MyTic game = new MyTic();
        char[][] expectedBoard = new char[3][3];
        
        game.startGame();
        game.turn('x', new int[]{1, 1});
        game.turn('o', new int[]{0, 0});
        game.turn('x', new int[]{0, 2});
        game.turn('o', new int[]{0, 1});
        game.turn('x', new int[]{2, 0});

        assertEquals(game.gameEnd(), true);
    }
}
