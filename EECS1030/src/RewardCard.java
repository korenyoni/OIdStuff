import java.util.Date;


public class RewardCard extends CreditCard
{
	protected  int Points;

public RewardCard(int cardNum, String cardName, Date expiry) 
{
		super(cardNum, cardName, expiry);
		this.Points=Points;
		// TODO Auto-generated constructor stub
	}

public int getPointsBalance() {
	return Points;
}

@Override
public String toString() {
	return "RewardCard [Points=" + Points + "]"+"CreditCard [name=" + name + ", number=" + number + ", balance="
			+ balance + ", limit=" + limit + "]";
}

}
