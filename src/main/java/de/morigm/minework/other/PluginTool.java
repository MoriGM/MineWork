package de.morigm.minework.other;

import de.morigm.minework.api.manager.MuteManager;
import de.morigm.minework.config.MineWorkConfig;
import de.morigm.minework.config.MuteConfig;
import de.morigm.minework.interfaces.IPluginTool;
import lombok.Getter;

public class PluginTool implements IPluginTool 
{
	
	@Getter private MuteManager muteManager;
	@Getter private MuteConfig muteConfig;
	@Getter private MineWorkConfig mineWorkConfig;
	@Getter private PluginManager pluginManager;
	
	public void load()
	{
		this.muteConfig = new MuteConfig();
		this.muteManager = new MuteManager();
		this.mineWorkConfig = new MineWorkConfig();
		this.pluginManager = new PluginManager();
		this.mineWorkConfig.load();
		this.muteConfig.load();
		this.pluginManager.registerCommands();
		this.pluginManager.registerListeners();
	}
	
	public void save()
	{
		this.mineWorkConfig.save();
		this.muteConfig.save();
	}

}
