package FacadeAPI;
import com.sim.facade.Customer;

public interface IMortageServiceFacade {
	
	public boolean IsEligible(Customer cust, int amount);
}
