package org.my.hrank.algorithms.dynamic_programming;

import org.hamcrest.core.Is;
import org.my.hrank.AbstractPackageTest;

import java.util.Scanner;

import static org.my.hrank.algorithms.dynamic_programming.EqualSolution.equal;

public class EqualSolutionTest extends AbstractPackageTest {

    @Override
    public void testAndAssert(Scanner inScanner, Scanner outScanner, String absolutePath) throws Exception {

        int t = inScanner.nextInt();
        inScanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = inScanner.nextInt();
            inScanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = inScanner.nextLine().split(" ");
            inScanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            long result = equal(arr);
            long expected = Integer.parseInt(outScanner.nextLine().trim());
            collector.checkThat(getMessage(absolutePath), result, Is.is(expected));

        }

    }
}