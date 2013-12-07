package com.vilsol.tenjava;

import org.bukkit.plugin.java.JavaPlugin;

import com.vilsol.tenjava.listeners.ItemListener;
import com.vilsol.tenjava.tasks.ItemCalculator;

public class TenJava extends JavaPlugin {

	/*
	 * This plugin will add multiple additions to items like conveyers, item
	 * eating chests etc. It will also add some other random stuff with mobs and
	 * other things.
	 */

	private TenJava plugin;
	private ItemCalculator calc;

	public void onEnable() {
		plugin = this;
		getServer().getPluginManager().registerEvents(new ItemListener(this), this);
		calc = new ItemCalculator(this);
		// Run every 5 ticks
		calc.runTaskTimer(this, 0L, 5L);
	}

	public void onDisable() {

	}

	public TenJava getPlugin() {
		return plugin;
	}

	public ItemCalculator getCalc(){
		return calc;
	}
	
}
