package dev.larrox.letblocksactlikesand.events;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.FallingBlock;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.util.Vector;

public class ExplosionEvent implements Listener {

    @EventHandler
    public void onExplode(EntityExplodeEvent event) {
        World world = event.getLocation().getWorld();

        event.blockList().forEach(block -> {
            Material material = block.getType();
            if (material != Material.AIR) {
                FallingBlock fallingBlock = world.spawnFallingBlock(block.getLocation(), material.createBlockData());

                Vector direction = new Vector(
                        Math.random() * 2 - 1,
                        Math.random() * 6,
                        Math.random() * 2 - 1
                ).normalize().multiply(1.0);

                fallingBlock.setVelocity(direction);
            }

            block.setType(Material.AIR);
        });
    }
}
