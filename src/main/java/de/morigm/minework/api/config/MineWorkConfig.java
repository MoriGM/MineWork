package de.morigm.minework.api.config;

import de.morigm.minework.Main;

public class MineWorkConfig 
{
		public String getPrefix()
		{
			return Main.getInstance().getMineWorkConfig().prefix;
		}
		
		public void setPrefix(String prefix)
		{
			Main.getInstance().getMineWorkConfig().prefix = prefix;
		}
		
		public String getPlayerMuted()
		{
			return Main.getInstance().getMineWorkConfig().playermuted;
		}
		
		public void setPlayerMuted(String playermuted)
		{
			Main.getInstance().getMineWorkConfig().playermuted = playermuted;
		}
		
		public String getWordBlocked()
		{
			return Main.getInstance().getMineWorkConfig().chatblocktext;
		}
		
		public void setWordBlocked(String chatblocktext)
		{
			Main.getInstance().getMineWorkConfig().chatblocktext = chatblocktext;
		}
		
		public String getWorldMuted()
		{
			return Main.getInstance().getMineWorkConfig().worldmuted;
		}
		
		public void setMineWorkConfig(String worldmuted)
		{
			Main.getInstance().getMineWorkConfig().worldmuted = worldmuted;
		}
}
