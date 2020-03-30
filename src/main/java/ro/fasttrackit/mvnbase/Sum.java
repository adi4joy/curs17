package ro.fasttrackit.mvnbase;

import java.util.Arrays;

public class Sum {
    public int sum(int n) {
        if (n < 0) throw new IllegalArgumentException("n should be positive!");

//        return n <=1 ? n : sum(n-1) + n;
        if (n <= 1) {
            return n;
        } else {
            return sum(n - 1) + n;
        }
    }

    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n should be positive!");
        if (n >= 1) {
            return factorial(n - 1) * n;
        } else {
            return 1;
        }
    }

    public int sumArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int[] subArray = Arrays.copyOfRange(arr, 0, arr.length - 1);
            return sumArray(subArray) + arr[arr.length - 1];
        }
    }

    public int sumArrayInHalf(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
            int[] right = Arrays.copyOfRange(arr, 0, arr.length);
            return sumArrayInHalf(left) + sumArrayInHalf(right);
        }
    }

    public int sumArrayFirst(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int[] subArray = Arrays.copyOfRange(arr, 1, arr.length);
            return sumArrayFirst(subArray) + arr[0];
        }
    }

    public int fib(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public String reverse(String word) {
        if (word == null) throw new IllegalArgumentException();
        if (word.length() <= 1) {
            return word;
        } else {
            String subString = reverse(word.substring(0, word.length() - 1));
            return word.charAt(word.length() - 1) + subString;
        }
    }
}
