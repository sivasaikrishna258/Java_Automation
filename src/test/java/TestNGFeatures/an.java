package TestNGFeatures;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class an {

	@BeforeTest
	public void dis3() {
		System.out.println("test0");
	}
	
	@Test
	public void dis() {
		System.out.println("test1");
	}
	
	@Test
	public void dis1() {
		System.out.println("test2");
	}
	@Test
	public void dis2() {
		System.out.println("test3");
	}
}
