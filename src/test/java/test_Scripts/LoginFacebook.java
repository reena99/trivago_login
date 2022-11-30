package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.LoginFacebookProject;


	public class LoginFacebook extends Base_Test {
		
		@Test(dataProvider="testdata")
		public void Trivago2(String []testData) {
			
			LoginFacebookProject fb=new LoginFacebookProject(driver);
			        fb.Click_on_Login();
					fb.continuewith_FB();
					fb.enterfBEmail(testData[0]);
					fb.enterFBPassword(testData[1]);
					fb.clickOnSubmit();
		}
		@DataProvider(name = "testdata")
		public Object[][] getTestData() throws IOException {
			Object [][]testdata=ReadExcel.getMultipleData("Sheet2");
			return testdata;
}
	}
