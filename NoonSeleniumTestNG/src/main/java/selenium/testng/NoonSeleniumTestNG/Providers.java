package selenium.testng.NoonSeleniumTestNG;

import java.util.ArrayList;

public class Providers 
{
	private ArrayList<Double> seek=new ArrayList<Double>();
	
	public boolean adding(double term)
	{
		return seek.add(term);
	}
	
	public String toString()
	{
		return seek.toString();
	}
	
	public int length()
	{
		return seek.size();
	}
}
