package JavaCourse;

public class ArrayMatrixPracticeFour {

	public static void main(String[] args) {
		// Define multi dimensional array
		int b [] [] = {{1,2},{3,4},{5,6}};
		
		int row = b.length;
		
		System.out.println("Total No.of rows:" + row);
		
		int column = b[0].length;
		System.out.println("Total no.of columns:" + column);
		
		//print all data in matrix form
		
		for (int i = 0; i<row;i++) {
			
		for(int j = 0; j<column; j++) {
			
			
		System.out.print(b[i][j] + "  ");
		}
		System.out.println();
		}

	}

}
