package tpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {
	@BeforeSuite
	public void m1() {
		System.out.println("this is Suite");
	}

	@BeforeTest
	public void m2() {
		System.out.println("this is before Test");
	}

	@BeforeClass
	public void m3() {
		System.out.println("this is class");
	}

	@BeforeMethod
	public void m4() {
		System.out.println("this is before method");
	}

	@Test
	public void m5() {
		System.out.println("this is m5");
	}

	@Test
	public void m6() {
		System.out.println("this is m6");
	}

	@AfterMethod
	public void m7() {
		System.out.println("this is after method");
	}

	@AfterClass
	public void m8() {
		System.out.println("this is after class");
	}

	@AfterTest
	public void m9() {
		System.out.println("this is after test");
	}

	@AfterSuite
	public void m10() {
		System.out.println("this is after suite");
	}

}
