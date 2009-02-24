package lightier.util;

public class ConsoleReporter extends BasicReporter {

	public void printReport() {
		// TODO Auto-generated method stub
		System.out.println("Execute time: " + (endTime - startTime) + " ms");
	}
}
