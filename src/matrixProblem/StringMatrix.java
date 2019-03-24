package matrixProblem;

import java.util.ArrayList;

public class StringMatrix implements Matrix<String> {

    ArrayList<ArrayList<String>> matrix;

    public StringMatrix(ArrayList<ArrayList<String>> matrix) {
        this.matrix = matrix;
    }


    public StringMatrix add(StringMatrix integerMatrix) {
        ArrayList<ArrayList<String>> matrix = integerMatrix.getMatrix();
        ArrayList<ArrayList<String>> sumMatrix = new ArrayList<>();
        int row = matrix.size();
        for (int i = 0; i < row; i++) {
            ArrayList<String> rowMatrix = new ArrayList<>();
            for (int j = 0; j < row; j++) {
                String sum = this.matrix.get(i).get(j) + matrix.get(i).get(j);
                rowMatrix.add(sum);
            }
            sumMatrix.add(rowMatrix);
        }
        return new StringMatrix(sumMatrix);
    }

    public ArrayList<ArrayList<String>> getMatrix() {
        return matrix;
    }

}