package JavaCourse;

public class Array4 {

	public static void main(String[] args) {
		//Defining multidimensional array
		
		int a [][] = {{1,2,3,7,1},{4,5,6,8,2},{7,8,9,6,3},{1,2,3,4,4}};
		int row = a.length;
		System.out.println("Total rows: " +row);
		int column = a[0].length;
		System.out.println("Total column:" +column);
		//print all data in matrix form
		//outer loop
		for(int i = 0; i<row;i++) {
		//inner loop
		for(int j = 0;j<column;j++) {
			System.out.print(a[i][j]   + "  "  );
		}
		System.out.println();
	}
	}
}
