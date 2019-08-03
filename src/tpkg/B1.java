package tpkg;

import org.testng.annotations.Test;

public class B1 {

	@Test(groups = { "smoke" })
	public void B11() {
		System.out.println("this is B11 ");
	}

	@Test(groups = { "sanity" })
	public void B2() {
		System.out.println("this is B2 ");
	}

	@Test(groups = { "reg" })
	public void B3() {
		System.out.println("this is B3 ");
	}

	@Test(groups = {"reg"})
	public void B4() {
		System.out.println("this is B4 ");
	}

	@Test(groups = {"sanity"})
	public void B5() {
		System.out.println("this is B5 ");
	}
}
