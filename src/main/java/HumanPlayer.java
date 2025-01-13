import java.io.PrintStream;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private final PrintStream printStream;
    private final Scanner scanner;


    public HumanPlayer(PrintStream printStream, Scanner scanner) {
        this.printStream = printStream;
        this.scanner = scanner;
    }

    @Override
    public Move playMove() {
        printStream.println("1 for Rock, 2 for Paper, 3 for Scissors");
        return Move.values()[scanner.nextInt()-1];
    }

    @Override
    public String toString() {
        return "Human ";
    }

    @Override
    public Celebration performCelebration() {
        return Celebration.values()[0];
    }
}
