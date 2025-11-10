package me.trucifer.noendermandrops;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
/**
 * Hello world!
 *
 */
public class NoEndermanDrops extends JavaPlugin implements Listener
{
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("NoEndermanDrops Enabled!");
    }

    @Override
    public void onDisable(){
        getLogger().info("NoEndermanDrops Disabled.");
    }

    @EventHandler
    public void onEndermanDeath(EntityDeathEvent event) {
        if (event.getEntityType() == EntityType.ENDERMAN) {
            event.getDrops().clear();
        }
    }
}
