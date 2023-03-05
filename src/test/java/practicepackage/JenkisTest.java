package practicepackage;

import org.testng.annotations.Test;

public class JenkisTest {

	

	@Test(groups= {"sanity"})
	public void Test21() {
		System.out.println("I am in test 21 sanity");
	}
	@Test(groups= {"smoke"})
	public void Test23() {
		System.out.println("I am in test 23 smoke");
	}
}
