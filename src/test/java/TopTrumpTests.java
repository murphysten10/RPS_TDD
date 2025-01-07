import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TopTrumpTests {
    @Test
    void assertRockBeatsScissors() {
        assertTrue(Move.beats(Move.ROCK, Move.SCISSORS));
    }

    @Test
    void assertScissorsBeatsPaper() {
        assertTrue(Move.beats(Move.SCISSORS, Move.PAPER));
    }

    @Test
    void assertPaperBeatsRock() {
        assertTrue(Move.beats(Move.PAPER, Move.ROCK));
    }

    @Test
    void assertPaperDoesntBeatRock(){
        assertFalse(Move.beats(Move.PAPER, Move.SCISSORS));
    }
}
