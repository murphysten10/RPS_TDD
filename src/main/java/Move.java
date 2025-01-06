public class Move {

    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SISSORS = 2;

    public static boolean beats(int moveA, int moveB) {
        if (moveA == ROCK) {
            return moveB == SISSORS;
        } else if (moveA == SISSORS) {
            return moveB == PAPER;
        } else if (moveA == PAPER) {
            return moveB == ROCK;
        }
        return false;
    }
}
