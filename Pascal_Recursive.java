import java.util.*;
public class Pascal_Recursive {
	public static void main(String[] args) {
		        int numRows = 5;
		        // Print Pascal's triangle
		        for (int i = 0; i < numRows; i++) {
		            for (int j = 0; j <= i; j++) {
		                System.out.print(getValue(i, j) + " ");
		            }
		            System.out.println();
		        }
		    }	    
		    public static int getValue(int row, int col) {
		        if (col == 0 || col == row) {
		            return 1;
		        } else {
		            return getValue(row - 1, col - 1) + getValue(row - 1, col);
		        }
		    }
	}

