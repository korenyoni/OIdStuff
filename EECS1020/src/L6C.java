import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L6C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the performance code > ");
		String entry = input.nextLine();
		
		double geomean = 99;
		
		String regex = "([A-Z])([0-9])([A-Z]) ([0-9])([A-Z])([0-9])";
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

		

	}

}
