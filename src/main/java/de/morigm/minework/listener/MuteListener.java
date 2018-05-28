package de.morigm.minework.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.morigm.minework.Main;
import de.morigm.minework.api.MineWork;
import de.morigm.minework.api.helper.ListenerHelper;

public class MuteListener implements ListenerHelper
{
	@EventHandler
	public void on(AsyncPlayerChatEvent e)
	{
		boolean cancelled = false;
		for(String s : Main.getInstance().getMuteConfig().words)
			if(e.getMessage().contains(s))
			{
				cancelled = true;
				e.getPlayer().sendMessage(MineWork.getPrefix() + Main.getInstance().getMineWorkConfig().chatblocktext);
				break;
			}
		if(Main.getInstance().getMuteManager().containsPlayer(e.getPlayer()))
		{
			cancelled = true;
			e.getPlayer().sendMessage(MineWork.getPrefix() + Main.getInstance().getMineWorkConfig().playermuted);
		}
		for(String s : Main.getInstance().getMuteConfig().worlds)
			if(s.equalsIgnoreCase(e.getPlayer().getWorld().getName()))
			{
				cancelled = true;
				e.getPlayer().sendMessage(MineWork.getPrefix() + Main.getInstance().getMineWorkConfig().playermuted);
			}
		e.setCancelled(cancelled);
	}
}