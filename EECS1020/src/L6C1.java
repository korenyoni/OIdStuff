import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import type.lib.Stock;

public class L6C1
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the performance code > ");
		String entry = input.nextLine();

		String regex = "^(\\d+)(.+)@(\\d+[\\.]?\\d*)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(entry);

		if (matcher.find())
		{
			long start = (new Date()).getTime();
			int qty = Integer.parseInt(matcher.group(1));
			String symbol = matcher.group(2);
			double cost = Double.parseDouble(matcher.group(3));
			
			Stock stock = new Stock(symbol);
			String name = stock.getName();
			double market = stock.getPrice();
			double profit = qty * (market - cost);
			
			System.out.printf("%-15s %05d %8.2f %8.2f %12.2f %s\n", 
					entry, qty, cost, market, profit, name);
			long finish = (new Date()).getTime();
			System.out.println("Execution time = " + (finish - start));
			
			
		}
		else
		{
			System.out.println("Invalid string.");
		}

	}

}
