	import java.util.Scanner;
	
	import type.lib.ToolBox;
	
	
	public class L5B 
	{
	
		public static void main(String[] args) 
		{
			
			final double EXEMPTION_TOLERANCE=1200;
			final double BRACKET1=43561;
			final double BRACKET2= 87123;
			final double BRACKET3=135054;
			final double TAX1=0.21;
			final double TAX2= 0.33;
			final double TAX3=0.38;
			final double TAX4=0.42;
			final double PERCENTAGE=100;
			double tax;
			double marginalRate;
			double income = 0;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter taxable income....");
			
		
			boolean check=false;
			for(int i=0; check==false; i++)
			{
			 income=input.nextDouble();
				if(income<EXEMPTION_TOLERANCE)
				{
					System.out.println("The taxable income must be at least $"+EXEMPTION_TOLERANCE);
				if(i>=2)
				{
					check=true;
				}
				}
				else
				{
					check=true;
				}
			}
			
			ToolBox.crash(income<EXEMPTION_TOLERANCE,"Sorry you're having trouble");
			
		double incomeOriginal=income;
			if(income<=BRACKET1)
			{
			tax=income*TAX1;
			System.out.println(tax);
			marginalRate=TAX1;
			System.out.println(tax);
			}
			else
			{
				tax=BRACKET1*TAX1;
				income=income-BRACKET1;
				System.out.println(tax);
				
				if(income<=BRACKET2)
				{
			 tax+= income*TAX2;
			 System.out.println(tax);
			 marginalRate=TAX2;
				System.out.println(tax);
				}
			
				else
				{
					tax=tax+TAX2*BRACKET2;
					income=income-BRACKET2;
					System.out.println(tax);
				
				if(income<=BRACKET3)
				{
					tax+=(income*TAX3);
					System.out.println(tax);
					marginalRate=TAX3;
					System.out.println(tax);
				}
				else
				{
					tax=tax+TAX3*BRACKET3+((income-BRACKET3)*TAX4);
					System.out.println(tax);
					marginalRate=TAX4;
					System.out.println(tax);
				}
			}
		}
				System.out.printf("Tax = %,.2f\n", tax);
				double averageRate = PERCENTAGE * tax / incomeOriginal;
				System.out.printf("Average Rate = %.1f%%\n", averageRate);
				
				System.out.println("Marginal Rate=%.1f%%/n   "+ marginalRate*PERCENTAGE);
			}
			}
	
	
