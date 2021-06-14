package TestCases;

import static org.junit.Assert.assertEquals;

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
		//assertEquals("Salem North has added to the record", record.createNewRecord(assembly));
		assertEquals("Salem North has added to the record", record.createNewRecord(assembly));
	}
}
