public class Pascal_dynamic {
	// dp array for memorization;
	static int dp[][]=new int[5][5];
	public static void main(String[] args) {
		// number of Rows indicating numsRows
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
        if (col == 0 || col == row)
            return 1;
        if(dp[row][col]!=0)
          return dp[row][col];
        else 
          return dp[row][col]= getValue(row - 1, col - 1) + getValue(row - 1, col);    
    }
}
