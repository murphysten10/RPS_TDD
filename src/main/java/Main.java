import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        Player human = new HumanPlayer(ps, scan);
        Player computer = new ComputerPlayer(random);
        PrintingEventListener pLE = new PrintingEventListener(ps);
        //Game game = new Game(human, computer, pLE);
        Tournament tournament = new Tournament(human, computer, ps);


    }
}
