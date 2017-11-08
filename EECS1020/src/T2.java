import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import type.lib.Fraction;

public class T2 {

	public static void main(String[] args) {
		final Fraction IDEAL = new Fraction(233, 299);
		final int LESSTHAN = -1;
		Scanner in = new Scanner(System.in);

		int pure = 0;
		int count = 0;

		System.out.println("How many fractions?");

		int fractions = in.nextInt();

		System.out.println("Enter them:");

		Fraction sum = new Fraction();
		for (int i = 1; i <= fractions; i++) {

			Fraction a1 = new Fraction(in.nextLong(), in.nextLong());

			if (a1.getNumerator() < a1.getDenominator()) {
				pure++;
			}
			// System.out.println(a1.toString());
			int compare = a1.compareTo(IDEAL);

			if (compare == LESSTHAN) {
				count++;
			}

			sum.add(a1);
			if (i == fractions) {
				System.out.println("Their sum is "+sum.toString());
			}
		}

		System.out.println(pure + " of them are pure.");
		System.out.println("And " + count + " of them are less than ideal.");

	}
}
