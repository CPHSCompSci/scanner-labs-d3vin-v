//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sFile = new Scanner(new File("DogFood.txt"));
		
		while(sFile.hasNextLine()) {
			String line = sFile.nextLine();
			
			
			System.out.println(line);
			
			
		}
	}
}