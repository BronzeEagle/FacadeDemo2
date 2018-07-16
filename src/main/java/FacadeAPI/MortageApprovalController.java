package FacadeAPI;

import com.sim.facade.Customer;

public class MortageApprovalController {
	
	public MortageServiceFacade mortageSvcfacade;
    boolean isEligible=false;

    public boolean IsEligible(Customer cust, int amount) {

    	isEligible=mortageSvcfacade.IsEligible(cust, amount);
        System.out.println("MortageApprovalController: Mortage approval completed for: " + cust.name);
        return isEligible;
}
}
