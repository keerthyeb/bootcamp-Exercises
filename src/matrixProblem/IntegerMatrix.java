package matrixProblem;

import java.util.ArrayList;

public class IntegerMatrix implements Matrix<Integer> {

    private ArrayList<ArrayList<Integer>> matrix;

    IntegerMatrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }


    public IntegerMatrix add(IntegerMatrix integerMatrix) {
        ArrayList<ArrayList<Integer>> matrix = integerMatrix.getMatrix();
        ArrayList<ArrayList<Integer>> sumMatrix = new ArrayList<>();
        int row = matrix.size();
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> rowMatrix = new ArrayList<>();
            for (int j = 0; j < row; j++) {
                int sum = this.matrix.get(i).get(j) + matrix.get(i).get(j);
                rowMatrix.add(sum);
            }
            sumMatrix.add(rowMatrix);
        }
        return new IntegerMatrix(sumMatrix);
    }

    ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }

}
