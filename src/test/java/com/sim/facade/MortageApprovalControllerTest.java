package com.sim.facade;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import FacadeAPI.MortageApprovalController;
import FacadeAPI.MortageServiceFacade;

public class MortageApprovalControllerTest {
	
	@Test
    public void testMortageApproval() throws Exception {

		MortageApprovalController controller=new MortageApprovalController();
		controller.mortageSvcfacade=new MortageServiceFacade();
		Customer c= new Customer();
		c.name="Samantha";      
        boolean result=controller.IsEligible(c, 50);
        assertTrue(result);
}
}
