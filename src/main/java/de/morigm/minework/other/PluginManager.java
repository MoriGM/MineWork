package de.morigm.minework.other;

import de.morigm.minework.Main;
import de.morigm.minework.listener.MuteListener;

public class PluginManager
{
	
	public void registerListeners()
	{
		new MuteListener().register(Main.getInstance());
	}
	
	public void registerCommands()
	{
		
	}

}
