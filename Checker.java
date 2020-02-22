package me.proiezrush.posionimmune.timer;

import me.proiezrush.posionimmune.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

public class Checker
{
  private Main plugin;
  
  public Checker(Main plugin) { this.plugin = plugin; }

  
  public void init(Player player) {
    BukkitScheduler scheduler = Bukkit.getScheduler();
    scheduler.runTaskTimer(plugin, () -> {
    	Bukkit.getServer().getOnlinePlayers()
        .stream().filter(p -> p.hasPotionEffect(PotionEffectType.POISON) && p.hasPermission("poison.immune"))
        .forEach(p -> p.removePotionEffect(PotionEffectType.POISON));
    }, 20L, 20L);
  }
}
