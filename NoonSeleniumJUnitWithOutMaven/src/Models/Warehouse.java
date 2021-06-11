package Models;

public class Warehouse 
{
	double[] hai= {9.2,10.4,0.4,13.6,8.2,5.6,10.9,12.8,4.2,9.1,33.0,3.1,7.6};
	public void sort()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int anbu=0;anbu<hai.length;anbu++)
		{
			for(int sidhu=anbu+1;sidhu<hai.length;sidhu++)
			{
				if(hai[anbu]>hai[sidhu])// swap
				{
					double third=hai[anbu];
					hai[anbu]=hai[sidhu];
					hai[sidhu]=third;
				}
			}
		}
	}
	public void print()
	{
		for(double tmp:hai)
		{
			System.out.println(tmp);
		}
	}
}
