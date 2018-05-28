package de.morigm.minework.config;

import org.bukkit.configuration.file.FileConfiguration;

import de.morigm.minework.Main;

public class MineWorkConfig
{
	
	public String chatblocktext;

	public void loaddefault()
	{
		getConfig().options().copyDefaults(true);
		getConfig().addDefault("chatblocktext", "This word is not allowed!");
	}
	
	public void load()
	{
		loaddefault();
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
