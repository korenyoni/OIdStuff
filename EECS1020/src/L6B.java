import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L6B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the performance code > ");
		String entry = input.nextLine();
		
		double geomean = 99;
		
		String regex = "([0-9]),([0-9])'([0-9])";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(entry);
		boolean booleanie=matcher.find();
	//	System.out.println("The match is: " + matcher.find());
		if (booleanie) 
		{
			System.out.println("y u no run");
			int x = Integer.parseInt(matcher.group(1));
			int y = Integer.parseInt(matcher.group(2));
			int z = Integer.parseInt(matcher.group(3));
			geomean = x * y * z;
			geomean = Math.cbrt(geomean);
			System.out.printf("x=%d  y=%d  z=%d\n", x, y, z);
			System.out.println(" Heres your geomean " + geomean);
		}

		/*
		 * StringBuffer sBuffer = new StringBuffer(); Pattern p =
		 * Pattern.compile("-?\\d+"); Matcher m = p.matcher(entry); while
		 * (m.find()) { sBuffer.append(m.group()); }
		 * 
		 * System.out.println(m.group());
		 * 
		 * // int num1 = Integer.parseInt(str1); // int num2 =
		 * Integer.parseInt(str2); // int num3 = Integer.parseInt(str3);
		 * 
		 * //double product = num1 * (double) num2 * num3; // double geoMean =
		 * Math.cbrt(product);
		 * 
		 * // System.out.printf("Geometric Mean = %.0f\n", geoMean);
		 */

	}

}
