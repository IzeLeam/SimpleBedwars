package fr.izeleam.games.bedwars.listeners;

import java.util.HashSet;
import java.util.Set;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListeners implements Listener {

  private final Set<Material> authorizedBlock = new HashSet<>();

public BlockListeners() {
    authorizedBlock.add(Material.WOOL);
    authorizedBlock.add(Material.BED);
    authorizedBlock.add(Material.GLASS);
    authorizedBlock.add(Material.WOOD);
  }

  @EventHandler
  public void onBlockBreak(BlockBreakEvent event) {
    Material blockType = event.getBlock().getType();
    if (!authorizedBlock.contains(blockType)) {
      event.setCancelled(true);
    }
  }

  @EventHandler
  public void onBlockPlace(BlockPlaceEvent event) {
    Material blockType = event.getBlock().getType();
    if (!authorizedBlock.contains(blockType)) {
      event.setCancelled(true);
    }
  }
}
