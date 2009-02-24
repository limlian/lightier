package lightier.algorithms.arithmetic;

import lightier.algorithms.Algorithms;
import lightier.util.Reporter;

public class Addition implements Algorithms{
	private Reporter reporter;
	private int augend;
	private int addend;
	private int expectedResult;

	public int add() {
		return augend + addend;
	}

	public boolean execute() {
		int result;
		
		reporter.start();
		result = add();
		reporter.end();
		
		reporter.printReport();
		
		return checkResult(result);
	}

	private boolean checkResult(int result) {
		if(result == expectedResult) 
			return true;
		else
			return false;
	}
	
	public void setReporter(Reporter reporter) {
		this.reporter = reporter;
	}
	
	public void setAugend(int augend) {
		this.augend = augend;
	}

	public void setAddend(int addend) {
		this.addend = addend;
	}
	
	public void setExpectedResult(int expectedResult) {
		this.expectedResult = expectedResult;
	}
	
}
