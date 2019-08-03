package tpkg;

import org.testng.annotations.Test;

public class A1 {

	@Test(groups = { "smoke" })
	public void m1() {
		System.out.println("this is m1 ");
	}

	@Test(groups = { "sanity" },dependsOnGroups={"smoke"})
	public void m2() {
		System.out.println("this is m2 ");
	}

	@Test(groups = { "smoke" })
	public void m3() {
		System.out.println("this is m3 ");
	}

	@Test(groups = { "reg" })
	public void m4() {
		System.out.println("this is m4 ");
	}

	@Test(groups = { "reg" })
	public void m5() {
		System.out.println("this is m5 ");
	}
}
