package TestNGFeatures;

import org.testng.annotations.Test;

public class groupEx2 {
	
	
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("under smoke from calss2");
	}
	
	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("under sanity from class 2");
	}
	
	@Test(groups= {"regression"})
	public void test3() {
		System.out.println("under regression from class2");
	}
}
