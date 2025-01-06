public class Game {
    private final Player one;
    private final Player two;
    private Player winner;

    public Game(Player one, Player two){
        this.one = one;
        this.two = two;
    }
    public void play(){
        int p1move = one.playMove();
        int p2move = two.playMove();

        if(Move.beats(p1move,p2move)){
            winner = one;
        }
    }
    public Player getWinner(){
        return winner;
    }
}
