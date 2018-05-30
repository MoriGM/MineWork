package de.morigm.minework;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.junit.Test;

import de.morigm.minework.listener.MuteListener;

public class MuteListenerTest 
{

	@Test
	public void testPlayer()
	{
		System.out.println("Test MuteLister Player");
		Player player = mock(Player.class);
		when(player.getUniqueId()).thenReturn(UUID.fromString("ab047d5a-7a87-40c4-a869-41f061a9b0cd"));
		World world = mock(World.class);
		when(world.getName()).thenReturn("world");
		Location loc = new Location(world, 0, 0, 0);
		when(player.getLocation()).thenReturn(loc);
		when(player.getWorld()).thenReturn(world);
		
		AsyncPlayerChatEvent asyncPlayerChatEvent = new AsyncPlayerChatEvent(true, player, "Test", null);
		
		MuteListener listener = new MuteListener();
		
		listener.on(asyncPlayerChatEvent);
		
		assertTrue(asyncPlayerChatEvent.isCancelled());
	}
	
	
	@Test
	public void testMessage()
	{
		System.out.println("Test MuteLister Message");
		Player player = mock(Player.class);
		when(player.getUniqueId()).thenReturn(UUID.fromString("88a7b28c-ed0a-41fd-843d-47d513044b0b"));
		World world = mock(World.class);
		when(world.getName()).thenReturn("world");
		Location loc = new Location(world, 0, 0, 0);
		when(player.getLocation()).thenReturn(loc);
		when(player.getWorld()).thenReturn(world);
		
		AsyncPlayerChatEvent asyncPlayerChatEvent = new AsyncPlayerChatEvent(true, player, "Rust", null);
		
		MuteListener listener = new MuteListener();
		
		listener.on(asyncPlayerChatEvent);
		
		assertTrue(asyncPlayerChatEvent.isCancelled());
	}
	
	@Test
	public void testWorld()
	{
		System.out.println("Test MuteLister World");
		Player player = mock(Player.class);
		when(player.getUniqueId()).thenReturn(UUID.fromString("88a7b28c-ed0a-41fd-843d-47d513044b0b"));
		World world = mock(World.class);
		when(world.getName()).thenReturn("Test");
		Location loc = new Location(world, 0, 0, 0);
		when(player.getLocation()).thenReturn(loc);
		when(player.getWorld()).thenReturn(world);
		
		AsyncPlayerChatEvent asyncPlayerChatEvent = new AsyncPlayerChatEvent(true, player, "Test", null);
		
		MuteListener listener = new MuteListener();
		
		listener.on(asyncPlayerChatEvent);
		
		assertTrue(asyncPlayerChatEvent.isCancelled());
	}
}
