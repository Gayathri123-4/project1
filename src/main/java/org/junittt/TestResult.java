package org.junittt;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResult {
	
	@Test
	public  void TestResult1() {
		
		
		Result r = JUnitCore.runClasses(A.class,B.class,C.class);
		
		System.out.println("Run Count..........."+r.getRunCount());
		System.out.println("Failure count..........."+r.getFailureCount());
		System.out.println("Run time.............."+r.getRunTime());
		System.out.println("Ignore count............."+r.getIgnoreCount());
		
		
		
		
		List<Failure> f = r.getFailures();
		
		
		for(Failure x:f) {
			
			
			
			System.out.println(x.getMessage());//usermessage
			System.out.println(x.getTestHeader());//WHERE IT HAS FAILED
			System.out.println(x.getException());//REASON WHY IT FAILED);
		}
		
		
		
		
		
		

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
