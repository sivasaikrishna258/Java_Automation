package TestNGFeatures;

import org.testng.annotations.Test;

public class gropusEx {

	
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("under smoke");
	}
	
	@Test(groups={"sanity"})
	public void test2() {
		System.out.println("under sanity");
	}
	
	@Test(groups="regression")
	public void test3() {
		System.out.println("under regression");
	}
}
