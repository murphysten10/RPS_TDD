public enum Move {
    ROCK, PAPER, SCISSORS;

    public boolean beats(Move otherMove) {
        if (this == ROCK) {
            return otherMove == SCISSORS;
        }
        if (this == SCISSORS) {
            return otherMove == PAPER;
        }
        if (this == PAPER) {
            return otherMove == ROCK;
        }
        return false;
    }

}