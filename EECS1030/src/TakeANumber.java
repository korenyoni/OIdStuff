
public class TakeANumber 
{
	private static final TakeANumber flatulence= new TakeANumber();
	private   int ticketnumber; 
	
	private TakeANumber()
	{
		super();
	}
	
	public static TakeANumber getInstance()
	{
		
		return flatulence;
		
	}
	public int takeTicket()
	{
		this.ticketnumber++;
		return this.ticketnumber;
	}

}
