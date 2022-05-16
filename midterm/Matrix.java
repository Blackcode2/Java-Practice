import java.util.Scanner;

public class Matrix {

    public static void getInput(int[][] n) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type Nums: ");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                System.out.printf("Type [%d][%d]: ", i+1, j+1);
                n[i][j] = keyboard.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] n) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                System.out.print(n[i][j]);
            }
            System.out.println("");
        }
    }

    public static void addition(int[][] n1, int[][] n2) {
        int[][] n = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
            n[i][j] = n1[i][j] + n2[i][j];
        }

        printMatrix(n);
    }

    public static void subtraction(int[][] n1, int[][] n2) {
        int[][] n = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
            n[i][j] = n1[i][j] - n2[i][j];
        }

        printMatrix(n);
    }

    public static void main(String[] args) 
    {
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];

        // Assign matrix values
        System.out.println("Type Nums for Matrix A: ");
        Matrix.getInput(matrixA);

        System.out.println("Type Nums for Matrix B: ");
        Matrix.getInput(matrixB);
        
        // Print A, B, C
        System.out.println("\nMatrix A is ..");
        Matrix.printMatrix(matrixA);

        System.out.println("\nMatrix B is ..");
        Matrix.printMatrix(matrixB);

        System.out.println("\nMatrix addition is ..");
        Matrix.addition(matrixA,matrixB);

        System.out.println("\nMatrix subtraction is ..");
        Matrix.subtraction(matrixA,matrixB);
    }
}
