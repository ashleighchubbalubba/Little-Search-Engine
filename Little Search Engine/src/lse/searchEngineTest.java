package lse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class searchEngineTest {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args)
	throws IOException{
		
		LittleSearchEngine lse = new LittleSearchEngine();
		String docListFile = "docs.txt";
		String noiseWordFile = "noisewords.txt";
		lse.makeIndex(docListFile, noiseWordFile);
		
		System.out.println("keywordsIndex " + lse.keywordsIndex);
		System.out.println("");
		
		ArrayList<Occurrence> occs;
		ArrayList<Integer> midPoints;
		
		System.out.println("Testing insertLastOccurrence");
		occs = new ArrayList<Occurrence>();
		occs.add(new Occurrence("one.txt", 12));
		occs.add(new Occurrence("two.txt", 8));
		occs.add(new Occurrence("three.txt", 7));
		occs.add(new Occurrence("four.txt", 5));
		occs.add(new Occurrence("four.txt", 3));
		occs.add(new Occurrence("four.txt", 2));
		occs.add(new Occurrence("four.txt", 6));

		System.out.println("Before sorting:	" + occs);
		midPoints = lse.insertLastOccurrence(occs);
		
		
		System.out.println("Sorted occurrences: " + occs);
		System.out.println("MidPoints 		  : " + midPoints);
		System.out.println("");		
		
		System.out.println(lse.top5search("hall", "chubby"));
		
	

	}
}
