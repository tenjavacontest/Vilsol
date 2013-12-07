package com.vilsol.tenjava.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import com.vilsol.tenjava.TenJava;
import com.vilsol.tenjava.utils.Utils;

public class CleanupCommand implements CommandExecutor {

	private TenJava plugin;
	
	public CleanupCommand(TenJava tenJava) {
		this.plugin = tenJava;
	}

	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		arg0.sendMessage(Utils.prefix + "Cleaned up " + (plugin.getCalc().getAllEntities().size() - Bukkit.getOnlinePlayers().length) + " entities!");
		for(Entity e : plugin.getCalc().getAllEntities()){
			if(e instanceof Player) continue;
			e.remove();
		}
		return true;
	}

}
