package TestNGFeatures;

import org.testng.annotations.Test;

public class dependencyMethodsEx {

	@Test(dependsOnMethods = {"WebLgin"})
	public void APILgin() {
		System.out.println("api");
	}

	@Test
	public void MobileLgin() {
		System.out.println("mobile");
	}
	
	@Test()
	public void WebLgin() {
		System.out.println("web");
	}
}
