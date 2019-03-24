package matrixProblem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerMatrixTest {

    @Test
    void ShouldAddTwoIntegerMatrix() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(2);
        matrix.add(row);
        matrix.add(row);
        IntegerMatrix integerMatrix = new IntegerMatrix(matrix);
        IntegerMatrix actualMatrix = integerMatrix.add(new IntegerMatrix(matrix));
        System.out.println(actualMatrix.getMatrix());
        assertEquals(actualMatrix.getMatrix(), actualMatrix.getMatrix());
    }
}