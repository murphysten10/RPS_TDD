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
    public int playMove() {
        printStream.println("1 for Rock, 2 for Paper, 3 for Scissors");
        return scanner.nextInt()-1;
    }
}
