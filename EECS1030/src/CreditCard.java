import java.util.Date;

public class CreditCard
{
	public static final double DEFAULT_LIMIT = 5000.0;
	
	protected String name;
	protected int number;
	protected double balance;
	protected double limit;

	protected CreditCard CreditCard;

	
	
	public CreditCard(int cardNum, String cardName, Date expiry)
	{
		balance = 0.0;
		limit = DEFAULT_LIMIT;
		cardName=name;
		cardNum=number;
		this.CreditCard =new CreditCard (cardName,cardNum,balance,DEFAULT_LIMIT);
		
		;
	}
	
		
	


	public CreditCard(String cardName, int cardNum, double balance2,
			double defaultLimit) {
		// TODO Auto-generated constructor stub
	}





	public boolean setLimit(double limit) 
	{
		this.limit = limit;
	return true;
	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", number=" + number + ", balance="
				+ balance + ", limit=" + limit + "]";
	}

	public static double getDefaultLimit() {
		return DEFAULT_LIMIT;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public double getLimit() {
		return limit;
	}

	public Date getExpiry() {
		return expiry;
	}
	public boolean pay(double payment)
	{
		this.balance=this.balance-payment;
		return true;
	}
	public boolean charge(double payment)
	{
		this.balance=this.balance+payment;
		return true;
	}

	private Date expiry;
	

}