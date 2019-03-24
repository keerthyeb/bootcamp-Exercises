package matrixProblem;

import java.util.ArrayList;

public class IntegerMatrix implements Matrix<Integer> {

    private ArrayList<ArrayList<Integer>> matrix;

    IntegerMatrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }


    public IntegerMatrix add(IntegerMatrix integerMatrix) {
        ArrayList<ArrayList<Integer>> matrix = integerMatrix.matrix;
        ArrayList<ArrayList<Integer>> sumMatrix = new ArrayList<>();
        int row = matrix.size();
        for (int i = 0; i < row; i++) {
            sumMatrix.add(addRow(this.matrix.get(i), matrix.get(i)));
        }
        return new IntegerMatrix(sumMatrix);
    }

    private ArrayList<Integer> addRow(ArrayList<Integer> firstRow, ArrayList<Integer> secondRow) {
        int row = firstRow.size();
        ArrayList<Integer> sum = new ArrayList<>();
        for (int j = 0; j < row; j++) {
            sum.add(firstRow.get(j) + secondRow.get(j));
        }
        return sum;
    }
}
