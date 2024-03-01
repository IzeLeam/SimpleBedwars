package fr.izeleam.games.bedwars.game;

import fr.izeleam.games.bedwars.BedWars;

public class GameManager {

  private final BedWars plugin;
  private GameState gameState;

  public GameManager(BedWars plugin) {
    this.plugin = plugin;
  }

  public GameState getGameState() {
    return gameState;
  }

  public void setGameState(GameState gameState) {
    this.gameState = gameState;

    // TODO: Handle game state changes
  }



}
