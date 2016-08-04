package array;

/**
 * Created by siva on 13/5/16.
 * Ref:
 * https://www.youtube.com/watch?v=keb6rP07Yqg&list=PLTZbNwgO5ebpqWBmBx0lpy9IYFMSQcrL-
 */
public class FindPath {

    public static int N = 4;

    private static boolean isSafe(int[][] matrix, int i, int j) {

        return (i >= 0 && i < N && j >= 0 && j < N && matrix[i][j] == 1);
    }

    private static boolean findMazeUtil(int[][] matrix, int i, int j,
            int[][] solution) {

        if (i == N - 1 && j == N - 1) {
            solution[i][j] = 1;
            return true;
        }

        if (isSafe(matrix, i, j)) {
            solution[i][j] = 1;
            if (findMazeUtil(matrix, i + 1, j, solution)) // Down
                return true;
            if (findMazeUtil(matrix, i, j + 1, solution)) // Right
                return true;
            if (findMazeUtil(matrix, i, j -1, solution)) // Left
                return true;
            if (findMazeUtil(matrix, i-1, j, solution)) // Up
                return true;
            solution[i][j] = 0;
            return false;
        }
        return false;
    }

    private static boolean findMaze(int[][] matrix) {

        int solution[][] = new int[N][N];
        if (!findMazeUtil(matrix, 0, 0, solution))
            return false;
        printMatrix(solution);
        return true;
    }

    private static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int matrix[][] =
                {{1, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 0, 0}, {0, 1, 1, 1}};
        findMaze(matrix);
    }



}
