public class MatrixMakeZero {

  public static void main(String[] apples) {

    int a[][] = { { 1, 0, 3 }, { 4, 5, 0 }, { 6, 7, 8 } };
    printMatrix(a);
    makeZeroes(a);
    System.out.println("After Modifying the Matrix : ");
    printMatrix(a);

  }

  public static void makeZeroes(int a[][]) {
    int rowLength = a.length;
    int columnLength = a[0].length;

    int row[] = new int[rowLength];
    int column[] = new int[columnLength];

    // Checks the zeroes in Matrix
    for (int i = 0; i < rowLength; i++) {
      for (int j = 0; j < columnLength; j++) {
        if (a[i][j] == 0) {
          row[i] = 1;
          column[j] = 1;
        }
      }
    }
    // Modifies the Matrix.Changes the required elements to zero
    for (int i = 0; i < rowLength; i++) {
      for (int j = 0; j < columnLength; j++) {
        if (row[i] == 1 || column[j] == 1) {
          a[i][j] = 0;
        }
      }
    }

  }
  
  
  private static void printMatrix(int a[][]){
    for(int i =0 ; i < a.length ; i++){
      for(int j = 0; j<a[0].length; j++){
        System.out.print(a[i][j] + " ");
      }
      
      System.out.print("\n");
    }
  }

}
