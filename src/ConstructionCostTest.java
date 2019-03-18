import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructionCostTest {

	@Test
	public void Constructioncosttest () 
	{
		CostOfConstruction cc=new CostOfConstruction();
		double result=cc.constructionCost("BASIC", 1000, false);
		assertEquals(1200000.0,result,0.1);
	}

}
