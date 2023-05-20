import java.util.Scanner;
public class Pascal_Iterative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// taking number of Rows to print as input
		int numRows=sc.nextInt();
		
		// constructing temp array to store previous result
        int temp[][]=new int[numRows][numRows+1];
        temp[0][1]=1;
		System.out.println(temp[0][1]);
        for(int i=1;i<numRows;i++) {
        	for(int j=1;j<=i+1;j++) {
        		
        		//curRow-curCol cell= preRow-preCol cell +preRow-curCol cell
        		temp[i][j]=temp[i-1][j-1]+temp[i-1][j];
        		
        		//printing
        		System.out.print(temp[i][j]+" ");
        	}
        	System.out.println();
        }
	}
}

