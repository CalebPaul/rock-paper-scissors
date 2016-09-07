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

  public Boolean playerTwoWins(String twoChoice, String oneChoice) {
    Boolean result = false;
    if (twoChoice.equalsIgnoreCase("rock") && oneChoice.equalsIgnoreCase("scissors")) {
      result = true;
    } else if (twoChoice.equalsIgnoreCase("paper") && oneChoice.equalsIgnoreCase("rock")) {
      result = true;
    } else if (twoChoice.equalsIgnoreCase("scissors") && oneChoice.equalsIgnoreCase("paper")) {
      result = true;
    }
    return result;
  }

  public Boolean playerTie(String oneChoice, String twoChoice) {
    Boolean result = false;
    if (oneChoice.equalsIgnoreCase("rock") && twoChoice.equalsIgnoreCase("rock")) {
      result = true;
    } /*else if (oneChoice.equalsIgnoreCase("scissors") && twoChoice.equalsIgnoreCase("scissors")) {
      result = true;
    } */
    return result;
  }
}
