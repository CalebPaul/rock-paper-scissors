public class RockPaperScissors {
  public Boolean playerOneWins(String oneChoice, String twoChoice) {
    Boolean result = false;
    if (oneChoice.equalsIgnoreCase("rock") && twoChoice.equalsIgnoreCase("scissors")) {
      result = true;
    } else if (oneChoice.equalsIgnoreCase("paper") && twoChoice.equalsIgnoreCase("rock")) {
      result = true;
    } else if (oneChoice.equalsIgnoreCase("scissors") && twoChoice.equalsIgnoreCase("paper")) {
      result = true;
    }
    return result;
  }
}
