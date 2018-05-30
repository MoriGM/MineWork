package de.morigm.minework;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest 
{

	@Test
	public void testMain()
	{
		if(!LoadMain.isRun())
			LoadMain.on();
		System.out.println("Test Main");
		assertTrue(Main.getInstance() != null);
	}
	
	@Test
	public void testPluginTool()
	{
		if(!LoadMain.isRun())
			LoadMain.on();
		System.out.println("Test PluginTool");
		assertTrue(Main.getPluginTool() != null);
	}
	
}
