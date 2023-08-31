package StepDefinitions;

public class LoginpagestepDefinition {
	
	//Loginpage lp = new Loginpage();
	
//@Given("^I am the  user of an application$")
//
//public void i_am_the_user_of_an_application() throws Throwable{
//	lp.OpenURL();
//}
@When("^User enter valid Username$")
public void user_enter_valid_Username() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new Exception();
}
@When ("^ User enter valid Username$")

public void User_enter__valid_username() throws Throwable{
	lp.enterUsername();
}
When ("^ User enter valid Password$")

public void User_enter__valid_Password() throws Throwable{
	lp.Password();
}
When ("^ User click on login button$")

public void User_click__on _login_button() throws Throwable{
	lp.clickonloginbutton();
}
}



