package SMA;

import fr.irit.smac.amak.Environment;
import fr.irit.smac.amak.Scheduling;

import java.util.Arrays;

public class Environnement extends Environment 
{
	int[] interval;
	String[] jours;

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

	public Environnement(Scheduling _scheduling, Object[] params) {
		super(_scheduling, params);
		this.interval= this.getTimeInterval();
		this.jours = this.getDays();
	}

}
