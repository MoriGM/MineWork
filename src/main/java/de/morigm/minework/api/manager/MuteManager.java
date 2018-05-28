package de.morigm.minework.api.manager;

import org.bukkit.World;
import org.bukkit.entity.Player;

import de.morigm.minework.Main;

public class MuteManager 
{
	
	public void addPlayer(Player p)
	{
		if(!Main.getInstance().getMuteConfig().player.contains(p.getUniqueId().toString()))
			Main.getInstance().getMuteConfig().player.add(p.getUniqueId().toString());
	}
	
	public void removePlayer(Player p)
	{
		if(Main.getInstance().getMuteConfig().player.contains(p.getUniqueId().toString()))
			Main.getInstance().getMuteConfig().player.remove(p.getUniqueId().toString());
	}
	
	public boolean containsPlayer(Player p)
	{
		return Main.getInstance().getMuteConfig().player.contains(p.getUniqueId().toString());
	}
	
	public void addWorld(World w)
	{
		if(!Main.getInstance().getMuteConfig().worlds.contains(w.getName()))
			Main.getInstance().getMuteConfig().worlds.add(w.getName());
	}
	
	public void removeWorld(World w)
	{
		if(Main.getInstance().getMuteConfig().worlds.contains(w.getName()))
			Main.getInstance().getMuteConfig().worlds.remove(w.getName());
	}
	
	public boolean containsWord(World w)
	{
		return Main.getInstance().getMuteConfig().worlds.contains(w.getName());
	}
	
	public void addWord(String s)
	{
		if(!Main.getInstance().getMuteConfig().player.contains(s))
			Main.getInstance().getMuteConfig().player.add(s);
	}
	
	public void removeWord(String s)
	{
		if(Main.getInstance().getMuteConfig().words.contains(s))
			Main.getInstance().getMuteConfig().words.remove(s);
	}
	
	public boolean containsWord(String s)
	{
		return Main.getInstance().getMuteConfig().words.contains(s);
	}
}
