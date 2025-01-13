public class Game {
    private final Player one;
    private final Player two;
    private Player winner;
    private EventListener eventListener;


    public Game(Player one, Player two, EventListener eventListener){
        this.one = one;
        this.two = two;
        this.eventListener = eventListener;
    }
    public void play() {

            while (winner == null) {

                Move p1move = one.playMove();
                Move p2move = two.playMove();
                eventListener.playerChoseMove(one, p1move);
                eventListener.playerChoseMove(two, p2move);

                if (p1move.beats(p2move)) {
                    winner = one;

                    //one.performCelebration();
                    //mockEventListener.playerWins(one);
                } else if (p2move.beats(p1move)) {
                    winner = two;
                    //two.performCelebration();
                } else {
                    eventListener.playersCanDraw();
                }
            eventListener.playerWins(winner);
        }
    }


//    public Player getWinner(){
//        return winner;
//    }

    public interface EventListener{
        void playerChoseMove(Player playsRock, Move rock);

        void playerWins(Player playsRock);

        void playersCanDraw();
    }
}
