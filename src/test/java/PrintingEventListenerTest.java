import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class PrintingEventListenerTest {
    PrintStream printStream = mock(PrintStream.class);
    PrintingEventListener printingEventListener = new PrintingEventListener(printStream);
    Player humanPlayer = new HumanPlayer(null, null);
    Player computerPlayer = new ComputerPlayer(null);


    @Test
    void playerChoseMove() {
        printingEventListener.playerChoseMove(computerPlayer, Move.ROCK);
        verify(printStream).println("Computer chose Rock");
    }

    @Test
    void playerWins() {
        printingEventListener.playerWins(computerPlayer);
        verify(printStream).println("Computer wins!");
    }

    @Test
    void playersCanDraw() {
        printingEventListener.playersCanDraw();
        verify(printStream).println("It's a draw!");
    }
}