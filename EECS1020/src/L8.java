import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class L8 {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
	File stolencreditcards= new File("trx.txt"); 
	Scanner in = new Scanner(stolencreditcards);
	String info= in.nextLine();	
	String[] Ccard=info.split(",");
	String chargetype= Ccard[0];
	int cardnum=Integer.parseInt(Ccard[1]);
	if (chargetype.equals("I"))
	{
		String name=Ccard[2];
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date issue = sdf.parse(Ccard[3]);
		String date=Ccard[3];
		double charge=Double.parseDouble(Ccard[4]);
	}
	else if(chargetype.equals("C")||chargetype.equals("P"))
	{
		double charge=Double.parseDouble(Ccard[2]);
	}
	else
	{
		System.out.println("No such card!");
	}
	}

}
