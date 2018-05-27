package de.morigm.minework;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

import de.morigm.minework.api.MineWork;

public class TestDateTime 
{
	@Test
	public void testMinute()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		assertEquals(dateTime.getMinute(), MineWork.getDateTime(dateTime).getMinute());
	}
	
	@Test
	public void testDay()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		assertEquals(dateTime.getDayOfMonth(), MineWork.getDateTime(dateTime).getDayOfMonth());
	}
	
	@Test
	public void testWeek()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		assertEquals(dateTime.getDayOfWeek(), MineWork.getDateTime(dateTime).getDayOfWeek());
	}
	
	@Test
	public void testYear()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		assertEquals(dateTime.getYear(), MineWork.getDateTime(dateTime).getYear());
	}
	
	@Test
	public void testAll()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		String s = String.valueOf(dateTime.getMinute()) + String.valueOf(dateTime.getSecond()) + String.valueOf(dateTime.getYear()) + String.valueOf(dateTime.getNano());
		assertEquals(s, MineWork.getDateTime(dateTime).date("msyn"));
	}

}
