public class SqrtPrimeCounter {
	public boolean isPrime(int N) {
		for (int i = 2; i <= Math.sqrt(N); i++)
			if (N%i == 0)
				return false;
		return N > 1;
	}
	public int countPrimes(int limit) {
		int counter = 0;
		for (int i = 1; i < limit; i++)
			if (isPrime(i))
				counter++;
		return counter;
	}
}
//1000: 0ms
//10000: 1ms
//100000: 14ms
//1000000: 326ms