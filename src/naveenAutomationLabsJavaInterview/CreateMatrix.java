package naveenAutomationLabsJavaInterview;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	static Scanner scan;
	
	public static void main(String[] args) {
	
		scan = new Scanner(System.in);
		
		System.out.println("Enter row count");
		int rows = scan.nextInt();
		System.out.println("Enter col count");
		int col = scan.nextInt();
		
//		System.out.println("Enter matrix data: ");
//		int data[][] = creatMatrix(rows, col);
//		printMatrix(data);
//		
//		System.out.println("---------------------------");
//		
//		int[][] matrixsum = matrixSum(rows, col);
//		printMatrix(matrixsum);
		
		System.out.println("---------------------------");
		System.out.println("Enter matrix data: ");
		int matrix1[][] = creatMatrix(rows, col);
		System.out.println("Before transpose:");
		printMatrix(matrix1);
		int[][] transpose = matrixTranspose(matrix1);
		System.out.println("Before transpose:");
		printMatrix(transpose);
	
	}
	
	public static int[][] matrixTranspose(int[][] data) {
		
		int rows = data.length;
		int col = data[0].length;
		int[][] transpose = new int[rows][col];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				transpose[j][i] = data[i][j];
			}
		}
		
		return transpose;
	}
	
	
	public static int[][] matrixSum(int rows, int col){
		
		int sum[][] = new int[rows][col];
	
		System.out.println("Enter first matrix data: ");
		int matrix1[][] = creatMatrix(rows, col);
		System.out.println("Enter second matrix data:");
		int matrix2[][] = creatMatrix(rows, col);
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		return sum;
	}

	public static void printMatrix(int data[][]) {
//		for(int i=0;i<data[0].length;i++) {
//			 for(int j=0;j<data[1].length;j++) {
//				 System.out.print(data[i][j]+" ");
//			 }
//			 System.out.println();
//		}
		
		for(int[] r: data) {
			System.out.println(Arrays.toString(r));
		}
	}
	public static int[][] creatMatrix(int rows, int col) {
		int data[][] = new int[rows][col];
				
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				data[i][j] = scan.nextInt();
			}
		}
		
		return data;
		
	}
	
}
