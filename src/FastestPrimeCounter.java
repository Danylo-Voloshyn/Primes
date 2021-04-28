public class FastestPrimeCounter {
    private int[] alreadyFound;
    private int numPrimes = 1;

    public int countPrimes(int limit) {
        alreadyFound = new int[]{2};
        numPrimes = 1;
        for (int i = 3; i <= limit; i++) {
            if (isPrime(i)) {
                if(alreadyFound[alreadyFound.length-1] != 0) {
                    int[] temp = alreadyFound.clone();
                    alreadyFound = new int[alreadyFound.length * 2];
                    System.arraycopy(temp, 0, alreadyFound, 0, temp.length);
                }
                if (i < Math.sqrt(limit))
                    alreadyFound[numPrimes] = i;
                numPrimes += 1;
            }
        }
        return numPrimes;
    }
    public boolean isPrime(int N) {
        for (int i = 1; i <= alreadyFound.length; i++) {
            if (alreadyFound[i-1] > Math.sqrt(N))
                return true;
            else if (alreadyFound[i-1] != 0 && N%alreadyFound[i-1] == 0)
                return false;
        }
        return false;
    }
}
//1000: 0ms
//10000: 1ms
//100000: 6ms
//1000000: 76ms
//10000000: 1521ms
//100000000: 34231ms