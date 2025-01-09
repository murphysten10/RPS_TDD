import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class GameTest {

    Game.EventListener mockEventListener = mock(Game.EventListener.class);
    Player playsRock = mock(ComputerPlayer.class);
    Player playsScissors = mock(ComputerPlayer.class);
    private Player playsRockThenScissors = mock(ComputerPlayer.class);

    @BeforeEach
    void initialiseMockPlayers(){
        when(playsRock.playMove()).thenReturn(Move.ROCK);
        when(playsScissors.playMove()).thenReturn(Move.SCISSORS);
        when(playsRockThenScissors.playMove()).thenReturn(Move.ROCK).thenReturn(Move.SCISSORS);
    }

    @Test
    void player1CanBeatPlayer2(){
        //Arrange
        Game game = new Game(playsRock, playsScissors, mockEventListener);
        //Act
        game.play();
        //Assert
        verify(mockEventListener).playerWins(playsRock);
    }
    @Test
    void player2CanBeatPlayer1(){
        //Arrange
        Game game = new Game(playsScissors, playsRock, mockEventListener);
        game.play();
        //Assert
        verify(mockEventListener).playerWins(playsRock);
    }

    @Test
    void gameShouldDraw(){
        Game game = new Game(playsRockThenScissors, playsRock, mockEventListener);
        game.play();
        verify(mockEventListener).playersCanDraw();
    }

    @Test
    void drawShouldReplay(){
        Game game = new Game(playsRockThenScissors, playsRock, mockEventListener);
        game.play();
        verify(mockEventListener).playersCanDraw();
    }

    @Test
    void playerOneMoveShouldBeReported(){
        Game game = new Game(playsRock, playsScissors, mockEventListener);
        game.play();
        verify(mockEventListener).playerChoseMove(playsRock, Move.ROCK);
    }

    private static class ConstantMovePlayer implements Player {

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
