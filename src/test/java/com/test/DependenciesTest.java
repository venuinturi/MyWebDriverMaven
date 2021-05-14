package com.test;

import org.testng.annotations.Test;

public class DependenciesTest {
	
	
	@Test (groups= {"regression","smoke"} )
	public void a() {
		System.out.println("Test one execution");
			}
	
	@Test (groups= "prime" )
	public void b() {
		System.out.println("Test two execution");
	}
	
	@Test (dependsOnMethods = {"d","b"})
	public void c() {
		System.out.println("Test three execution");
		}
	
	@Test
	public void d() {
		System.out.println("Test four execution");
		
	}

}
