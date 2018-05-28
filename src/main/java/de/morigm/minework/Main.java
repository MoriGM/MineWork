package de.morigm.minework;

import org.bukkit.plugin.java.JavaPlugin;

import de.morigm.minework.api.console.ConsoleWriter;
import de.morigm.minework.api.manager.MuteManager;
import de.morigm.minework.config.MineWorkConfig;
import de.morigm.minework.config.MuteConfig;
import de.morigm.minework.other.PluginData;
import lombok.Getter;

public class Main extends JavaPlugin
{

	@Getter private static Main instance;
	@Getter private MuteManager mutemanager;
	@Getter private MuteConfig muteConfig;
	@Getter private MineWorkConfig mineWorkConfig;
	
	@Override
	public void onEnable() 
	{
		instance = this;
		this.muteConfig = new MuteConfig();
		this.mutemanager = new MuteManager();
		this.mineWorkConfig = new MineWorkConfig();
		this.mineWorkConfig.load();
		this.muteConfig.load();
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
