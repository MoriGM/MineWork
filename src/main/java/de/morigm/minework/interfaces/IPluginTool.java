package de.morigm.minework.interfaces;

import de.morigm.minework.api.manager.MuteManager;
import de.morigm.minework.config.MineWorkConfig;
import de.morigm.minework.config.MuteConfig;
import de.morigm.minework.other.PluginManager;

public interface IPluginTool 
{
	
	public MuteManager getMuteManager();
	public MuteConfig getMuteConfig();
	public MineWorkConfig getMineWorkConfig();
	public PluginManager getPluginManager();
	
	public void load();
	public void save();
}
