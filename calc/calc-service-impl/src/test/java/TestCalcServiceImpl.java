import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.calc.service.impl.CalcServiceImpl;

public class TestCalcServiceImpl {
	
	
	private CalcServiceImpl underTest;
	
	@Before
	public void initService() {
		this.underTest = new CalcServiceImpl();
	}
	
	@Test
	public void testAdd() {
		assertEquals(this.underTest.add(1, 2),3,0);
	}
	
	@Test
    public void testSubstract() {
		assertEquals(this.underTest.subtract(1, 2),-1,0);
	}
    
	@Test
    public void testMultiply() {
		assertEquals(this.underTest.multiply(1, 2),2,0);
	}
    
	@Test
    public void testDivide() {
		assertEquals(this.underTest.divide(1, 2),0.5,0);
	}

}
