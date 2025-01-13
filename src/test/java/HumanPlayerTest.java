import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class HumanPlayerTest {
    public static final String EXPECTED_INPUT = "1 for Rock, 2 for Paper, 3 for Scissors" + System.lineSeparator();
    public PrintStream outputStream = mock(PrintStream.class);

    @Test
    void playMoveShouldPrintMessage(){
        var player = new HumanPlayer(outputStream, new Scanner("1"));
        player.playMove();
        verify(outputStream).println("1 for Rock, 2 for Paper, 3 for Scissors");
    }
    @Test
    void playMoveShouldReturnRockWhenInputIs1(){

        doReturnValueTest(Move.ROCK, "1");
    }
    @Test
    void playMoveShouldReturnPaperWhenInputIs2(){

        doReturnValueTest(Move.PAPER, "2");
    }
    @Test
    void playMoveShouldReturnScissorsWhenInputIs3(){

        doReturnValueTest(Move.SCISSORS, "3");
    }

    private void doReturnValueTest(Move expected, String input) {
        var player = new HumanPlayer(outputStream, new Scanner(input));
        Move move = player.playMove();
        assertEquals(expected.toString(), move.toString());
    }

}