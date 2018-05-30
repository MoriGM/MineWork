package de.morigm.minework.api.manager;

import org.bukkit.World;
import org.bukkit.entity.Player;

import de.morigm.minework.Main;

public class MuteManager 
{
	
	public void addPlayer(Player p)
	{
		if(!Main.getPluginTool().getMuteConfig().player.contains(p.getUniqueId().toString()))
			Main.getPluginTool().getMuteConfig().player.add(p.getUniqueId().toString());
	}
	
	public void removePlayer(Player p)
	{
		if(Main.getPluginTool().getMuteConfig().player.contains(p.getUniqueId().toString()))
			Main.getPluginTool().getMuteConfig().player.remove(p.getUniqueId().toString());
	}
	
	public boolean containsPlayer(Player p)
	{
		return Main.getPluginTool().getMuteConfig().player.contains(p.getUniqueId().toString());
	}
	
	public void addWorld(World w)
	{
		if(!Main.getPluginTool().getMuteConfig().worlds.contains(w.getName()))
			Main.getPluginTool().getMuteConfig().worlds.add(w.getName());
	}
	
	public void removeWorld(World w)
	{
		if(Main.getPluginTool().getMuteConfig().worlds.contains(w.getName()))
			Main.getPluginTool().getMuteConfig().worlds.remove(w.getName());
	}
	
	public boolean containsWord(World w)
	{
		return Main.getPluginTool().getMuteConfig().worlds.contains(w.getName());
	}
	
	public void addWord(String s)
	{
		if(!Main.getPluginTool().getMuteConfig().player.contains(s))
			Main.getPluginTool().getMuteConfig().player.add(s);
	}
	
	public void removeWord(String s)
	{
		if(Main.getPluginTool().getMuteConfig().words.contains(s))
			Main.getPluginTool().getMuteConfig().words.remove(s);
	}
	
	public boolean containsWord(String s)
	{
		return Main.getPluginTool().getMuteConfig().words.contains(s);
	}
}
