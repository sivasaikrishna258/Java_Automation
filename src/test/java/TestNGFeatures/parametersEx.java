package TestNGFeatures;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersEx {

	
	@Test(parameters = {"a","b","c"})
	public void display(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	@Test(parameters="c")
	public void display1(int c) {
		System.out.println(c);
	}
	
	@Test()
	@Parameters("b")
	public void display2(int b) {
		System.out.println(b);
	}
	
}
