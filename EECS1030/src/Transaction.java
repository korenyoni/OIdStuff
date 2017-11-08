import java.util.Date;

public class Transaction  implements Comparable<Transaction>
{

	private Date date;
	private double ammount;
	private String details;

	public Transaction(Date date, String string, double d)
	{
		this.date = new Date(date.getTime());
		this.details= string;
		this.ammount= d;
	}

	public Date getDate() {
		return new Date(date.getTime());
	}


	public double getAmmount() {
		return ammount;
	}



	public String getDetails() {
		return details;
	}


	@Override
	public String toString() {
		return "Transaction [date=" + date + ", ammount=" + ammount
				+ ", details=" + details + "]";
	}

	public int compareTo(Transaction other)
	{
		if(this.date.compareTo(other.date)==0)
		{
			if(this.details.compareTo(other.details)==0)
			{
				if(this.ammount==other.ammount)
				{
					return 0;
				}
				else if(this.ammount>other.ammount)
				{post
					return 1;
				}
				else 
				{
					return -1;
				}
					
			}
			else 
			{
				return this.details.compareTo(other.details);
			}
			
		}
		else
		{
			return this.date.compareTo(other.date);
		}
	}

	
}
