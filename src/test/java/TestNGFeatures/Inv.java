package TestNGFeatures;

import org.testng.annotations.Test;

public class Inv {
	
	@Test(invocationCount = 3)

	public void st() {
		
		System.out.println("hi");
		
	}

}
