package de.morigm.minework.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.morigm.minework.Main;
import de.morigm.minework.api.helper.ListenerHelper;
import de.morigm.minework.other.PluginData;

public class MuteListener implements ListenerHelper
{
	@EventHandler
	public void on(AsyncPlayerChatEvent e)
	{
		for(String s : Main.getInstance().getMuteConfig().words)
			if(e.getMessage().contains(s))
			{
				e.setCancelled(true);
				e.getPlayer().sendMessage(PluginData.getPrefix() + Main.getInstance().getMineWorkConfig().chatblocktext);
				break;
			}
		if(Main.getInstance().getMuteManager().containsPlayer(e.getPlayer()))
		{
			e.setCancelled(true);
			
		}
	}
}