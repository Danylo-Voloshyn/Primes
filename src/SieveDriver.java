public class SieveDriver {
	public static void main (String[] args) {
		//Sieve of Eratosthenes
		long initialT, finalT, numPrimes;
		EratosthenesSieve finalTest1 = new EratosthenesSieve();
		initialT = System.currentTimeMillis();
		numPrimes = finalTest1.countPrimes(1000);
		finalT = System.currentTimeMillis();
		System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000");
		initialT = System.currentTimeMillis();
		numPrimes = finalTest1.countPrimes(10000);
		finalT = System.currentTimeMillis();
		System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000");
		initialT = System.currentTimeMillis();
		numPrimes = finalTest1.countPrimes(100000);
		finalT = System.currentTimeMillis();
		System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000");
		initialT = System.currentTimeMillis();
		numPrimes = finalTest1.countPrimes(1000000);
		finalT = System.currentTimeMillis();
		System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000000");
		initialT = System.currentTimeMillis();
		numPrimes = finalTest1.countPrimes(10000000);
		finalT = System.currentTimeMillis();
		System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000000");
		initialT = System.currentTimeMillis();
		numPrimes = finalTest1.countPrimes(100000000);
		finalT = System.currentTimeMillis();
		System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000000");
	}
}