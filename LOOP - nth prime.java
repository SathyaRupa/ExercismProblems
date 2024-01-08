class PrimeCalculator {

    int nth(int nth) {
        if (nth <= 0) {
            throw new IllegalArgumentException("Invalid number passed");
        }
        int count = 0;
        int i = 2;
        while (count < nth) {
            if (isPrime(i)) {
                count++;
            }
            i++;
        }
        return i-1;
    }

    boolean isPrime(int number) {
        if (number <= 2) {
            return number == 2;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }
}