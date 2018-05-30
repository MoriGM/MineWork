package de.morigm.minework.api.config;

import de.morigm.minework.Main;

public class MineWorkConfig 
{
		public String getPrefix()
		{
			return Main.getPluginTool().getMineWorkConfig().prefix;
		}
		
		public void setPrefix(String prefix)
		{
			Main.getPluginTool().getMineWorkConfig().prefix = prefix;
		}
		
		public String getPlayerMuted()
		{
			return Main.getPluginTool().getMineWorkConfig().playermuted;
		}
		
		public void setPlayerMuted(String playermuted)
		{
			Main.getPluginTool().getMineWorkConfig().playermuted = playermuted;
		}
		
		public String getWordBlocked()
		{
			return Main.getPluginTool().getMineWorkConfig().chatblocktext;
		}
		
		public void setWordBlocked(String chatblocktext)
		{
			Main.getPluginTool().getMineWorkConfig().chatblocktext = chatblocktext;
		}
		
		public String getWorldMuted()
		{
			return Main.getPluginTool().getMineWorkConfig().worldmuted;
		}
		
		public void setMineWorkConfig(String worldmuted)
		{
			Main.getPluginTool().getMineWorkConfig().worldmuted = worldmuted;
		}
}
