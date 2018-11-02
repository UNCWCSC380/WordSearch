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
	    for( int k = p.length - 2 ; k >= 0 ; k-- ) {
	        for( int j = 0 ; j <= k ; j++ ) {
	            int i = k - j;
	            string = string + p[p.length - j - 1][p.length - i - 1];
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
