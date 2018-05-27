package de.morigm.minework.api.manager;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class DataManager 
{

	private LocalDateTime time;

	public DataManager() 
	{
		this(LocalDateTime.now());
	}

	public DataManager(LocalDateTime now) 
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
	
}
