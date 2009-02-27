package lightier.algorithms.arithmetic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import junit.framework.TestCase;
import lightier.algorithms.Algorithms;

public class AdditionTests extends TestCase {
	private Algorithms addition;
	
	public void setUp() throws Exception {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("config/algorithm_addition.xml");
		this.addition = (Algorithms) ctx.getBean("Addition");
	}
	
	public void testAddition() {		
		//assertEquals("1+1=2!!", 2, addition.add());
		assertTrue("Execute method should return true", addition.execute());
	}
}
