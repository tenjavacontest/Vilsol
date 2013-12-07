package com.vilsol.tenjava.utils;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.BlockFace;
import org.bukkit.util.Vector;

public class Utils {

	public static String prefix = ChatColor.GOLD + "[" + ChatColor.AQUA + "E" + ChatColor.GOLD + "] " + ChatColor.AQUA;
	public static String prefixe = ChatColor.GOLD + "[" + ChatColor.AQUA + "E" + ChatColor.GOLD + "] " + ChatColor.DARK_RED;
	
	public static Vector faceToForce(BlockFace face){
		Vector out = new Vector(0, 0, 0);
		if(face == BlockFace.NORTH) out.setZ(-0.01);
		if(face == BlockFace.SOUTH) out.setZ(0.01);
		if(face == BlockFace.EAST) out.setX(0.01);
		if(face == BlockFace.WEST) out.setX(-0.01);
		return out;
	}
	
	public static Vector blockFaceToRelative(BlockFace face){
		Vector out = new Vector(0, 0, 0);
		if(face == BlockFace.NORTH) out.setZ(-1);
		if(face == BlockFace.SOUTH) out.setZ(1);
		if(face == BlockFace.EAST) out.setX(1);
		if(face == BlockFace.WEST) out.setX(-1);
		return out;
	}

	public static Vector center(Location align) {
		Vector out = new Vector(0, 0, 0);
		if(align.getX() > align.getBlockX() + 0.5) out.setX(-0.1);
		if(align.getX() < align.getBlockX() + 0.5) out.setX(0.1);
		if(align.getZ() > align.getBlockZ() + 0.5) out.setZ(-0.1);
		if(align.getZ() < align.getBlockZ() + 0.5) out.setZ(0.1);
		return out;
	}
	
}
