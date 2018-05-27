package de.morigm.minework.api;

import java.time.LocalDateTime;

import de.morigm.minework.api.manager.DateTimeManager;
import de.morigm.minework.other.PluginData;

public class MineWork 
{

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
	
}
