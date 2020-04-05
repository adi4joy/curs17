package ro.fasttrackit.mvnbase.homework;

public class Homework {
    public Homework() {
    }

    // Exercise 1: sum of first n integer numbers
    public int sum(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be positive!");
        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }

    // Exercise 2: sum of first n EVEN integer numbers
    public int sumEven(int n) {
        if (n % 2 == 0) {
            if ((n < 0)) throw new IllegalArgumentException("n must be positive!");
            if (n > 1) {
                return n * (n + 1);
            }
        }
        return n;
    }

    // Exercise 3.1: PALINDROME recursive string reverse
    public boolean palindromeReverse(String word) {
        String result = word.toLowerCase().trim();
        String reversed = reverse(result);
        return result.equals(reversed);
    }

    public String reverse(String word) {
        String result = word.toLowerCase().trim();
        if (word.isEmpty()) {
            return word;
        } else {
            return result.charAt(result.length() - 1) + reverse(result.substring(0, result.length() - 1));
        }
    }


    // Exercise 3.2: PALINDROME recursive check of first and last letter
    public boolean palindromeCheckFirstLast(String word) {
        if (word == null) throw new IllegalArgumentException();
        if (word.length() <= 1) {
            return true;
        } else {
            return palindromeCheckFirstLast(word.substring(1, word.length() - 1));
        }
    }

    // Exercise 4: sum of digits for a number
    public int sumDigits(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be positive!");
        if (n <= 9) {
            return n;
        } else {
            return (n % 10 + sumDigits(n / 10));
        }
    }
}
