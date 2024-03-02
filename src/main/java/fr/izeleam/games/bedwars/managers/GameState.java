package fr.izeleam.games.bedwars.managers;

public enum GameState {
  WAITING, STARTING, IN_GAME, ENDING, RESTARTING;

  private static GameState currentState;

  public static GameState getCurrentState() {
    return currentState;
  }

  public static void setCurrentState(GameState state) {
    currentState = state;
  }

  public static boolean isState(GameState state) {
    return currentState == state;
  }

  public static boolean isState(GameState... states) {
    for (GameState state : states) {
      if (currentState == state) {
        return true;
      }
    }
    return false;
  }
}
