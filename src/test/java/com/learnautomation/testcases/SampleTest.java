package com.learnautomation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest 
{
	
	@Test
	public void sample1()
	{
		System.out.println("Hello 1");
	}
	
	@Test
	public void sample2()
	{
		System.out.println("Hello 2");
		System.out.println("Hello 2.1");
		System.out.println("Hello 2.2");
	}
	
	@Test
	public void sample3()
	{
		System.out.println("Hello 3");
		System.out.println("Hello 4");
		System.out.println("Hello 5");
		System.out.println("Hello 6");
		Assert.assertTrue(true);
	}

}
