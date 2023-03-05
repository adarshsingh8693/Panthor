package practicepackage;

import org.testng.annotations.Test;

public class CMDExcecutionTest{
	
	@Test
	public void  test() {
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		
	}

}
