package staticDynamicPolymorphism;

import org.junit.Test;

public class Test_Base extends Test_Scenario    //Inherit the properties of Test_Scenario class
{          

	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		composeAnEmail();
	}
}
