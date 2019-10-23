//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
   private double amount;

   public DogFood() {
	   
   }

   public DogFood(String line) {
		Scanner chopper = new Scanner(line);
		double cups = 0;
		String num = "";
		int numI;
		int numII = 0;
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i+1) == ' ') {
				num = line.substring(0, i);
				i++;
			}
			numI = Integer.parseInt(num);
			if(numI >= 2 && numI <= 4) {
				numII += 0.5 * 7;
				System.out.println("2, 4");
			}else if(numI >= 5 && numI <= 7) {
				numII += 7;
				System.out.println("5, 7");
			}else if(numI >= 8 && numI <= 9) {
				numII += 1.5 * 7;
				System.out.println("8, 9");
			}else if(numI >= 10 && numI <= 19) {
				numII += 14;
				System.out.println("10, 19");
			}else if(numI >= 20 && numI <= 39) {
				numII += 3.5 * 7;
				System.out.println("20, 39");
			}else if(numI >= 40 && numI <= 59) {
				numII += 4.5 * 7;
				System.out.println("40, 59");
			}else if(numI >= 60 && numI <= 79) {
				numII += 6 *7;
				System.out.println("60, 79");
			}else if(numI > 79) {
				numII += 7.5 * 7;
				System.out.println("> 79");
			}else {
				System.out.println("Ah fuck");
			}
		}
		
		cups = numII / 10;
   }

   public double getAmount() {
	   return 0;
   }

   public String toString() {
	   return "";
   }
}