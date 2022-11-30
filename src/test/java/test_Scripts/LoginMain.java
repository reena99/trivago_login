package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.loginMainProject;

public class LoginMain extends Base_Test{
		
		@Test(dataProvider = "testdata")
		public void trivago1(String[]testData)  {
	      loginMainProject lp=new loginMainProject(driver); 
	      lp.click_on_Login();
	      lp.enter_Email(testData[0]);
	      lp.click_on_Next();
	      lp.Enter_password(testData[1]);
	      lp.sumbit();  
		}
		
		@DataProvider(name = "testdata")
		public Object[][] getTestData() throws IOException {
			Object [][]testdata=ReadExcel.getMultipleData("sheet1");
			return testdata;
		}

	}


