import java.io.PrintStream;

public class Tournament implements Game.EventListener{

    private final Player human;
    private final Player robot;
    PrintStream printStream;
    PrintingEventListener ple;


    public Tournament(Player human, Player robot, PrintStream printStream) {
        this.human = human;
        this.robot = robot;
        this.printStream = printStream;
    }

    public void playerWinsPoint(Player winner){

    }

    @Override
    public void playerChoseMove(Player playsRock, Move rock) {

    }

    @Override
    public void playerWins(Player playsRock) {

    }

    @Override
    public void playersCanDraw() {

    }
}
