import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {

    @Test
    void playMoveShouldReturnScissorsWhenRandIs2() {
        doPlayMoveTest(Move.SCISSORS, 2);

    }

    @Test
    void playMoveShouldReturnPaperWhenRandIs1() {
        doPlayMoveTest(Move.PAPER, 1);

    }

    @Test
    void playMoveShouldReturnRockWhenRandIs0() {
        doPlayMoveTest(Move.ROCK, 0);

    }

    private static void doPlayMoveTest(int expected, int fakeRandom) {
        var player = new ComputerPlayer(new FakeRandom(fakeRandom));
        int move = player.playMove();
        assertEquals(expected, move);
    }

    private static class FakeRandom extends Random {

        private final int anInt;

        public FakeRandom(int anInt1) {
            anInt = anInt1;
        }

        public int nextInt(int b) {
            return anInt;
        }
    }
}