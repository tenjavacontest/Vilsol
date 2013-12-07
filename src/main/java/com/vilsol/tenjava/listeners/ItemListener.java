package com.vilsol.tenjava.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import com.vilsol.tenjava.TenJava;

public class ItemListener implements Listener {

	private TenJava plugin;
	
	public ItemListener(TenJava plugin){
		this.plugin = plugin;
		
	}
	
	@EventHandler
	public void onItemDrop(PlayerDropItemEvent evt){
		plugin.getCalc().addItemToFollow(evt.getItemDrop());
	}
	
}
