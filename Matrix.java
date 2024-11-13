
import java.util.Scanner;

public class Matrix {
  private int matrixNum;

  private int value = 1;

  private int reverse = 1;

  private int highlightedNum = matrixNum;

  public void matrix(){
    printMatrix();
    populateMatrix();
    flipMatrix();
    printMatrix();
  }
  Scanner scan = new Scanner(System.in);
  public void printMatrix(){  //Prints Empty Matrix

    highlightedNum = matrixNum;

    matrixNum = scan.nextInt();
    System.out.println("Your matrix is:"+matrixNum +" * "+ matrixNum);
    System.out.println("Printing matrix with default values:");

    for (int row = 0; row < matrixNum; row++){
      System.out.println();
      for (int col = 0; col < matrixNum; col++){
        if (col == highlightedNum-1){
          System.out.print("\u001B[33m0\u001B[0m\t");
        }
        else{
          System.out.print( 0+"\t");
        }
      }
      highlightedNum--;
    }
    System.out.println();
    scan.close();
  }

  public void populateMatrix(){  // Inputs Numbers into Matrix

    highlightedNum = matrixNum;

    System.out.println();
    System.out.println("Populating matrix... Matrix populated");
    System.out.println("Printing matrix:");

    for (int row = 0; row < matrixNum; row++){
      System.out.println();
      for (int col = 0; col < matrixNum; col++){
        if (col == highlightedNum-1){
          System.out.print("\u001B[33m"+value+"\u001B[0m\t");
          value++;
        }
        else{
          System.out.print(value+"\t");
          value++;
        }
      }
      highlightedNum--;
    }
  }
  public void flipMatrix(){ //Reverses the Matrix
    highlightedNum = matrixNum;
    value = 1;
    reverse = 1;

    System.out.println();
    System.out.println("Flipping matrix... Matrix Flipped");
    System.out.println("Printing matrix:");

    for (int row = 0; row < matrixNum; row++){
      System.out.println();
      for (int col = 0; col < matrixNum; col++){
        if (col == highlightedNum-1){
          System.out.print("\u001B[33m"+reverse+"\u001B[0m\t");
          value--;
          reverse++;
        }
        else {
          System.out.print(((matrixNum*matrixNum)-1)+value+"\t");
          value--;
          reverse++;
        }
      }
      highlightedNum--;
    }
  }
}
