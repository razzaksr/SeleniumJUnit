package TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import Models.Assembly;
import Models.Record;

public class TestRecord 
{
	Record record=new Record();
	@Test
	public void testCreate()
	{
		Assembly assembly=new Assembly(87, 207810, "Salem North", "Rajendren", new String[] {"Water","Transpot"}, 98765678765L);
		Assembly assembly1=new Assembly(87, 207810, "Salem North", "Rajendren", new String[] {"Water","Transpot"}, 98765678765L);
		//assertEquals("Salem North has added to the record", record.createNewRecord(assembly));
		assertEquals("Salem North has added to the record", record.createNewRecord(assembly));
		assertSame(assembly, record.data.get(0));
	}
	
	@Test
	public void testList()
	{
		Assembly assembly2=new Assembly(98,312903,"Shivmoga","Jilani",new String[] {"Water","Electricity","Network"},98767876776L);
        Assembly assembly3=new Assembly(12,287945,"Madiwala","Ganavi",new String[] {"Hospitality","Transportation"},1234323454L);
        Assembly assembly4=new Assembly(34,312903,"Bangalore East","Oliver",new String[] {"Agriculture","Traffic","Pollution"},87656787634L);
        ArrayList<Assembly> tmp=(ArrayList<Assembly>)Stream.of(assembly2,assembly3,assembly4).collect(Collectors.toList());
        //record.data.add(assembly2);
        record.data.add(assembly3);record.data.add(assembly4);
        
        assertEquals(tmp, record.data);
	}
	
	@Test
	public void testRead()
	{
		Assembly assembly1=new Assembly(87, 207810, "Salem North", "Rajendren", new String[] {"Water","Transpot"}, 98765678765L);
		Assembly assembly2=new Assembly(98,312903,"Shivmoga","Jilani",new String[] {"Water","Electricity","Network"},98767876776L);
        Assembly assembly3=new Assembly(12,287945,"Madiwala","Ganavi",new String[] {"Hospitality","Transportation"},1234323454L);
        Assembly assembly4=new Assembly(34,312903,"Bangalore East","Oliver",new String[] {"Agriculture","Traffic","Pollution"},87656787634L);
        record.data.add(assembly4);record.data.add(assembly1);
        
        /*assertSame(assembly2, record.readOne(98));
        assertSame(assembly3, record.readOne(12));
        assertSame(assembly4, record.readOne(34));*/
        
        assertNotNull(record.readOne(98));
        assertNull(record.readOne(12));
        
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testDelete()
	{
		Assembly assembly5=new Assembly(97, 207810, "Salem South", "Rajendren", new String[] {"Water","Transpot"}, 98765678765L);
		Assembly assembly1=new Assembly(87, 207810, "Salem North", "Rajendren", new String[] {"Water","Transpot"}, 98765678765L);
		Assembly assembly2=new Assembly(98,312903,"Shivmoga","Jilani",new String[] {"Water","Electricity","Network"},98767876776L);
        Assembly assembly3=new Assembly(12,287945,"Madiwala","Ganavi",new String[] {"Hospitality","Transportation"},1234323454L);
        Assembly assembly4=new Assembly(34,312903,"Bangalore East","Oliver",new String[] {"Agriculture","Traffic","Pollution"},87656787634L);
        record.data.add(assembly4);record.data.add(assembly1);record.data.add(assembly3);record.data.add(assembly2);
        
        assertEquals("Salem North", record.delete(98));
	}
}
