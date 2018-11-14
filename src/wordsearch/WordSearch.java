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
	
		// These variables are for the Bear Method Algorithm
	private static int numOfAs = 0;
	private static int numOfBs = 0;
	private static int numOfCs = 0;
	private static int numOfDs = 0;
	private static int numOfEs = 0;
	private static int numOfFs = 0;
	private static int numOfGs = 0;
	private static int numOfHs = 0;
	private static int numOfIs = 0;
	private static int numOfJs = 0;
	private static int numOfKs = 0;
	private static int numOfLs = 0;
	private static int numOfMs = 0;
	private static int numOfNs = 0;
	private static int numOfOs = 0;
	private static int numOfPs = 0;
	private static int numOfQs = 0;
	private static int numOfRs = 0;
	private static int numOfSs = 0;
	private static int numOfTs = 0;
	private static int numOfUs = 0;
	private static int numOfVs = 0;
	private static int numOfWs = 0;
	private static int numOfXs = 0;
	private static int numOfYs = 0;
	private static int numOfZs = 0;

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
		
		
		HashMap<Integer, int[]> Amap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Bmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Cmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Dmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Emap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Fmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Gmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Hmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Imap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Jmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Kmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Lmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Mmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Nmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Omap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Pmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Qmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Rmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Smap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Tmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Umap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Vmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Wmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Xmap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Ymap = new HashMap<Integer, int[]>();
		HashMap<Integer, int[]> Zmap = new HashMap<Integer, int[]>();
		
		
		for (int i = 0; i < puzzleArray.length; i++){
			for (int j = 0; j < puzzleArray.length; j++){
				
				
				switch(puzzleArray[i][j]){
					
					case "A":
						numOfAs++;
						int[] coords1 = {i, j};
						Amap.put(numOfAs, coords1);	
					case "B":
						numOfBs++;
						int[] coords2 = {i, j};
						Bmap.put(numOfBs, coords2);
					case "C":
						numOfCs++;
						int[] coords3 = {i, j};
						Cmap.put(numOfCs, coords3);
					case "D":
						numOfDs++;
						int [] coords4 = {i, j};
						Dmap.put(numOfDs, coords4);
					case "E":
						numOfEs++;
						int [] coords5 = {i, j};
						Emap.put(numOfEs, coords5);
					case "F":
						numOfFs++;
						int [] coords6 = {i, j};
						Fmap.put(numOfFs, coords6);
					case "G":
						numOfGs++;
						int [] coords7 = {i, j};
						Gmap.put(numOfGs, coords7);
					case "H":
						numOfHs++;
						int[] coords8 = {i, j};
						Hmap.put(numOfHs, coords8);
					case "I":
						numOfIs++;
						int[] coords9 = {i, j};
						Imap.put(numOfIs, coords9);
					case "J":
						numOfJs++;
						int[] coords10 = {i, j};
						Jmap.put(numOfJs, coords10);
					case "K":
						numOfKs++;
						int[] coords11 = {i, j};
						Kmap.put(numOfKs, coords11);
					case "L":
						numOfLs++;
						int[] coords12 = {i, j};
						Lmap.put(numOfLs, coords12);
					case "M":
						numOfMs++;
						int[] coords13 = {i, j};
						Mmap.put(numOfMs, coords13);
					case "N":
						numOfNs++;
						int[] coords14 = {i, j};
						Nmap.put(numOfNs, coords14);
					case "O":
						numOfOs++;
						int[] coords15 = {i, j};
						Omap.put(numOfOs, coords15);
					case "P":
						numOfPs++;
						int[] coords16 = {i, j};
						Pmap.put(numOfPs, coords16);
					case "Q":
						numOfQs++;
						int[] coords17 = {i, j};
						Qmap.put(numOfQs, coords17);
					case "R":
						numOfRs++;
						int[] coords18 = {i, j};
						Rmap.put(numOfRs, coords18);
					case "S":
						numOfSs++;
						int[] coords19 = {i, j};
						Smap.put(numOfSs, coords19);
					case "T":
						numOfTs++;
						int[] coords20 = {i, j};
						Tmap.put(numOfTs, coords20);
					case "U":
						numOfUs++;
						int[] coords21 = {i, j};
						Umap.put(numOfUs, coords21);
					case "V":
						numOfVs++;
						int[] coords22 = {i, j};
						Vmap.put(numOfVs, coords22);
					case "W":
						numOfWs++;
						int[] coords23 = {i, j};
						Wmap.put(numOfWs, coords23);
					case "X":
						numOfXs++;
						int[] coords24 = {i, j};
						Xmap.put(numOfXs, coords24);
					case "Y":
						numOfYs++;
						int[] coords25 = {i, j};
						Ymap.put(numOfYs, coords25);
					case "Z":
						numOfZs++;
						int[] coords26 = {i, j};
						Zmap.put(numOfZs, coords26);
				}
			}
		}
		
		ArrayList<HashMap<Integer, int[]>> allHashMaps = new ArrayList<HashMap<Integer, int[]>>();
		
		allHashMaps.add(Amap);
		allHashMaps.add(Bmap);
		allHashMaps.add(Cmap);
		allHashMaps.add(Dmap);
		allHashMaps.add(Emap);
		allHashMaps.add(Fmap);
		allHashMaps.add(Gmap);
		allHashMaps.add(Hmap);
		allHashMaps.add(Imap);
		allHashMaps.add(Jmap);
		allHashMaps.add(Kmap);
		allHashMaps.add(Lmap);
		allHashMaps.add(Mmap);
		allHashMaps.add(Nmap);
		allHashMaps.add(Omap);
		allHashMaps.add(Pmap);
		allHashMaps.add(Qmap);
		allHashMaps.add(Rmap);
		allHashMaps.add(Smap);
		allHashMaps.add(Tmap);
		allHashMaps.add(Umap);
		allHashMaps.add(Vmap);
		allHashMaps.add(Wmap);
		allHashMaps.add(Xmap);
		allHashMaps.add(Ymap);
		allHashMaps.add(Zmap);
		
		
		while (amount < iterations) {
			
			for (String aWord: wordsList){					// For each word we're looking for
				String firstLet = aWord.substring(0,1);			//First letter of the word...
				
					switch(firstLet){
					
						case "A":
							if (findWord(aWord, Amap)){
								System.out.println("Found " + aWord);
							}
							
						case "B":
							if (findWord(aWord, Bmap)){
								System.out.println("Found " + aWord);
							}
							
						case "C":
							if (findWord(aWord, Cmap)){
								System.out.println("Found " + aWord);
							}
							
						case "D":
							if (findWord(aWord, Dmap)){
								System.out.println("Found " + aWord);
							}
							
						case "E":
							if (findWord(aWord, Emap)){
								System.out.println("Found " + aWord);
							}
							
						case "F":
							if (findWord(aWord, Fmap)){
								System.out.println("Found " + aWord);
							}
							
						case "G":
							if (findWord(aWord, Gmap)){
								System.out.println("Found " + aWord);
							}
							
						case "H":
							if (findWord(aWord, Hmap)){
								System.out.println("Found " + aWord);
							}
							
						case "I":
							if (findWord(aWord, Imap)){
								System.out.println("Found " + aWord);
							}
							
						case "J":
							if (findWord(aWord, Jmap)){
								System.out.println("Found " + aWord);
							}
							
						case "K":
							if (findWord(aWord, Kmap)){
								System.out.println("Found " + aWord);
							}
							
						case "L":
							if (findWord(aWord, Lmap)){
								System.out.println("Found " + aWord);
							}
							
						case "M":
							if (findWord(aWord, Mmap)){
								System.out.println("Found " + aWord);
							}
							
						case "N":
							if (findWord(aWord, Nmap)){
								System.out.println("Found " + aWord);
							}
							
						case "O":
							if (findWord(aWord, Omap)){
								System.out.println("Found " + aWord);
							}
							
						case "P":
							if (findWord(aWord, Pmap)){
								System.out.println("Found " + aWord);
							}
							
						case "Q":
							if (findWord(aWord, Qmap)){
								System.out.println("Found " + aWord);
							}
							
						case "R":
							if (findWord(aWord, Rmap)){
								System.out.println("Found " + aWord);
							}
							
						case "S":
							if (findWord(aWord, Smap)){
								System.out.println("Found " + aWord);
							}
							
						case "T":
							if (findWord(aWord, Tmap)){
								System.out.println("Found " + aWord);
							}
							
						case "U":
							if (findWord(aWord, Umap)){
								System.out.println("Found " + aWord);
							}
							
						case "V":
							if (findWord(aWord, Vmap)){
								System.out.println("Found " + aWord);
							}
							
						case "W":
							if (findWord(aWord, Wmap)){
								System.out.println("Found " + aWord);
							}
							
						case "X":
							if (findWord(aWord, Xmap)){
								System.out.println("Found " + aWord);
							}
							
						case "Y":
							if (findWord(aWord, Ymap)){
								System.out.println("Found " + aWord);
							}
							
						case "Z":
							if (findWord(aWord, Zmap)){
								System.out.println("Found " + aWord);
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
	
	
	private boolean findWord(String word, HashMap<Integer, int[]> letMap) {
		int wordLength = word.length();
		char[] wordArray = word.toCharArray();
		int hashLength = letMap.size();
		
		for (int i = 0; i < hashLength; i++) {
			
			

			
		}
		return false;
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
