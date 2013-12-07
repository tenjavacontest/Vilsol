package com.vilsol.tenjava.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Chest;
import org.bukkit.entity.Item;
import org.bukkit.material.Diode;
import org.bukkit.scheduler.BukkitRunnable;

import com.vilsol.tenjava.TenJava;
import com.vilsol.tenjava.utils.Utils;

@SuppressWarnings("unused")
public class ItemCalculator extends BukkitRunnable {

	private TenJava plugin;
	private List<Item> following = new ArrayList<Item>();
	
	public ItemCalculator(TenJava plugin){
		this.plugin = plugin;
	}
	
	public void addItemToFollow(Item item){
		if(!following.contains(item)){
			following.add(item);
		}
	}
	
	public void removeItem(Item item){
		if(following.contains(item)){
			following.remove(item);
		}
	}
	
	public void run() {
		Iterator<Item> iterator = following.iterator();
		while(iterator.hasNext()){
			Item i = iterator.next();

			if(i.isDead() || !i.isValid()){
				iterator.remove();
				continue;
			}

			Block myBlock = i.getLocation().getBlock();

			if(myBlock.getType() == Material.DIODE_BLOCK_ON){
				Diode b = (Diode) myBlock.getState().getData();
				i.setVelocity(i.getVelocity().add(Utils.faceToForce(b.getFacing())));
			}else if(myBlock.getRelative(BlockFace.DOWN).getType() == Material.CHEST){
				Chest c = (Chest) myBlock.getRelative(BlockFace.DOWN).getState();
				c.getInventory().addItem(i.getItemStack());
				i.remove();
			}
		}
	}

}
