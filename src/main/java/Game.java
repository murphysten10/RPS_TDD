import java.io.PrintStream;

public class Game {
    private final Player one;
    private final Player two;
    private Player winner;
    private EventListener mockEventListener;

    public Game(Player one, Player two, EventListener mockEventListener){
        this.one = one;
        this.two = two;
        this.mockEventListener = mockEventListener;
    }
    public void play() {
        while (winner == null) {

            int p1move = one.playMove();
            int p2move = two.playMove();
            mockEventListener.playerChoseMove(one, p1move);
            if (Move.beats(p1move, p2move)) {
                winner = one;
                //mockEventListener.playerWins(one);
            } else if (Move.beats(p2move, p1move)) {
                winner = two;
            } else {
                mockEventListener.playersCanDraw();
            }

        } mockEventListener.playerWins(winner);
    }


//    public Player getWinner(){
//        return winner;
//    }

    public interface EventListener{
        public void playerChoseMove(Player playsRock, int rock);

        public void playerWins(Player playsRock);

        public void playersCanDraw();
    }
}
