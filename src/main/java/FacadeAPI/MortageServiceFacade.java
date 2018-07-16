package FacadeAPI;

import com.sim.facade.Customer;
import com.sim.facade.BankCore.BankService;
import com.sim.facade.BankCore.CreditService;
import com.sim.facade.BankCore.LoanService;

public class MortageServiceFacade implements IMortageServiceFacade {

	@Override
	public boolean IsEligible(Customer cust, int amount) {
		// TODO Auto-generated method stub
		boolean isEligible=false;
		BankService b= new BankService();
		LoanService loan = new LoanService();
		CreditService credit = new CreditService();
		 
		if (b.HasSufficientSavings(cust))
		{
			 System.out.println("Client : "+ cust.name +" has money.");
			 boolean noBadLoans= loan.HasNoBadLoans(cust);
			 if(noBadLoans)
			 {
				 System.out.println("Client : "+ cust.name +" has good loans.");
			 }			 
			 
			 boolean  goodCredit= credit.HasGoodCredit(cust);
			 if(goodCredit)
			 {
				 System.out.println("Client : "+ cust.name +" has good credit.");
			 }
		}			        
		return isEligible;
	}

}
