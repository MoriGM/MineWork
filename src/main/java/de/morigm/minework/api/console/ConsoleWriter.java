package de.morigm.minework.api.console;

import org.bukkit.Bukkit;

public class ConsoleWriter
{

	public static void writeMessage(String s)
	{
		Bukkit.getConsoleSender().sendMessage(s);
	}
	
	public static void writeMessage(String[] s)
	{
		Bukkit.getConsoleSender().sendMessage(s);
	}
	
}
