package tpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C {
	
	@Parameters({"num1","num2"})
    @Test
	public void m1(String num1,String num2) {
		System.out.println("parameter pass:" +num1);  
		System.out.println("parameter pass:" +num2);  

		}
	
	    @Test
		public void m2() {
		System.out.println("this is m2 ");
		}
}
                