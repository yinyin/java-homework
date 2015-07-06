
public class ParallelSum implements Runnable
{
	protected ParallelSum()
	{
		// TODO: implement
	}

	public void run()
	{
		// TODO: implement
	}

	public static long sum(int a, int b)
	{
		// TODO: implement
	}

	public static void main(String arg[])
	{
		long v1 = ParallelSum.sum(0, 100);
		System.out.println("W02: check case 1: " + ((5050 == v1) ? "OK" : "Failed"));
		long v2 = ParallelSum.sum(-100, 100);
		System.out.println("W02: check case 2: " + ((0 == v2) ? "OK" : "Failed"));
		long v3 = ParallelSum.sum(-100, 200);
		System.out.println("W02: check case 3: " + ((15050 == v3) ? "OK" : "Failed"));
	}
}
