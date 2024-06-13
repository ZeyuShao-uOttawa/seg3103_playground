import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyTicTest {
    @Test 
    void correctGridTest() {
        MyTic game = new MyTic();
        game.startGame();

        assertEquals(game.board.length(), 3);
        assertEquals(game.board.length(), 3);
    }
}
