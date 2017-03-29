package weiser;

public class Fibonacci {

	public long fibonacci(int z) {
		if (z == 1 || z == 2) {
			return 1;
		}
		return fibonacci(z-1) + fibonacci(z-2);
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println("Fibonacci(" + 7 + ") = " + f.fibonacci(7));
		System.out.println("Fibonacci(" + 17 + ") = " + f.fibonacci(17));
	}

}
