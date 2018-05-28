package de.morigm.minework.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.morigm.minework.Main;

public class MuteListener
{
	@EventHandler
	public void on(AsyncPlayerChatEvent e)
	{
		for(String s : Main.getInstance().getMuteConfig().words)
			if(e.getMessage().contains(s))
			{
				e.setCancelled(true);
	
			}

	}
}