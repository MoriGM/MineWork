package de.morigm.minework.config;

import org.bukkit.configuration.file.FileConfiguration;

import de.morigm.minework.Main;
import de.morigm.minework.other.PluginData;

public class MineWorkConfig
{
	
	public String prefix;
	public String chatblocktext;

	public void loaddefault()
	{
		getConfig().options().copyDefaults(true);
		getConfig().addDefault("prefix", PluginData.getPrefix());
		getConfig().addDefault("chatblocktext", "This word is not allowed!");
		getConfig().addDefault("worldmuted", "This World is muted!");
		getConfig().addDefault("worldmuted", "This World is muted!");
		
	}
	
	public void load()
	{
		loaddefault();
		this.prefix = getConfig().getString("prefix");
		this.chatblocktext = getConfig().getString("chatblocktext");
	}
	
	public void save()
	{
		Main.getInstance().saveConfig();
	}
	
	private FileConfiguration getConfig()
	{
		return Main.getInstance().getConfig();
	}
}
