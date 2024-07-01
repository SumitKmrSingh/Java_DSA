package MatrixPractice;

import java.util.Scanner;

public class SearchInMatrix {
    public static int searchElement(int [][]matrix, int row, int col, int key){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == key){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no of row In matrix : ");
        int row = sc.nextInt();
        System.out.print("Enter total no of column In matrix : ");
        int col = sc.nextInt();

        // Creating matrix 
        int [][]matrix = new int[row][col];
        System.out.println("Enter Total element of matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter key Element of matrix : ");
        int key = sc.nextInt();

        System.out.println();
        System.out.println("Total elements of matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int result = searchElement(matrix, row, col, key);

        if(result == 1){
            System.out.println(key+" Is Present In matrix");
        }
        else {
            System.out.println(key+" Is not Present In matrix");
        }
    }
}
