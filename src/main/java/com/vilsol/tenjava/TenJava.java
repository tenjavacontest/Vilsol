package com.vilsol.tenjava;

import org.bukkit.plugin.java.JavaPlugin;

import com.vilsol.tenjava.listeners.ItemListener;
import com.vilsol.tenjava.tasks.EntityCalculator;

public class TenJava extends JavaPlugin {

	/*
	 * This plugin will add multiple additions to items like conveyers, item
	 * eating chests etc. It will also add some other random stuff with mobs and
	 * other things.<br />
	 * <br/>
	 * Sheep were harmed in making of this plugin.
	 */

	private TenJava plugin;
	private EntityCalculator calc;

	public void onEnable() {
		plugin = this;
		getServer().getPluginManager().registerEvents(new ItemListener(this), this);
		calc = new EntityCalculator(this);
		// Run every 5 ticks
		calc.runTaskTimer(this, 0L, 2L);
	}

	public void onDisable() {

	}

	public TenJava getPlugin() {
		return plugin;
	}

	public EntityCalculator getCalc(){
		return calc;
	}
	
}
