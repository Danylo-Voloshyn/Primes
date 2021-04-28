public class PrimeCounter {
    public int countPrimes(int limit)
    {
        int counter = 0;
        boolean[] isPrimes = new boolean[limit+1];
        // initialized as all false;
        // mark non-primes by setting element to true

        for(int p = 2; p*p <= limit; p++)
            if(!isPrimes[p])
                for(int i = p*2; i <= limit; i += p)
                    isPrimes[i] = true;

        for(int i = 2; i <= limit; i++)
            if(!isPrimes[i])
                counter++;
        return counter;
    }
}
//1000: 0ms
//10000: 0ms
//100000: 2ms
//1000000: 6ms
//10000000: 56ms
//100000000: 923ms
//1000000000: 10519ms