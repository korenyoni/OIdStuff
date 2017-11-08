	import java.util.Scanner;
	
	import type.lib.ToolBox;
	
	
	public class L5C 
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
			double tax = 0;
			double marginalRate;
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter taxable income....");
			
			double income=input.nextDouble();
			double incomeOriginal=income;
		//	ToolBox.crash(income<EXEMPTION_TOLERANCE,"The taxable income mustbe at least $"+EXEMPTION_TOLERANCE);
			System.out.println("Enter increment...");
			double increment=input.nextDouble();
			System.out.println("Enter number of rows ...");
			int rowNum=input.nextInt();
			System.out.println("INCOME     TAX     AVG     MGN");
		
			for(int i=0;i<rowNum;i++)
						
						{
							income=income+increment;
						
							if(income<=BRACKET1)
							{
								tax=income*TAX1;
							//System.out.println(tax);
							marginalRate=TAX1;
							//System.out.println(tax);
							}
							else
							{
								tax=BRACKET1*TAX1;
							income=income-BRACKET1;
						//	System.out.println(tax);
							
							if(income<=BRACKET2)
							{
						 tax+= income*TAX2;
						// System.out.println(tax);
						 marginalRate=TAX2;
							//System.out.println(tax);
							}
						
							else
							{
								tax=tax+TAX2*BRACKET2;
								income=income-BRACKET2;
							//	System.out.println(tax);
							
							if(income<=BRACKET3)
							{
								tax+=(income*TAX3);
							//	System.out.println(tax);
								marginalRate=TAX3;
								//System.out.println(tax);
							}
							else
							{
								tax=tax+TAX3*BRACKET3+((income-BRACKET3)*TAX4);
							//	System.out.println(tax);
								marginalRate=TAX4;
							//	System.out.println(tax);
							}
							
							
							}
									
			}
							System.out.print(incomeOriginal+"    ");
							System.out.printf(" %,.2f     ", tax);
							double averageRate = PERCENTAGE * tax / incomeOriginal;
							System.out.printf("%.1f%%     ", averageRate);
							
							System.out.println("    "+ marginalRate*PERCENTAGE);
							incomeOriginal=incomeOriginal+increment;	
						
		}
	
		}
	}			
	
	
