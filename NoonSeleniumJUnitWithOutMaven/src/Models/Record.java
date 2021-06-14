package Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Record
{
	private ArrayList<Assembly> data=new ArrayList<Assembly>();
	private Scanner scanner=new Scanner(System.in);

	public String createNewRecord(Assembly object) 
	{
		data.add(object);
		return object.getAssemblyName()+" has added to the record";
	}

	@Override
	public String toString()
	{
		String hai="";
		System.out.println("Listing all the assembly records");
		for(Assembly ptr:data)
		{
			hai+=ptr+"\n";
		}
		return hai;
	}

	public Assembly readOne(Integer number) 
	{
		for(Assembly temp:data)
		{
			if(temp.getAssembyNumber()==number)
			{
				return temp;
			}
		}
		return null;
	}


	public String delete(Integer number) 
	{
		Assembly yet=null;
		for(Assembly tmp:data)
		{
			if(tmp.getAssembyNumber()==number)
			{
				yet=tmp;break;
			}
		}
		String name=yet.getAssemblyName();
		data.remove(yet);
		return name;
	}


	public String update(Integer number) 
	{
		for(Assembly ptr:data)
		{
			if(ptr.getAssembyNumber()==number)
			{
				System.out.println("Tell us what you wish to update in the "+ptr.getAssemblyName());
				String aspect=scanner.nextLine();// population
				switch(aspect)
				{
				case "population":
					System.out.println("Tell us new population value in the "+ptr.getAssemblyName());
					Integer newone=scanner.nextInt();
					ptr.setAssemblyPopulation(newone);
					return ptr.getAssemblyName()+" has updated the "+aspect;
					
				case "contact":
					System.out.println("Tell us new contact number for the "+ptr.getAssemblyName());
					Long mobile=scanner.nextLong();
					ptr.setAssemblyContact(mobile);
					return ptr.getAssemblyName()+" has updated the "+aspect;
				}
			}
		}
		return "Nothing updated";
	}
}