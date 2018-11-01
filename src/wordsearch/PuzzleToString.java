package wordsearch;
/**
 * This class turns a 2d array into strings going four different directions.
 * The other four directions implemented by reversing those strings.
 */
public class PuzzleToString {

	
	public String returnNormal (String[][] p) {
		String string = "";
		for(int row = 0 ; row< p.length; row++) {
			for(int col = 0 ; col < p.length; col++) {
				string = string + p[row][col];
			}
		}
		return string;
	}
	
	public String returnDown(String[][] p) {
		String string = "";
		for(int col = 0 ; col< p.length; col++) {
			for(int row = 0 ; row < p.length; row++) {
				string = string + p[row][col];
			}
		}
		return string;
	}

	public String returnDiagonalUpright(String[][] p) {
		String string = "";
	    //top half of diagonals
	    for( int i = 0 ; i < p.length ; i++ ) {
	        for( int col = 0 ; col <= i ; col++ ) {
	            int row = i - col;
	            string = string + p[row][col];
	        }
	    }
	    //bottom half of diagonals
	    for( int i = p.length - 2 ; i >= 0 ; i-- ) {
	        for( int row = 0 ; row <= i ; row++ ) {
	            int col =  - row;
	            string = string + p[p.length - row - 1][p.length - col - 1];
	        }
	    }
		return string;
	}
	

	public String returnDiagonalUpLeft(String[][] p) {
		String string = "";
	    for (int i = p.length - 1; i > 0; i--) {
	        String temp = "";
	        for (int j = 0, x = i; x <= p.length - 1; j++, x++) {
	           temp = temp+p[x][j];
	        }
	        string = string + temp;
	    }
	    for (int i = 0; i <= p.length - 1; i++) {
	         String temp = "";
	         for (int j = 0, y = i; y <= p.length - 1; j++, y++) {
	         temp = temp+p[j][y];
	         }
	         string = string + temp;
	    }
		return string;
	}

}
