public class PrimesDriver {
    public static void main(String[] args) {
        //isPrime
        FirstPrimeCounter fpcTest1 = new FirstPrimeCounter();
        System.out.println(fpcTest1.isPrime(0));
        System.out.println(fpcTest1.isPrime(1));
        System.out.println(fpcTest1.isPrime(100));
        System.out.println(fpcTest1.isPrime(2315));
        System.out.println(fpcTest1.isPrime(8732));
        System.out.println(fpcTest1.isPrime(2));
        System.out.println(fpcTest1.isPrime(101));
        System.out.println(fpcTest1.isPrime(12323));

        //countPrimes
        long initialT, finalT, numPrimes;
        FirstPrimeCounter fpcTest2 = new FirstPrimeCounter();
        initialT = System.currentTimeMillis();
        numPrimes = fpcTest2.countPrimes(1000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000");
        initialT = System.currentTimeMillis();
        numPrimes = fpcTest2.countPrimes(10000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000");
        initialT = System.currentTimeMillis();
        numPrimes = fpcTest2.countPrimes(100000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000\n");
        //1000: 1ms
        //10000: 23ms
        //100000: 1667ms

        //FasterPrimeCounter
        FasterPrimeCounter fasterTest1 = new FasterPrimeCounter();
        initialT = System.currentTimeMillis();
        numPrimes = fasterTest1.countPrimes(1000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000");
        initialT = System.currentTimeMillis();
        numPrimes = fasterTest1.countPrimes(10000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000");
        initialT = System.currentTimeMillis();
        numPrimes = fasterTest1.countPrimes(100000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000\n");
        //1000: 0ms
        //10000: 12ms
        //100000: 868ms

        //sqrtPrimeCounter
        SquareRootPrimeCounter sqrtTest1 = new SquareRootPrimeCounter();
        initialT = System.currentTimeMillis();
        numPrimes = sqrtTest1.countPrimes(1000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000");
        initialT = System.currentTimeMillis();
        numPrimes = sqrtTest1.countPrimes(10000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000");
        initialT = System.currentTimeMillis();
        numPrimes = sqrtTest1.countPrimes(100000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000");
        initialT = System.currentTimeMillis();
        numPrimes = sqrtTest1.countPrimes(1000000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000000\n");
        //1000: 0ms
        //10000: 1ms
        //100000: 14ms
        //1000000: 326ms

        //FastestPrimeCounter
        FastestPrimeCounter fastestTest1 = new FastestPrimeCounter();
        initialT = System.currentTimeMillis();
        numPrimes = fastestTest1.countPrimes(1000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000");
        initialT = System.currentTimeMillis();
        numPrimes = fastestTest1.countPrimes(10000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000");
        initialT = System.currentTimeMillis();
        numPrimes = fastestTest1.countPrimes(100000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000");
        initialT = System.currentTimeMillis();
        numPrimes = fastestTest1.countPrimes(1000000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000000");
        initialT = System.currentTimeMillis();
        numPrimes = fastestTest1.countPrimes(10000000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000000");
        initialT = System.currentTimeMillis();
        numPrimes = fastestTest1.countPrimes(100000000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000000");
        //1000: 0ms
        //10000: 1ms
        //100000: 6ms
        //1000000: 76ms
        //10000000: 1521ms
        //100000000: 34231ms

        //Primes:
        //1000: 168
        //10000: 1229
        //100000: 9592
        //1000000: 78498
        //10000000: 664579
        //100000000: 5761455
    }
}