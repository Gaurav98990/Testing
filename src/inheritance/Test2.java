package inheritance;

import org.testng.annotations.Test;

public class Test2 extends Test1{

	
	@Test
	public void Test2(){
		System.out.println("Test2");
		
		Test2 test= new Test2();
		
		
		
		test.bb();
	}
}
