package dev.larrox.letblocksactlikesand;

import dev.larrox.letblocksactlikesand.events.ExplosionEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LetBlocksActLikeSand extends JavaPlugin {

//    @Override
//    public void onLoad() {
//        // Plugin First load logic
//    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ExplosionEvent(), this);

    }

//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic
//    }
}
