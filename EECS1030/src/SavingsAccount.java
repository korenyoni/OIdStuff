import java.util.Set;
import java.util.TreeSet;


public class SavingsAccount 
{

	private Set<Transaction> transactionSet= new TreeSet<Transaction>();
	private double balance;
//	private Object transaction;
	
		
		
		public SavingsAccount()
		{
			 this.balance=0.0;
			 this.transactionSet.isEmpty();
		}



		public Set<Transaction> getTransactionSet() {
			return transactionSet;
		}


		



		public double getBalance() {
			return balance;
		}



		
	
		
		public void post(Transaction t) throws NullPointerException
		{
			if(t==null)
			{
				throw new NullPointerException("Fuck Is Wrong with you?");
			}
			else
			{
			 transactionSet.add(t);
			 balance += t.getAmmount();
			}
		
		
		}



		public int compareTo(Transaction o) {
			// TODO Auto-generated method stub
			return 0;
		}



		



		
	


}