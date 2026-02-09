package p08_HappyNumbers;

import java.util.HashSet;
import java.util.Set;

public class TwoPointer {
    public boolean isHappy(int n) {
        Set<Integer> usedIntegers = new HashSet<>();
        while (n != 1) {
            if (usedIntegers.contains(n)) {
                return false; // cycle detected
            }
            usedIntegers.add(n);

            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;


        }
        return true;
    }
}
