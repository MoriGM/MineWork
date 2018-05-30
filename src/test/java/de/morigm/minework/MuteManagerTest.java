package de.morigm.minework;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.junit.Test;

import de.morigm.minework.api.MineWork;

public class MuteManagerTest 
{
	
	@Test
	public void testadd() 
	{
		if(!LoadMain.isRun())
			LoadMain.on();
		System.out.println("Test MuteManger add");
		Player p = mock(Player.class);
		when(p.getUniqueId()).thenReturn(UUID.fromString("d1625507-0ea0-4833-9d4b-829244b43d2e"));
		MineWork.getMuteManager().addPlayer(p);
		assertTrue(MineWork.getMuteManager().containsPlayer(p));
	}
	
	@Test
	public void testremove()
	{
		if(!LoadMain.isRun())
			LoadMain.on();
		System.out.println("Test MuteManger remove");
		Player p = mock(Player.class);
		when(p.getUniqueId()).thenReturn(UUID.fromString("d1625507-0ea0-4833-9d4b-829244b43d2e"));
		MineWork.getMuteManager().removePlayer(p);
		assertFalse(MineWork.getMuteManager().containsPlayer(p));
	}
	
}
