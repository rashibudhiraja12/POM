package com.testng.tutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgExamples {

	@Test(testName="Simple Test", description="Performs simple test", priority=3, groups="Sanity")
	public void test1() {
		String actualValue = "Jatin";
		String expectValue = "Jatin Sharma";
		Assert.assertTrue(expectValue.contains(actualValue));
	}

	@Test(testName="Simple Test", description="Performs simple test2", priority=1,groups="Sanity")
	public void test2() {
		String actualValue = "Jatin";
		String expectValue = "Jatin Sharma";
		Assert.assertTrue(expectValue.contains(actualValue));
	}

	@Test(testName="Simple Test", description="Performs simple test3", priority=2,groups="E2E")
	public void test3() {
		String actualValue = "Jatin";
		String expectValue = "Jatin Sharma";
		Assert.assertTrue(expectValue.contains(actualValue));
	}

	@Test(testName="Simple Test", description="Performs simple test4", priority=6,groups="Regression")
	public void test4() {
		String actualValue = "Jatin";
		String expectValue = "Jatin Sharma";
		Assert.assertTrue(expectValue.contains(actualValue));
	}

	@Test(testName="Simple Test", description="Performs simple test5", priority=4)
	public void test5() {
		String actualValue = "Jatin";
		String expectValue = "Jatin Sharma";
		Assert.assertTrue(expectValue.contains("2435345"));
	}

	@Test(testName="Simple Test6", description="Performs simple test6", priority=5)
	public void test6() {
		String actualValue = "Jatin";
		String expectValue = "Jatin Sharma";
		Assert.assertTrue(expectValue.contains(actualValue));
	}
}
