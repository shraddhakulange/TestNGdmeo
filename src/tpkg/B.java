package tpkg;

//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class B {
	//@Ignore
    @Test(priority=3)
	public void m1() {
	System.out.println("this is m1 ");
	throw new ArithmeticException();
	}
    @Test(priority=2,dependsOnMethods={"m1"},alwaysRun=true)
	public void m2() {
	System.out.println("this is m2 ");
	}
    @Test(priority=1,invocationCount=3)
	public void m3() {
		System.out.println("this is m3 ");
		}
    @Test(priority=0)
	public void m4() {
		System.out.println("this is m4 ");
		}
	
	}

