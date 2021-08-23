package logicalprogram;

public class StopWatch 
{
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for (int i=1; i<=786; i++)
		{
			System.out.println(i);
		}
		
		long endTime = System.currentTimeMillis();
		long diff = endTime - startTime;
		
		System.out.println("Elapsed time is: "+diff);
	}
}
