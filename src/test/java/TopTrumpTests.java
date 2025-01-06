import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TopTrumpTests {
    @Test
    void assertRockBeatsScissors() {
        assertTrue(Move.beats(Move.ROCK, Move.SISSORS));
    }

    @Test
    void assertScissorsBeatsPaper() {
        assertTrue(Move.beats(Move.SISSORS, Move.PAPER));
    }

    @Test
    void assertPaperBeatsRock() {
        assertTrue(Move.beats(Move.PAPER, Move.ROCK));
    }
}
