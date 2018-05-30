package de.morigm.minework;

import org.bukkit.plugin.java.JavaPlugin;

import de.morigm.minework.api.console.ConsoleWriter;
import de.morigm.minework.interfaces.IPluginTool;
import de.morigm.minework.other.PluginData;
import de.morigm.minework.other.PluginTool;
import lombok.Getter;
import lombok.Setter;

public class Main extends JavaPlugin
{

	@Setter @Getter private static Main instance;
	@Setter @Getter private static IPluginTool pluginTool;
	
	
	@Override
	public void onEnable() 
	{
		Main.instance = this;
		Main.pluginTool = new PluginTool();
		Main.pluginTool.load();
		ConsoleWriter.writeMessage(PluginData.getPrefix() + "Plugin is loaded");
	}
	
	@Override
	public void onDisable() 
	{
		Main.pluginTool.save();
		ConsoleWriter.writeMessage(PluginData.getPrefix() + "Plugin is stopped");
	}
	
}
