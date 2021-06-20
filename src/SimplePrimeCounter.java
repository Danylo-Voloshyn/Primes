public class SimplePrimeCounter {
	public boolean isPrime(int N) {
		for (int i = 2; i < N - 1; i++)
			if (N % i == 0)
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
//1000: 1ms
//10000: 23ms
//100000: 1667ms