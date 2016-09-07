import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void playerOneTurn_PlayerOneWinsRock_True() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Boolean expected = true;
    assertEquals(expected, testRockPaperScissors.playerOneWins("rock", "scissors"));
  }

  @Test
  public void playerOneTurn_PlayerOneWinsPaper_True() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Boolean expected = true;
    assertEquals(expected, testRockPaperScissors.playerOneWins("paper", "rock"));
  }

  @Test
  public void playerOneTurn_PlayerOneWinsScissors_True() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Boolean expected = true;
    assertEquals(expected, testRockPaperScissors.playerOneWins("scissors", "paper"));
  }

}
