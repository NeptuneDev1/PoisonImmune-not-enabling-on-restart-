package me.proiezrush.posionimmune;

import me.proiezrush.posionimmune.timer.Checker;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin {
  private PluginDescriptionFile description = getDescription();
  
  private String PREFIX = getConfig().getString("PREFIX");

  
  public void onEnable() {
    registerEvents();
    registerCommands();
    
    messages(true);
  }


  
  public void onDisable() { messages(false); }

  
  private void registerEvents() {
    Checker checker = new Checker(this);
    for (Player players : Bukkit.getOnlinePlayers()) {
      checker.init(players);
    }
  }

  
  private void registerCommands() {}

  
  private void messages(boolean b) {
    ConsoleCommandSender c = Bukkit.getConsoleSender();
    if (b) {
      c.sendMessage(c(this.PREFIX + "&aPlugin enabled by &e" + this.description.getAuthors()));
    } else {
      
      c.sendMessage(c(this.PREFIX + "&aPlugin disabled by &e" + this.description.getAuthors()));
    } 
    c.sendMessage(c(this.PREFIX + "&aVersion &e" + this.description.getVersion()));
  }

  
  private String c(String msg) { return ChatColor.translateAlternateColorCodes('&', msg); }
}
