import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ComputerPlayerTest {

    Random initialiseRandom(int move){
        Random fakeRandom = mock(Random.class);
        when(fakeRandom.nextInt(3)).thenReturn(move);
        return fakeRandom;
    }

    @Test
    void playMoveShouldReturnScissorsWhenRandIs2() {
        var player = new ComputerPlayer(initialiseRandom(2));
        int move = player.playMove();
        assertEquals(move, Move.SCISSORS);
    }

    @Test
    void playMoveShouldReturnPaperWhenRandIs1() {
        var player = new ComputerPlayer(initialiseRandom(1));
        int move = player.playMove();
        assertEquals(move, Move.PAPER);
    }

    @Test
    void playMoveShouldReturnRockWhenRandIs0() {
        var player = new ComputerPlayer(initialiseRandom(0));
        int move = player.playMove();
        assertEquals(move, Move.ROCK);
    }

//    private static void doPlayMoveTest(int expected, int fakeRandom) {
//
//        int move = player.playMove();
//        assertEquals(expected, move);
//    }
//
////    private static class FakeRandom extends Random {
////
////        private final int anInt;
////
////        public int nextInt(int b) {
////
////        public FakeRandom(int anInt1) {
////            anInt = anInt1;
////        }
////            return anInt;
////        }
//    }
}