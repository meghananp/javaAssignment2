package com.stackroute;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;

public class TestNew {
	
	JavaTestPal cls;
	
	
  
    @Before
    public void setup(){
    	cls=new JavaTestPal();
    }
        
        
    @After
    public void cleanup()
    {
       cls=null;
    }
    @AfterClass
    public static void oneTimeCleanup()
    {
        
    }
    @Test(timeout = 100)
    public void testDataAccessTimeout(){
        
    }
   
	@Test
	public void TestPal()
	{
		//arrange
		String str1="12321";
		//String str2="abc";
				
		//act
		boolean res=cls.checkPalendrome(str1);
		
		//assert
		assertTrue(res);
	}
	
	@Test
	public void TestPal1()
	{
		//arrange
		String str1="123212";
		//String str2="abc";
				
		//act
		boolean res=cls.checkPalendrome(str1);
		
		//assert
		assertFalse(res);
	}
	
	@Test
	public void TestPal2()
	{
		//arrange
		String str1="1232 12";
		//String str2="abc";
				
		//act
		boolean res=cls.checkPalendrome(str1);
		
		//assert
		assertFalse(res);
	}
	
	@Test
	public void TestPal3()
	{
		//arrange
		String str1="1232@12";
		//String str2="abc";
				
		//act
		boolean res=cls.checkPalendrome(str1);
		
		//assert
		assertFalse(res);
	}
}
