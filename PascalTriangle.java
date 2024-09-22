package AccentureCodingProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> addPascal = new ArrayList<>();
        int[][] matrix = new int[numRows][];
        for(int i=0; i<numRows; i++) {
            matrix[i] = new int[i + 1];
            matrix[i][0] = matrix[i][i] = 1;
            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
            List<Integer> rowlist = new ArrayList<>();
            for(int element : matrix[i]){
                rowlist.add(element);
            }
            addPascal.add(rowlist);
        }
        return addPascal;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
