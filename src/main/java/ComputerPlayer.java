import java.util.Random;

public class ComputerPlayer implements Player {
    private final Random random;

    public ComputerPlayer(Random random) {
        this.random = random;
    }

    @Override
    public Move playMove() {
        return Move.values()[random.nextInt(3)];
    }

    @Override
    public Celebration performCelebration() {
        return Celebration.values()[0];
    }

    @Override
    public String toString() {
        return "Computer ";
    }

}
