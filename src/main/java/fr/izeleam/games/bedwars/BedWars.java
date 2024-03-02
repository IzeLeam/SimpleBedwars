package fr.izeleam.games.bedwars;

import fr.izeleam.games.bedwars.listeners.BlockListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class BedWars extends JavaPlugin {

    private static BedWars Instance;

    public static BedWars getInstance() {
        return Instance;
    }

    @Override
    public void onEnable() {
        Instance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerCommands() {

    }

    private void registerListeners() {
      PluginManager pm = getServer().getPluginManager();

      pm.registerEvents(new BlockListeners(), this);
    }
}
