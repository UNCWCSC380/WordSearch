package wordsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class WordSearch {
	
	//These variables will be used for all algorithms
	private String[][] puzzleArray;
	private ArrayList<String> wordsList = new ArrayList<String>();
	private int numCols;
	private int numRows;
	
	//this variable changes how many time the current puzzle is solved
	private int iterations = 1000;
	
	//These variables are used for the brute force algorithm
	private int x = 0;
	private int y= 0;
	private String[] directions = new String[] {"up", "down", "left", "right","up-right","down-right","left-up","left-down" }; 
	
	@SuppressWarnings("unused")
	private String direction;
	@SuppressWarnings("unused")
	private int foundX, foundY;

	
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
		//printPuzzle();
		
		
		//bruteForce();
		//boyerMoore();
		bear();
		//Rabin();
		
		}

	private void Rabin() {
		int amount = 0;
		long timeStart = System.currentTimeMillis();
		
		@SuppressWarnings("unused")
		int wordCount = 0;
		
		
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
		
		while (amount < iterations) {
		
		
			RabinKarpp rk = new RabinKarpp();
			boolean found = false;
			
			//Generate Algorithm here
			for (String word: wordsList) {
				for (String direction : directionList) {
					if (!found) {
						found = rk.findPattern(word, direction);
						
					}
					else {
//						System.out.println("Word found: " + word);
						wordCount++;
						break;
					}
				}
			}
			amount++;
		}
		long timeEnd = System.currentTimeMillis();
		long timeElapsed = timeEnd - timeStart;
		float num = (float) timeElapsed/1000 ;
		System.out.println(num);
		//System.out.println("Rabin-Karp method took "+ num +" seconds to solve a " + numRows +"x" +numCols + " sized puzzle with " + wordsList.size() + " words " +iterations+" times");
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
		
		String here;
		for (int i = 0; i < puzzleArray.length; i++){
			for (int j = 0; j < puzzleArray.length; j++){
				
				here = puzzleArray[i][j];
				switch(here){
					
					case "A":
						numOfAs++;
						int[] coords1 = {i, j};
						Amap.put(numOfAs, coords1);	
						break;
					case "B":
						numOfBs++;
						int[] coords2 = {i, j};
						Bmap.put(numOfBs, coords2);
						break;
					case "C":
						numOfCs++;
						int[] coords3 = {i, j};
						Cmap.put(numOfCs, coords3);
						break;
					case "D":
						numOfDs++;
						int [] coords4 = {i, j};
						Dmap.put(numOfDs, coords4);
						break;
					case "E":
						numOfEs++;
						int [] coords5 = {i, j};
						Emap.put(numOfEs, coords5);
						break;
					case "F":
						numOfFs++;
						int [] coords6 = {i, j};
						Fmap.put(numOfFs, coords6);
						break;
					case "G":
						numOfGs++;
						int [] coords7 = {i, j};
						Gmap.put(numOfGs, coords7);
						break;
					case "H":
						numOfHs++;
						int[] coords8 = {i, j};
						Hmap.put(numOfHs, coords8);
						break;
					case "I":
						numOfIs++;
						int[] coords9 = {i, j};
						Imap.put(numOfIs, coords9);
						break;
					case "J":
						numOfJs++;
						int[] coords10 = {i, j};
						Jmap.put(numOfJs, coords10);
						break;
					case "K":
						numOfKs++;
						int[] coords11 = {i, j};
						Kmap.put(numOfKs, coords11);
						break;
					case "L":
						numOfLs++;
						int[] coords12 = {i, j};
						Lmap.put(numOfLs, coords12);
						break;
					case "M":
						numOfMs++;
						int[] coords13 = {i, j};
						Mmap.put(numOfMs, coords13);
						break;
					case "N":
						numOfNs++;
						int[] coords14 = {i, j};
						Nmap.put(numOfNs, coords14);
						break;
					case "O":
						numOfOs++;
						int[] coords15 = {i, j};
						Omap.put(numOfOs, coords15);
						break;
					case "P":
						numOfPs++;
						int[] coords16 = {i, j};
						Pmap.put(numOfPs, coords16);
						break;
					case "Q":
						numOfQs++;
						int[] coords17 = {i, j};
						Qmap.put(numOfQs, coords17);
						break;
					case "R":
						numOfRs++;
						int[] coords18 = {i, j};
						Rmap.put(numOfRs, coords18);
						break;
					case "S":
						numOfSs++;
						int[] coords19 = {i, j};
						Smap.put(numOfSs, coords19);
						break;
					case "T":
						numOfTs++;
						int[] coords20 = {i, j};
						Tmap.put(numOfTs, coords20);
						break;
					case "U":
						numOfUs++;
						int[] coords21 = {i, j};
						Umap.put(numOfUs, coords21);
						break;
					case "V":
						numOfVs++;
						int[] coords22 = {i, j};
						Vmap.put(numOfVs, coords22);
						break;
					case "W":
						numOfWs++;
						int[] coords23 = {i, j};
						Wmap.put(numOfWs, coords23);
						break;
					case "X":
						numOfXs++;
						int[] coords24 = {i, j};
						Xmap.put(numOfXs, coords24);
						break;
					case "Y":
						numOfYs++;
						int[] coords25 = {i, j};
						Ymap.put(numOfYs, coords25);
						break;
					case "Z":
						numOfZs++;
						int[] coords26 = {i, j};
						Zmap.put(numOfZs, coords26);
						break;
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
							if (findWord(aWord, Amap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "B":
							if (findWord(aWord, Bmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "C":
							if (findWord(aWord, Cmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "D":
							if (findWord(aWord, Dmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "E":
							if (findWord(aWord, Emap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "F":
							if (findWord(aWord, Fmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "G":
							if (findWord(aWord, Gmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "H":
							if (findWord(aWord, Hmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "I":
							if (findWord(aWord, Imap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "J":
							if (findWord(aWord, Jmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "K":
							if (findWord(aWord, Kmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "L":
							if (findWord(aWord, Lmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "M":
							if (findWord(aWord, Mmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "N":
							if (findWord(aWord, Nmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "O":
							if (findWord(aWord, Omap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "P":
							if (findWord(aWord, Pmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "Q":
							if (findWord(aWord, Qmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "R":
							if (findWord(aWord, Rmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "S":
							if (findWord(aWord, Smap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "T":
							if (findWord(aWord, Tmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "U":
							if (findWord(aWord, Umap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "V":
							if (findWord(aWord, Vmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "W":
							if (findWord(aWord, Wmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "X":
							if (findWord(aWord, Xmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "Y":
							if (findWord(aWord, Ymap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
							
						case "Z":
							if (findWord(aWord, Zmap) == true){
								//System.out.println("Found: " + aWord);
							}
							break;
					}
			}
			amount++;
		}
		
		
		long timeEnd = System.currentTimeMillis();
		long timeElapsed = timeEnd - timeStart;
		float num = (float) timeElapsed/1000 ;
		System.out.println("Bear method took "+ num +" seconds to solve a " + numRows +"x" +numCols + " sized puzzle with " + wordsList.size() + " words " +iterations+" times");
		//System.out.println(num);
	}
	
	private boolean findWord(String word, HashMap<Integer, int[]> letMap) {
		boolean didFind = false;
		
		int wordLength = word.length();
		int hashLength = letMap.size();
		
		for (int i = 1; i <= hashLength; i++) {
			
			int x;
			int y;
			String temp;
			int[] holder;
			
			for (int j = 1; j <= 8; j++){
				
				switch(j){
				
				case 1:
					// Look Right
					holder = letMap.get(i);
					x = holder[0];
					y = holder[1];
					
					temp = puzzleArray[x][y];
					
					for (int k = 1; k < wordLength; k++){
						if (x + k > (numCols -1)){
							x = k * -1;
						}
						temp = temp + puzzleArray[x + k][y];
						String wrdTemp = word.substring(0, k+1);
						if (temp.equals(wrdTemp) == false){
							break;
						}
					}
					if (temp.equals(word)){
						didFind = true;
						return didFind;
					}
					break;
					
				case 2:
					// Look Left
					holder = letMap.get(i);
					x = holder[0];
					y = holder[1];
					
					temp = puzzleArray[x][y];
					
					for (int k = 1; k < wordLength; k++){
						if (x - k < 0){
							x = (numCols -1) + k;
						}
						temp = temp + puzzleArray[x - k][y];
						String wrdTemp = word.substring(0, k+1);
						if (temp.equals(wrdTemp) == false){
							break;
						}
					}
					if (temp.equals(word)){
						didFind = true;
						return didFind;
					}
					break;
					
				case 3:
					// Look Up
					holder = letMap.get(i);
					x = holder[0];
					y = holder[1];
					
					temp = puzzleArray[x][y];
					
					for (int k = 1; k < wordLength; k++){
						if (y - k < 0){
							y = (numCols -1) + k;
						}
						temp = temp + puzzleArray[x][y - k];
						String wrdTemp = word.substring(0, k+1);
						if (temp.equals(wrdTemp) == false){
							break;
						}
					}
					if (temp.equals(word)){
						didFind = true;
						return didFind;
					}
					break;
					
				case 4:
					// Look Down
					holder = letMap.get(i);
					x = holder[0];
					y = holder[1];
					
					temp = puzzleArray[x][y];
					
					for (int k = 1; k < wordLength; k++){
						if (y + k > (numCols -1)){
							y = k * -1;
						}
						temp = temp + puzzleArray[x][y + k];
						String wrdTemp = word.substring(0, k+1);
						if (temp.equals(wrdTemp) == false){
							break;
						}
					}
					if (temp.equals(word)){
						didFind = true;
						return didFind;
					}
					break;
					
				case 5:
					// Look Right-Up
					holder = letMap.get(i);
					x = holder[0];
					y = holder[1];
					
					temp = puzzleArray[x][y];
					
					for (int k = 1; k < wordLength; k++){
						if (x + k > (numCols -1)){
							x = k * -1;
						}
						if (y - k < 0){
							y = (numCols -1) + k;
						}
						temp = temp + puzzleArray[x + k][y - k];
						String wrdTemp = word.substring(0, k+1);
						if (temp.equals(wrdTemp) == false){
							break;
						}
					}
					if (temp.equals(word)){
						didFind = true;
						return didFind;
					}
					break;
					
				case 6:
					// Look Right-Down
					holder = letMap.get(i);
					x = holder[0];
					y = holder[1];
					
					temp = puzzleArray[x][y];
					
					for (int k = 1; k < wordLength; k++){
						if (x + k > (numCols -1)){
							x = k * -1;
						}
						if (y + k > (numCols -1)){
							y = k * -1;
						}
						temp = temp + puzzleArray[x + k][y + k];
						String wrdTemp = word.substring(0, k+1);
						if (temp.equals(wrdTemp) == false){
							break;
						}
					}
					if (temp.equals(word)){
						didFind = true;
						return didFind;
					}
					break;
					
				case 7:
					// Look Left-Up
					holder = letMap.get(i);
					x = holder[0];
					y = holder[1];
					
					temp = puzzleArray[x][y];
					
					for (int k = 1; k < wordLength; k++){
						if (x - k < 0){
							x = (numCols -1) + k;
						}
						if (y - k < 0){
							y = (numCols -1) + k;
						}
						temp = temp + puzzleArray[x - k][y - k];
						String wrdTemp = word.substring(0, k+1);
						if (temp.equals(wrdTemp) == false){
							break;
						}
					}
					if (temp.equals(word)){
						didFind = true;
						return didFind;
					}
					break;
					
				case 8:
					// Look Left-Down
					holder = letMap.get(i);
					x = holder[0];
					y = holder[1];
					
					temp = puzzleArray[x][y];
					
					for (int k = 1; k < wordLength; k++){
						if (x - k < 0){
							x = (numCols -1) + k;
						}
						if (y + k > (numCols -1)){
							y = k * -1;
						}
						temp = temp + puzzleArray[x - k][y + k];
						String wrdTemp = word.substring(0, k+1);
						if (temp.equals(wrdTemp) == false){
							break;
						}
					}
					if (temp.equals(word)){
						didFind = true;
						return didFind;
					}
					break;	
				}	
			}
		}
		return false;
	}
//===========================================================================================================================================
	
	private void boyerMoore() {
		
		int amount = 0;
		long timeStart = System.currentTimeMillis();
		//STRING PREPROCESSING
		//change the puzzle to string before beginning and add to direction array
		
		
		@SuppressWarnings("unused")
		int wordsFound = 0;
		
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
		//System.out.println("Words found by Boyer Moore= " + wordsFound);
		//System.out.println("Boyer-Moore method took "+ num +" seconds to solve a " + numRows +"x" +numCols + " sized puzzle with " + wordsList.size() + " words " +iterations+" times");
		System.out.println(num);
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
//					System.out.println("The word "+word+" was found at Row:"+ foundY+ " Col:"
//					 + foundX
//					 +" going " +direction);
				}
			}
			amount++;
		}
		long timeEnd = System.currentTimeMillis();
		long timeElapsed = timeEnd - timeStart;
		float num = (float) timeElapsed/1000 ;
		//System.out.println("Brute Force method took "+ num +" seconds to solve a " + numRows +"x" +numCols + " sized puzzle with " + wordsList.size() + " words " +iterations+" times");
		System.out.println(num);
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
