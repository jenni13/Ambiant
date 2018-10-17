package SMA;

import fr.irit.smac.amak.Environment;
import java.time.LocalTime;
import java.util.Arrays;

public class Environnement extends Environment 
{
	
	 int[] interval;
	String[] jours;

	public Environnement()
	{
		
	}
	
	private void setTimeInterval(int [] interval)
	{
		for(int i=0;i<2;i++)
			this.interval[i] = interval[i];
	}
	
	private int[] getTimeInterval()
	{
		return Arrays.copyOf(interval,interval.length);		
	}
	
	private void setDays(String[] jours)
	{
		for(int i=0;i<7;i++)
			this.jours[i] = jours[i];
	}
	
	private String[] getDays()
	{
		return Arrays.copyOf(jours,jours.length);		
	}

}
