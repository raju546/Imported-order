package testcases;

import com.assessment.service.ValidateInput;

import junit.framework.TestCase;

public class OrderTestCase extends TestCase{

	
	ValidateInput valid = null;
	
	@Override
	public void setUp() throws Exception {
		super.setUp();
		valid = new ValidateInput();
	}

	@Override
	public void tearDown() throws Exception {
		super.tearDown();
		valid = null;
	}

	public void TestCaseValidation() {
		boolean check = valid.validate(12.2, 2);
		assertEquals(true, check);
		
		boolean check1 = valid.validate(4, 0);
		assertEquals(false, check1);
		
		boolean check2 = valid.validate(-2, 23);
		assertEquals(false, check2);
		
		boolean check3 = valid.validate(23, 50);
		assertEquals(true, check3);
	}

}

