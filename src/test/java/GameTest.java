import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    @Test
    void player1CanBeatPlayer2(){
        //Arrange
        Player playsRock = new ConstantMovePlayer(Move.ROCK);
        Player playsScissors = new ConstantMovePlayer(Move.SCISSORS);
        Game game = new Game(playsRock, playsScissors);
        //Act
        game.play();
        //Assert
        assertEquals(playsRock, game.getWinner());

    }
    @Test
    void player2CanBeatPlayer1(){
        //Arrange
        Player playsRock = new ConstantMovePlayer(Move.ROCK);
        Player playsScissors = new ConstantMovePlayer(Move.SCISSORS);
        Game game = new Game(playsScissors, playsRock);
        //Act
        game.play();
        //Assert
        assertEquals(playsRock, game.getWinner());

    }

    private static class ConstantMovePlayer extends Player {

        private final int move;

        public ConstantMovePlayer(int move){
            this.move = move;
        }

        @Override
        public int playMove() {
            return move;
        }

        @Override
        public String toString() {
            return "ConstantMovePlayer{" +
                    "move=" + move +
                    '}';
        }
    }
}
