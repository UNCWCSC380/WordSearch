package wordsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class WordSearch {
	
	//These variables will be used for all algorithms
	private String[][] puzzleArray;
	private ArrayList<String> wordsList = new ArrayList<String>();
	private int numCols;
	private int numRows;
	
	
	private int iterations = 1;//this variable changes how many time the current puzzle is solved
	
	//These variables are used for the brute force algorithm
	private int x = 0;
	private int y= 0;
	private String[] directions = new String[] {"up", "down", "left", "right","up-right","down-right","left-up","left-down" }; 
	private String direction;
	private int foundX;
	private int foundY;

	public static void main(String[] args) {
		new WordSearch();
	}

	public WordSearch() {
		//Don't change these lines
		wordsList = readWords("Resources/Words");
		getDemensions("Resources/Puzzle");
		createPuzzleMatrix("Resources/Puzzle");
		printPuzzle();
		//
		
		bruteForce();
		boyerMoore();
		bear();
		RabinKarp();
		
		}

	private void RabinKarp() {
		int amount = 0;
		long timeStart = System.currentTimeMillis();
		while (amount < iterations) {
			//Generate Algorithm here
			//
			//
			//
			//
			//
			amount++;
		}
		long timeEnd = System.currentTimeMillis();
		long timeElapsed = timeEnd - timeStart;
		float num = (float) timeElapsed/1000 ;
		System.out.println("Rabin-Karp method took "+ num +" seconds to solve a " + numRows +"x" +numCols + " sized puzzle with " + wordsList.size() + " words " +iterations+" times");
	}
		

	private void bear() {
		int amount = 0;
		long timeStart = System.currentTimeMillis();
		
		
		HashMap<int[], String> Amap = new HashMap<int[], String>();
		HashMap<int[], String> Bmap = new HashMap<int[], String>();
		HashMap<int[], String> Cmap = new HashMap<int[], String>();
		HashMap<int[], String> Dmap = new HashMap<int[], String>();
		HashMap<int[], String> Emap = new HashMap<int[], String>();
		HashMap<int[], String> Fmap = new HashMap<int[], String>();
		HashMap<int[], String> Gmap = new HashMap<int[], String>();
		HashMap<int[], String> Hmap = new HashMap<int[], String>();
		HashMap<int[], String> Imap = new HashMap<int[], String>();
		HashMap<int[], String> Jmap = new HashMap<int[], String>();
		HashMap<int[], String> Kmap = new HashMap<int[], String>();
		HashMap<int[], String> Lmap = new HashMap<int[], String>();
		HashMap<int[], String> Mmap = new HashMap<int[], String>();
		HashMap<int[], String> Nmap = new HashMap<int[], String>();
		HashMap<int[], String> Omap = new HashMap<int[], String>();
		HashMap<int[], String> Pmap = new HashMap<int[], String>();
		HashMap<int[], String> Qmap = new HashMap<int[], String>();
		HashMap<int[], String> Rmap = new HashMap<int[], String>();
		HashMap<int[], String> Smap = new HashMap<int[], String>();
		HashMap<int[], String> Tmap = new HashMap<int[], String>();
		HashMap<int[], String> Umap = new HashMap<int[], String>();
		HashMap<int[], String> Vmap = new HashMap<int[], String>();
		HashMap<int[], String> Wmap = new HashMap<int[], String>();
		HashMap<int[], String> Xmap = new HashMap<int[], String>();
		HashMap<int[], String> Ymap = new HashMap<int[], String>();
		HashMap<int[], String> Zmap = new HashMap<int[], String>();
		
		
		for (int i = 0; i < puzzleArray.length; i++){
			for (int j = 0; j < puzzleArray.length; j++){
				
				
				switch(puzzleArray[i][j]){
					
					case "A":
						int[] coords1 = {i, j};
						Amap.put(coords1, "A");	
					case "B":
						int[] coords2 = {i, j};
						Bmap.put(coords2, "B");
					case "C":
						int[] coords3 = {i, j};
						Cmap.put(coords3, "C");
					case "D":
						int [] coords4 = {i, j};
						Dmap.put(coords4, "D");
					case "E":
						int [] coords5 = {i, j};
						Emap.put(coords5, "E");
					case "F":
						int [] coords6 = {i, j};
						Fmap.put(coords6, "F");
					case "G":
						int [] coords7 = {i, j};
						Gmap.put(coords7, "G");
					case "H":
						int[] coords8 = {i, j};
						Hmap.put(coords8, "H");
					case "I":
						int[] coords9 = {i, j};
						Imap.put(coords9, "I");
					case "J":
						int[] coords10 = {i, j};
						Jmap.put(coords10, "J");
					case "K":
						int[] coords11 = {i, j};
						Kmap.put(coords11, "K");
					case "L":
						int[] coords12 = {i, j};
						Lmap.put(coords12, "L");
					case "M":
						int[] coords13 = {i, j};
						Mmap.put(coords13, "M");
					case "N":
						int[] coords14 = {i, j};
						Nmap.put(coords14, "N");
					case "O":
						int[] coords15 = {i, j};
						Omap.put(coords15, "O");
					case "P":
						int[] coords16 = {i, j};
						Pmap.put(coords16, "P");
					case "Q":
						int[] coords17 = {i, j};
						Qmap.put(coords17, "Q");
					case "R":
						int[] coords18 = {i, j};
						Rmap.put(coords18, "R");
					case "S":
						int[] coords19 = {i, j};
						Smap.put(coords19, "S");
					case "T":
						int[] coords20 = {i, j};
						Tmap.put(coords20, "T");
					case "U":
						int[] coords21 = {i, j};
						Umap.put(coords21, "U");
					case "V":
						int[] coords22 = {i, j};
						Vmap.put(coords22, "V");
					case "W":
						int[] coords23 = {i, j};
						Wmap.put(coords23, "W");
					case "X":
						int[] coords24 = {i, j};
						Xmap.put(coords24, "X");
					case "Y":
						int[] coords25 = {i, j};
						Ymap.put(coords25, "Y");
					case "Z":
						int[] coords26 = {i, j};
						Zmap.put(coords26, "Z");
				}
			}
		}
		
		
		while (amount < iterations) {
			
			for (String aWord: wordsList){					// For each word we're looking for
				String firstLet = aWord.substring(0,1);			//First letter of the word...
				int wordLength = aWord.length();
				
				for (HashMap<int[], String> aHash: allHashMaps) {		//For each hash map...	
					if (aHash.containsValue(firstLet)) {				// If the hash map values contain the first letter of the word we're looking for...
						
						for (int[] coords: aHash.keySet()) {		// for each value pair in the hash table...
							
							int xCoord = coords[0];
							int yCoord = coords[1];
							
							String checkMe = "";
							
							for (int j = 0; j < wordLength; j++) {
								if (xCoord + j < 50) {
									checkMe = checkMe + puzzleArray[xCoord + j][yCoord];
								}
								
							}
							
							if (checkMe == aWord) {
								System.out.println("Bear found " + aWord + "at x:" + xCoord + "- y:" + yCoord);
							}
						}
						
					}
				}
			}
			amount++;
		}
		long timeEnd = System.currentTimeMillis();
		long timeElapsed = timeEnd - timeStart;
		float num = (float) timeElapsed/1000 ;
		System.out.println("Bear method took "+ num +" seconds to solve a " + numRows +"x" +numCols + " sized puzzle with " + wordsList.size() + " words " +iterations+" times");
		
	}
//===========================================================================================================================================
	
	private void boyerMoore() {
		//STRING PREPROCESSING
		//change the puzzle to string before beginning and add to direction array
		ArrayList<String> directionList = new ArrayList<>();
		
		PuzzleToString pts = new PuzzleToString();
		String normal = pts.returnNormal(puzzleArray);
		directionList.add(normal);
		
		String reverse = new StringBuffer(normal).reverse().toString();
		directionList.add(reverse);
		
		String down = pts.returnDown(puzzleArray);
		directionList.add(down);
		
		String up = new StringBuffer(down).reverse().toString();
		directionList.add(up);
		
		String diagUpRight = pts.returnDiagonalUpright(puzzleArray);
		directionList.add(diagUpRight);
		
		String diagDownLeft = new StringBuffer(diagUpRight).reverse().toString();
		directionList.add(diagDownLeft);
		
		String diagUpLeft = pts.returnDiagonalUpLeft(puzzleArray);
		directionList.add(diagUpLeft);
		
		String diagDownRight = new StringBuffer(diagUpLeft).reverse().toString();
		directionList.add(diagDownRight);

		
		//begin boyermoore
		int amount = 0;
		long timeStart = System.currentTimeMillis();

		int wordsFound = 0;
		while (amount < iterations) {
			//Generate Algorithm here
			for (String word:wordsList) {
				BoyerMoore bm = new BoyerMoore();
				boolean found = false;
				for (String direction:directionList) {
					if(!found) {
//						System.out.println("Searching for " + word);
						found = (boolean) bm.findPattern(direction, word);
					}
					else {
//						System.out.println("Breaking from search of " + word);
						break;
					}
					if(found) {
						wordsFound++;
					}
				}
			}
			amount++;
		}
		long timeEnd = System.currentTimeMillis();
		long timeElapsed = timeEnd - timeStart;
		float num = (float) timeElapsed/1000 ;
		System.out.println("Words found by Boyer Moore= " + wordsFound);
		System.out.println("Boyer-Moore method took "+ num +" seconds to solve a " + numRows +"x" +numCols + " sized puzzle with " + wordsList.size() + " words " +iterations+" times");
	}

	//===========================================================================================================================================
	
	private void bruteForce() {
		int amount = 0;
		long timeStart = System.currentTimeMillis();
		while (amount < iterations) {
			for (String word : wordsList) {
				boolean print = true;
				if (wordFound(word) & print) {
					//prints location of each word in console					
					System.out.println("The word "+word+" was found at Row:"+ foundY+ " Col:"
					 + foundX
					 +" going " +direction);
				}
			}
			amount++;
		}
		long timeEnd = System.currentTimeMillis();
		long timeElapsed = timeEnd - timeStart;
		float num = (float) timeElapsed/1000 ;
		System.out.println("Brute Force method took "+ num +" seconds to solve a " + numRows +"x" +numCols + " sized puzzle with " + wordsList.size() + " words " +iterations+" times");
	}

	private boolean wordFound(String word) {
		int wordLength = word.length();
		char[] a = word.toCharArray();
		for (int row = 0; row < puzzleArray.length; row++) {
			nextCol: for (int col = 0; col < puzzleArray[row].length; col++) {
				String current = puzzleArray[row][col];
				String letter = String.valueOf(a[0]);
				if (letter.equals(current)) {
					int letterCount = 1;
					nextDirection: for (String d : directions) {
						boolean secondLetterFound = false;
						x = 0;
						y = 0;
						getDirection(d);
						while (letterCount < wordLength) {
							int tempRow = row + y;
							int tempCol = col + x;
							try {
								current = puzzleArray[tempRow][tempCol];
								letter = String.valueOf(a[letterCount]);
								if (!(letter.equals(current))) {
									if (secondLetterFound) {
										continue nextCol;
									} else {
										continue nextDirection;
									}
								}
								if (letter.equals(current)) {
									getDirection(d);
									if (letterCount == wordLength - 1) {
										foundX = col;
										foundY = row;
										direction = d;
										return true;
									}
									secondLetterFound = true;
									letterCount++;
								}
							} catch (Exception e) {
								continue nextDirection;
							}
						}
					}
				}
			}
		}
		return false;
	}

	private void getDirection(String d) {
		switch (d) {
		case "up":
			x = 0;
			y = y - 1;
			break;
		case "down":
			x = 0;
			y = y + 1;
			break;
		case "right":
			x = x + 1;
			y = 0;
			break;
		case "left":
			x = x - 1;
			y = 0;
			break;
		case "up-right":
			x = x + 1;
			y = y - 1;
			break;
		case "up-left":
			x = x - 1;
			y = y - 1;
			break;
		case "down-right":
			x = x + 1;
			y = y + 1;
			break;
		case "down-left":
			x = x - 1;
			y = y + 1;
			break;
		}
	}

	private void createPuzzleMatrix(String fileName) {
		this.puzzleArray = new String[numRows][numCols];
		Scanner input = null;
		try {
			input = new Scanner(new File(fileName), "UTF-8");
		} catch (FileNotFoundException e) {
			System.out.println("No file found");
		}
		while (input.hasNext()) {
			for (int row = 0; row < puzzleArray.length; row++) {
				for (int col = 0; col < puzzleArray[row].length; col++) {
					String x = input.next();
					puzzleArray[row][col] = x;
				}
			}

		}

	}

	private ArrayList<String> readWords(String fileName) {
		Scanner input = null;
		try {
			input = new Scanner(new File(fileName), "UTF-8");
		} catch (FileNotFoundException e) {
			System.out.println("No file found");
		}
		String currentWord;

		while (input.hasNextLine()) {
			currentWord = input.next().trim();
			wordsList.add(currentWord);
		}

		input.close();

		return wordsList;

	}

	public void getDemensions(String fileName) {
		Scanner input = null;
		int numRow = 0;
		int numCol = 0;

		try {
			input = new Scanner(new File(fileName), "UTF-8");
		} catch (FileNotFoundException e) {
			System.out.println("No file found");
		}

		String line = input.nextLine().trim();
		line = line.replace("	", "");

		numCol = line.length();

		this.numCols = numCol;
		input.close();

		try {
			input = new Scanner(new File(fileName), "UTF-8");
		} catch (FileNotFoundException e) {
			System.out.println("No file found");
		}
		while (input.hasNextLine() == true) {
			numRow++;
			input.nextLine().trim();

		}
		this.numRows = numRow;
		input.close();
	}

	public void printPuzzle() {
		System.out.println(numRows + "x" + numCols + " Matrix");
		String arrayString = "";

		for (int row = 0; row < puzzleArray.length; row++) {
			for (int col = 0; col < puzzleArray[row].length; col++) {
				String y = String.valueOf(puzzleArray[row][col] + " ");
				arrayString = arrayString.concat(y);
			}
			arrayString.trim();
			arrayString = arrayString.concat("\n");
		}

		System.out.println(arrayString);
	}
}
