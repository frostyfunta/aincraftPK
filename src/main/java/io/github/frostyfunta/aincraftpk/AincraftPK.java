package io.github.frostyfunta.aincraftpk;

import io.github.frostyfunta.aincraftpk.listener.LoginListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AincraftPK extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("onEnable is called ! v3");   // Plugin startup logic
        getServer().getPluginManager().registerEvents(new LoginListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
