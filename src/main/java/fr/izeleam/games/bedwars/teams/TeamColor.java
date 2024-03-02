package fr.izeleam.games.bedwars.teams;

import org.bukkit.ChatColor;

public enum TeamColor {

  YELLOW,
  BLUE,
  GREEN,
  RED,
  AQUA,
  WHITE,
  PINK,
  GRAY;

  public String formattedName() {
    return name().charAt(0) + name().substring(1).toLowerCase();
  }

  public ChatColor getChatColor() {
    return ChatColor.valueOf(name());
  }
}
