package de.morigm.minework;

import org.bukkit.plugin.java.JavaPlugin;

import de.morigm.minework.api.console.ConsoleWriter;
import de.morigm.minework.other.PluginData;
import lombok.Getter;

public class Main extends JavaPlugin
{

	@Getter private static Main instance;
	
	@Override
	public void onEnable() 
	{
		instance = this;
		ConsoleWriter.writeMessage(PluginData.getPrefix() + "Plugin is loaded");
	}
	
	@Override
	public void onDisable() 
	{
		ConsoleWriter.writeMessage(PluginData.getPrefix() + "Plugin is stopped");
	}
	
}
