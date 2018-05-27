package de.morigm.minework.other;

import de.morigm.minework.Main;
import lombok.Getter;
import net.md_5.bungee.api.ChatColor;

public class PluginData
{

	@Getter private static final String name = "MineWork";
	@Getter private static final String version = Main.getInstance().getDescription().getVersion();
	@Getter private static final String prefix = ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "MineWork" + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE;
	
}
