package ArrayPractice;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no : ");
        int row = sc.nextInt();
        System.out.println("Enter coloumn no : ");
        int col = sc.nextInt();
        int [][]matrix = new int[row][col];
        System.out.println("Enter all the elements of matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("All the element of matrix are : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
