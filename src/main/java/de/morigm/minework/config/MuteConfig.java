package de.morigm.minework.config;

import java.io.File;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import de.morigm.minework.other.PluginData;
import lombok.SneakyThrows;

public class MuteConfig 
{
	
	private FileConfiguration config;
	public List<String> worlds;
	public List<String> player;
	public List<String> words;

	public void load()
	{
		FileConfiguration conf = YamlConfiguration.loadConfiguration(new File("./plugins/" + PluginData.getName() + "/mute.yml"));
		this.config = conf;
		loadConfig();
	}
	
	public void loadConfig()
	{
		this.worlds = this.config.getStringList("worlds");
		this.player = this.config.getStringList("player");
		this.words = this.config.getStringList("words");
	}
	
	@SneakyThrows
	public void save()
	{
		this.config.save(new File("./plugins/" + PluginData.getName() + "/mute.yml"));
	}

}
