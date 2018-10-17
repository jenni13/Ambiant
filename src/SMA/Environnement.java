package SMA;

import fr.irit.smac.amak.Environment;
<<<<<<< HEAD
import java.time.LocalTime;
import java.util.Arrays;
=======
import fr.irit.smac.amak.Scheduling;
>>>>>>> branch 'master' of https://github.com/jenni13/Ambiant.git

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

	public Environnement(Scheduling _scheduling, Object[] params) {
		super(_scheduling, params);
		// TODO Auto-generated constructor stub
	}

}
