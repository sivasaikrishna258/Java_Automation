package TestNGFeatures;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersEx2 {

	
	@Test(parameters = {"a1","b1","c1"})
	public void display(int a,int b,int c) {
		System.out.println(a-b-c);
	}
	
	@Test(parameters="c1")
	public void display1(int c) {
		System.out.println(c);
	}
	
	@Test
	@Parameters("b1")
	public void display2(int b) {
		System.out.println(b);
	}
}
