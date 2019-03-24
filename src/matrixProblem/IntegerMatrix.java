package matrixProblem;

import java.util.ArrayList;
import java.util.Objects;

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

    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }

    public IntegerMatrix transpose() {
        ArrayList<ArrayList<Integer>> transposeMatrix = new ArrayList<>();
        for (int row = 0; row < this.matrix.get(0).size(); row++) {
            transposeMatrix.add(getTransposedRow(row));
        }
        return new IntegerMatrix(transposeMatrix);
    }

    private ArrayList<Integer> getTransposedRow(Integer row) {
        ArrayList<Integer> resultRow = new ArrayList<>();
        for (ArrayList<Integer> rowElements : this.matrix) {
            resultRow.add(rowElements.get(row));
        }
        return resultRow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerMatrix that = (IntegerMatrix) o;
        return Objects.equals(matrix, that.matrix);
    }

}