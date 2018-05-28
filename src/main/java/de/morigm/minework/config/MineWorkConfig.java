package de.morigm.minework.config;

import org.bukkit.configuration.file.FileConfiguration;

import de.morigm.minework.Main;
import de.morigm.minework.other.PluginData;

public class MineWorkConfig
{
	
	public String prefix;
	public String chatblocktext;
	public String playermuted;
	public String worldmuted;

	public void loaddefault()
	{
		getConfig().options().copyDefaults(true);
		getConfig().addDefault("prefix", PluginData.getPrefix());
		getConfig().addDefault("chatblocktext", "This word is not allowed!");
		getConfig().addDefault("playermuted", "You are muted!");
		getConfig().addDefault("worldmuted", "This World is muted!");
		
	}
	
	public void load()
	{
		loaddefault();
		this.prefix = getConfig().getString("prefix");
		this.playermuted = getConfig().getString("playermuted");
		this.chatblocktext = getConfig().getString("chatblocktext");
		this.worldmuted = getConfig().getString("worldmuted");
	}
	
	public void save()
	{
		this.getConfig().set("prefix", prefix);
		this.getConfig().set("playermuted", playermuted);
		this.getConfig().set("chatblocktext", chatblocktext);
		this.getConfig().set("worldmuted", worldmuted);
		Main.getInstance().saveConfig();
	}
	
	private FileConfiguration getConfig()
	{
		return Main.getInstance().getConfig();
	}
}
