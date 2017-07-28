package cargurugitest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	


	RegisterNewUser.class,
	LoginUserTest.class,
	//ForgotPassword.class,
})
public class BatchRunner {
	

}
