package staticDynamicPolymorphism;

public class Test_Scenario extends DynamicPolymorphism     //Inherit the properties of Dynamic Polymorphism class
{
	
	public  void composeAnEmail() //Java function
		{
			System.out.println("Test Case : ComposeAndSendAnEmail ");
			launchApplication("Gmail");
			loginToApplication(22, "12345");
			compose();
		}
}
