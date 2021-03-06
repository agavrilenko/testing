package org.my.hrank.data_structures.balanced_trees.self_balanced_tree;

import org.hamcrest.collection.IsArrayContainingInOrder;
import org.my.hrank.AbstractTest;
import org.my.hrank.utils.TreesUtils;

import java.util.Scanner;

public class SelfBalancedTreeSolutionTest extends AbstractTest {


    @Override
    public void testAndAssert(Scanner inScanner, Scanner outScanner, String absolutePath) throws InstantiationException, IllegalAccessException {
        int rootData = Integer.parseInt(inScanner.nextLine().trim());
        int n = Integer.parseInt(inScanner.nextLine().trim());

        Integer[][] indexes = new Integer[n][2];
        // n is null
        for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
            String[] indexesRowItems = inScanner.nextLine().split(" ");

            for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
                Integer indexesItem;
                try {
                    indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
                } catch (NumberFormatException e) {
                    indexesItem = null;
                }
                indexes[indexesRowItr][indexesColumnItr] = indexesItem;
            }
        }
        Solution.Node root = new Solution.Node();
        root.setData(rootData);
        Solution.Node node = (Solution.Node) TreesUtils.buildTree(indexes, Solution.Node.class, root);
        int val = inScanner.nextInt();


        Solution.Node newTree = Solution.insert(node, val);
        Integer[] actual = TreesUtils.traverseTree(newTree);


        String line = outScanner.nextLine();
        String[] dataSt = line.split(" ");
        Integer[] expected = new Integer[dataSt.length];
        for (int i = 0; i < dataSt.length; i++) {
            expected[i] = Integer.valueOf(dataSt[i]);
        }
        collector.checkThat("Test failed for " + absolutePath, actual, IsArrayContainingInOrder.<Object>arrayContaining(expected));
    }
}