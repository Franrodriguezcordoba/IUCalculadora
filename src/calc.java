
public class calc {

	public double suma(double a, double b) {
		if (a + b > Double.MAX_VALUE)
			throw new ArithmeticException("No se pueden sumar números tan grandes");
		return a + b;
	}

	public double resta(double a, double b) {
		if (a - b > Double.MAX_VALUE)
			throw new ArithmeticException("No se pueden restar números tan grandes");
		return a - b;
	}

	public double mult(double a, double b) {
		if (a * b > Double.MAX_VALUE)
			throw new ArithmeticException("No se pueden multiplicar números tan grandes");
		return a * b;
	}

	public double divide(double a, double b) {
		if (b == 0)
			throw new ArithmeticException();
		return a / b;
	}

	public int fact(int n) {
		if (n < 0 || n >= 15)
			throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo");
		return n > 0 ? n * fact(n - 1) : 1;
	}

	public boolean esPrimo(int n) {
		boolean primo = true;
		int d = n - 1;
		while (d > 1) {
			if (n % d == 0)
				primo = false;
			d--;
		}
		if (n < 2)
			primo = false;
		return primo;
	}
}
