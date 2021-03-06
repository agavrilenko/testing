package org.my.hrank.algorithms.dynamic_programming;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FibonacciModifiedSolution {
    // Complete the fibonacciModified function below.
    static String fibonacciModified(int t1, int t2, int n) {
        BigDecimal[] result = new BigDecimal[n];
        result[0] = BigDecimal.valueOf(t1);
        result[1] = BigDecimal.valueOf(t2);
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 2].add(result[i - 1].multiply(result[i - 1]));
        }
        return result[n - 1].toString();
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] t1T2n = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(t1T2n[0]);

        int t2 = Integer.parseInt(t1T2n[1]);

        int n = Integer.parseInt(t1T2n[2]);

        String result = fibonacciModified(t1, t2, n);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
