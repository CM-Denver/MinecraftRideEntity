package com.william.plugin;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		System.out.println("RideEntity plugin has worked (sorta)");
		
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("RideEntity plugin disabled");
	}
	
	@EventHandler
	public void OnInteract(PlayerInteractEntityEvent e) {
		
		//If player right-clicks an entity, the player will be riding that entity:
		e.getRightClicked().addPassenger(e.getPlayer());
		
	}
}
