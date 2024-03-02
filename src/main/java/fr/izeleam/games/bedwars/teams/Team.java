package fr.izeleam.games.bedwars.teams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class Team {

  List<Player> players = new ArrayList<>();
  private TeamColor color;

  public Team(TeamColor color) {
    this.color = color;
  }

  public void addPlayer(Player player) {
    players.add(player);
  }

  public void removePlayer(Player player) {
    players.remove(player);
  }

  public boolean isMember(Player player) {
    return players.contains(player);
  }

  public List<Player> getPlayers() {
    return players;
  }

  public void setColor(TeamColor color) {
    this.color = color;
  }

  public TeamColor getColor() {
    return color;
  }

  public boolean isBedAlive() {
    return true;
  }

  public int alivePlayersCount() {
    return (int) players.stream().filter(p -> p.getGameMode() != GameMode.SPECTATOR).count();
  }
}
