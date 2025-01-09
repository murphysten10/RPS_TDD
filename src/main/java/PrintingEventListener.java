import java.io.PrintStream;

public class PrintingEventListener implements Game.EventListener {
    PrintStream printStream;
    String[] moves = {"Rock", "Paper", "Scissors"};

    public PrintingEventListener(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void playerChoseMove(Player player, int move) {
        printStream.println(player.toString() + "chose " + moves[move] );

    }

    @Override
    public void playerWins(Player winner) {
        printStream.println(winner.toString() + "wins!");

    }

    @Override
    public void playersCanDraw() {
        printStream.println("It's a draw!");

    }
}
