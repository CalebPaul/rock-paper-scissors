import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void playerOneWins_PlayerOneWinsRock_True() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Boolean expected = true;
    assertEquals(expected, testRockPaperScissors.playerOneWins("rock", "scissors"));
  }

  @Test
  public void playerOneWins_PlayerOneWinsPaper_True() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Boolean expected = true;
    assertEquals(expected, testRockPaperScissors.playerOneWins("paper", "rock"));
  }

  @Test
  public void playerOneWins_PlayerOneWinsScissors_True() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Boolean expected = true;
    assertEquals(expected, testRockPaperScissors.playerOneWins("scissors", "paper"));
  }

  @Test
  public void playerTwoWins_PlayerTwoWinsRock_True() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Boolean expected = true;
    assertEquals(expected, testRockPaperScissors.playerTwoWins("rock", "scissors"));
  }

  @Test
  public void playerTwoWins_PlayerTwoWinsPaper_True() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Boolean expected = true;
    assertEquals(expected, testRockPaperScissors.playerTwoWins("paper", "rock"));
  }

  @Test
  public void playerTwoWins_PlayerTwoWinsScissors_True() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Boolean expected = true;
    assertEquals(expected, testRockPaperScissors.playerTwoWins("scissors", "paper"));
  }

  @Test
  public void playerTie_playerTieRock_True() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    Boolean expected = true;
    assertEquals(expected, testRockPaperScissors.playerTie("rock", "rock"));
  }

  @Test
  public void playerTie_playerTieScissors_True() {
    Rock
  }
}
