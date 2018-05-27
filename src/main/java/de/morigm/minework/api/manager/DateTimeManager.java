package de.morigm.minework.api.manager;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeManager 
{

	private LocalDateTime time;

	public DateTimeManager() 
	{
		this(LocalDateTime.now());
	}

	public DateTimeManager(LocalDateTime now) 
	{
		this.time = now;
	}
	
	public int getMinute()
	{
		return this.time.getMinute();
	}
	
	public int getSecond()
	{
		return this.time.getSecond();
	}
	
	public int getDayOfMonth()
	{
		return this.time.getDayOfMonth();
	}
	
	public DayOfWeek getDayOfWeek()
	{
		return this.time.getDayOfWeek();
	}
	
	public int getYear()
	{
		return this.time.getYear();
	}
	
	public int getDayOfYear()
	{
		return this.time.getDayOfYear();
	}
	
	public Month getMonth()
	{
		return this.time.getMonth();
	}
	
	public int getHour()
	{
		return this.time.getHour();
	}
	
	public int getMonthValue()
	{
		return this.time.getMonthValue();
	}
	
	public int getNano()
	{
		return this.time.getNano();
	}
	
	
	/*
	 * m: Minute
	 * d: Day
	 * w: Week Day
	 * s: Second
	 * n: Nano seconds
	 * y: Year
	 * Y: Day of the Year
	 */
	public String date(String s)
	{
		s = s.replaceAll("m", String.valueOf(time.getMinute()));
		s = s.replaceAll("d", String.valueOf(time.getDayOfMonth()));
		s = s.replaceAll("s", String.valueOf(time.getSecond()));
		s = s.replaceAll("n", String.valueOf(time.getNano()));
		s = s.replaceAll("w", String.valueOf(time.getDayOfWeek()));
		s = s.replaceAll("y", String.valueOf(time.getYear()));
		s = s.replaceAll("Y", String.valueOf(time.getDayOfYear()));
		return s;
	}
}
