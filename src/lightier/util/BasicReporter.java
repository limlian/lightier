package lightier.util;

public abstract class BasicReporter implements Reporter{
	public long startTime;
	public long endTime;
	
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void end() {
		this.endTime = System.currentTimeMillis();
	}
	
	abstract public void printReport();
}
