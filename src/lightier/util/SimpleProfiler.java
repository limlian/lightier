package lightier.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class SimpleProfiler {

	public Object profile(ProceedingJoinPoint call)
		throws Throwable {
		StopWatch clock = new StopWatch("Profiling for addition"); 
				
		try {
			clock.start(call.toShortString());
			return call.proceed();
		} finally {
			clock.stop();
			System.out.println(clock.prettyPrint());
		}
	}
}
