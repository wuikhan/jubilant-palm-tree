package testNG;

import org.testng.annotations.Test;

public class Day02_Priority {
	
	@Test(priority=1)
	public void d() {
		System.out.println("method 1");
	}
	
	@Test(priority=2)
	public void c() {
		System.out.println("method 2");
	}
	
	@Test(priority=3)
	public void b() {
		System.out.println("method 3");
	}
	
	@Test(priority=0)
	public void a() {
		System.out.println("method 4");
	}
	
	@Test // if you don't assign priority by default it is going to be 0
	public void e() {
		System.out.println("method 5");
	}
	
	@Test
	public void f() {
		System.out.println("method 6");
	}

}
