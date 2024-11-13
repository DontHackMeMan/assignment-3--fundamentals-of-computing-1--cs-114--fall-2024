

public class RunMatrix {
  public static void main(String[] args) {
    Matrix myMatrix = new Matrix();

    System.out.println("Enter the size of your matrix");
    myMatrix.printMatrix();
    myMatrix.populateMatrix();
    myMatrix.flipMatrix();
    myMatrix.printMatrix();


  }
}
