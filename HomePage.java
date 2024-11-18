package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class HomePage {
  @Test
	public void m1() {
		System.out.println("method m1");
	}
@BeforeClass
public void beforeClass() {
	  System.out.println("before class");
}

@AfterClass
public void afterClass() {
	  System.out.println("after class");
}


@Test
public void mainTest() {
  throw new RuntimeException("Test not implemented");
}
}
