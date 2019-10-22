//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;  

public class LineCounterRunner {
   
	public static void main(String args[]) {
		Scanner file = new Scanner("LineCounter.txt");
		
		while(file.hasNextLine()) {
			System.out.println(file.nextLine());
		}
		//LineCounter.LineCounter(file.nextLine());
		//System.out.println();
		
		file.close();
	}
}