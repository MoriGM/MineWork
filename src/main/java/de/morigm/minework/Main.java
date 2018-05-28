package de.morigm.minework;

import org.bukkit.plugin.java.JavaPlugin;

import de.morigm.minework.api.console.ConsoleWriter;
import de.morigm.minework.api.manager.MuteManager;
import de.morigm.minework.config.MineWorkConfig;
import de.morigm.minework.config.MuteConfig;
import de.morigm.minework.other.PluginData;
import de.morigm.minework.other.PluginManager;
import lombok.Getter;

public class Main extends JavaPlugin
{

	@Getter private static Main instance;
	@Getter private MuteManager muteManager;
	@Getter private MuteConfig muteConfig;
	@Getter private MineWorkConfig mineWorkConfig;
	@Getter private PluginManager pluginManager;
	
	@Override
	public void onEnable() 
	{
		instance = this;
		this.muteConfig = new MuteConfig();
		this.muteManager = new MuteManager();
		this.mineWorkConfig = new MineWorkConfig();
		this.pluginManager = new PluginManager();
		this.mineWorkConfig.load();
		this.muteConfig.load();
		this.pluginManager.registerCommands();
		this.pluginManager.registerListeners();
		ConsoleWriter.writeMessage(PluginData.getPrefix() + "Plugin is loaded");
	}
	
	@Override
	public void onDisable() 
	{
		this.mineWorkConfig.save();
		this.muteConfig.save();
		ConsoleWriter.writeMessage(PluginData.getPrefix() + "Plugin is stopped");
	}
	
}
