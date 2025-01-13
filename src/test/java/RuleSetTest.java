import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RuleSetTest {

    @Test
    void assertRockBeatsScissors() {
        assertTrue(Move.ROCK.beats(Move.SCISSORS));
    }

    @Test
    void assertScissorsBeatsPaper() {
        assertTrue(Move.SCISSORS.beats(Move.PAPER));
    }

    @Test
    void assertPaperBeatsRock() {
        assertTrue(Move.PAPER.beats(Move.ROCK));
    }

    @Test
    void assertPaperDoesntBeatRock(){
        assertFalse(Move.PAPER.beats(Move.SCISSORS));
    }
}
