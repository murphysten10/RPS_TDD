public class Move {

    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    public static boolean beats(int moveA, int moveB) {
        if (moveA == ROCK) {
            return moveB == SCISSORS;
        }
        if (moveA == SCISSORS) {
            return moveB == PAPER;
        }
        if (moveA == PAPER) {
            return moveB == ROCK;
        }
        return false;
    }
}
