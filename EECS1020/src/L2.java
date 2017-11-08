		import java.io.PrintStream;
		import java.util.Scanner;
		//import type.lib.ToolBox;
		public class L2
		{
		
			public static void main(String[] args) 
			{
				
				PrintStream out = System.out;
				double G=6.67384E-11;
				double M=5.972E+24;
				double R=6371E+3;
				double altitude;
				double velocity;
				out.printf("Welcome to altitude velocity control systems, please input your sattelites altitude.\n");
				Scanner alt = new Scanner(System.in);
			    altitude= alt.nextDouble();

				//ToolBox.crash((altitude < 0) , "Invalid, altitude must be positive!");
				out.printf("Altitude at %f meters. Initiating velocity sequence!\n",altitude);
			    velocity =Math.sqrt((G*M)/(R+altitude));
				out.printf("Sattelite projected to reach %f km/h!",velocity*3.6);
			
			}
		
		}
