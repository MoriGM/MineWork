package de.morigm.minework.api;

import java.time.LocalDateTime;

import de.morigm.minework.Main;
import de.morigm.minework.api.config.MineWorkConfig;
import de.morigm.minework.api.manager.DateTimeManager;
import de.morigm.minework.api.manager.MuteManager;
import de.morigm.minework.other.PluginData;
import lombok.Getter;

public class MineWork 
{

	@Getter private MineWorkConfig mineWorkConfig = new MineWorkConfig();
	
	public static String getVersion()
	{
		return PluginData.getVersion();
	}
	
	public static DateTimeManager getDateTime()
	{
		return new DateTimeManager();
	}
	
	public static DateTimeManager getDateTime(LocalDateTime now)
	{
		return new DateTimeManager(now);
	}
	
	public static MuteManager getMuteManager()
	{
		return Main.getPluginTool().getMuteManager();
	}
	
	public static String getPrefix()
	{
		return Main.getPluginTool().getMineWorkConfig().prefix;
	}
	
	public static void setPrefix(String prefix)
	{
		Main.getPluginTool().getMineWorkConfig().prefix = prefix;
	}
	
}
