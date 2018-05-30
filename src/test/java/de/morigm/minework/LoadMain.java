package de.morigm.minework;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import de.morigm.minework.api.manager.MuteManager;
import de.morigm.minework.config.MineWorkConfig;
import de.morigm.minework.config.MuteConfig;
import de.morigm.minework.interfaces.IPluginTool;
import lombok.Getter;
import lombok.Setter;

public class LoadMain
{
	
	@Getter @Setter private static boolean run = false;
	
	public static void on()
	{
		System.out.println("Test Main register");
		Main main = mock(Main.class);
		IPluginTool plugintool = mock(IPluginTool.class);
		
		//Create MineWorkConfig
		MineWorkConfig mineWorkConfig = new MineWorkConfig();
		mineWorkConfig.prefix = "MineWork";
		mineWorkConfig.playermuted = "You are muted";
		mineWorkConfig.worldmuted = "World is muted";
		mineWorkConfig.chatblocktext = "Word is blocked";
		when(plugintool.getMineWorkConfig()).thenReturn(mineWorkConfig);
		
		//Create MuteConfig
		MuteConfig muteConfig = new MuteConfig();
		muteConfig.player = new ArrayList<>();
		muteConfig.words = new ArrayList<>();
		muteConfig.worlds = new ArrayList<>();
		
		//Register Data to MuteConfig
		muteConfig.player.add("ab047d5a-7a87-40c4-a869-41f061a9b0cd");
		muteConfig.words.add("Rust");
		muteConfig.words.add("C++");
		muteConfig.words.add("C");
		muteConfig.words.add("PHP");
		muteConfig.worlds.add("Test");
		
		//Add MuteConfig to PluginTool
		when(plugintool.getMuteConfig()).thenReturn(muteConfig);
		
		//Add Main to Main
		Main.setInstance(main);
		
		//Set Plugin Tool Data
		MuteManager muteManager = new MuteManager();
		when(plugintool.getMuteManager()).thenReturn(muteManager);
		
		//Register IPluginTool
		Main.setPluginTool(plugintool);
		LoadMain.setRun(true);
	}
	
}
