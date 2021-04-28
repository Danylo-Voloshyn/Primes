public class FinalPrimesDriver {
    public static void main (String args[]){
        //PrimeCounter
        long initialT, finalT, numPrimes;
//        PrimeCounter finalTest1 = new PrimeCounter();
//        initialT = System.currentTimeMillis();
//        numPrimes = finalTest1.countPrimes(1000);
//        finalT = System.currentTimeMillis();
//        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000");
//        initialT = System.currentTimeMillis();
//        numPrimes = finalTest1.countPrimes(10000);
//        finalT = System.currentTimeMillis();
//        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000");
//        initialT = System.currentTimeMillis();
//        numPrimes = finalTest1.countPrimes(100000);
//        finalT = System.currentTimeMillis();
//        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000");
//        initialT = System.currentTimeMillis();
//        numPrimes = finalTest1.countPrimes(1000000);
//        finalT = System.currentTimeMillis();
//        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000000");
//        initialT = System.currentTimeMillis();
//        numPrimes = finalTest1.countPrimes(10000000);
//        finalT = System.currentTimeMillis();
//        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000000");
//        initialT = System.currentTimeMillis();
//        numPrimes = finalTest1.countPrimes(100000000);
//        finalT = System.currentTimeMillis();
//        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000000");

        PrimeCounter finalTest2 = new PrimeCounter();
        initialT = System.currentTimeMillis();
        numPrimes = finalTest2.countPrimes(1000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000");
        initialT = System.currentTimeMillis();
        numPrimes = finalTest2.countPrimes(10000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000");
        initialT = System.currentTimeMillis();
        numPrimes = finalTest2.countPrimes(100000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000");
        initialT = System.currentTimeMillis();
        numPrimes = finalTest2.countPrimes(1000000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000000");
        initialT = System.currentTimeMillis();
        numPrimes = finalTest2.countPrimes(10000000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 10000000");
        initialT = System.currentTimeMillis();
        numPrimes = finalTest2.countPrimes(100000000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 100000000");
        initialT = System.currentTimeMillis();
        numPrimes = finalTest2.countPrimes(1000000000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 1000000000");
        initialT = System.currentTimeMillis();
        numPrimes = finalTest2.countPrimes(2000000000);
        finalT = System.currentTimeMillis();
        System.out.println((finalT - initialT) + "ms, " + numPrimes + " out of 2000000000");
    }
}