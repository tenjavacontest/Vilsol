package com.vilsol.tenjava.utils;

import org.bukkit.ChatColor;
import org.bukkit.block.BlockFace;
import org.bukkit.util.Vector;

public class Utils {

	public static String prefix = ChatColor.GOLD + "[" + ChatColor.AQUA + "E" + ChatColor.GOLD + "] " + ChatColor.AQUA;
	public static String prefixe = ChatColor.GOLD + "[" + ChatColor.AQUA + "E" + ChatColor.GOLD + "] " + ChatColor.DARK_RED;
	
	public static Vector faceToForce(BlockFace face){
		Vector out = new Vector(0, 0, 0);
		if(face == BlockFace.NORTH) out.setZ(-0.2);
		if(face == BlockFace.SOUTH) out.setZ(0.2);
		if(face == BlockFace.EAST) out.setX(0.2);
		if(face == BlockFace.WEST) out.setX(-0.2);
		return out;
	}
	
}
