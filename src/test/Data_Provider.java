package test;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider {

	@DataProvider(name="regTestDataProvider")
	public static Object[][] getData(){
		Object[][] data = new Object[2][3];

		data[0][0]="U1";
		data[0][1]="P1";
		data[0][2]="xyz@gmail.com";

		data[1][0]="U2";
		data[1][1]="P2";
		data[1][2]="abc@gmail.com";

		return data;
	}

	@DataProvider(name="loginTestDataProvider")
	public static Object[][] getLoginData(){
		Object[][] data = new Object[2][2];

		data[0][0]="U3";
		data[0][1]="P3";

		data[1][0]="U4";
		data[1][1]="P4";

		return data;

	}

	@DataProvider(name="testDataProvider")
	public static Object[][] getsampledata(Method m){
		Object[][] data = null;

		if(m.getName().equals("testA")){
			data = new Object[2][2];
			data[0][0]="U5";
			data[0][1]="P5";

			data[1][0]="U6";
			data[1][1]="P6";

		}else if(m.getName().equals("testB")){
			data = new Object[2][3];
			data[0][0]="U7";
			data[0][1]="P7";
			data[0][2]="test1@gmail.com";

			data[1][0]="U8";
			data[1][1]="P8";
			data[1][2]="test2@gmail.com";
		}
		return data;
	}
}