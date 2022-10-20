package TsestNGclassesTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	
	@Test(dataProvider = "getData")
	
		public void movietickets(String hero,String movie)
		{
			System.out.println(hero + "---->"+movie);
		}
	
	@DataProvider
	public Object[][] getData()
	{
	
	Object arr[][]=new Object[3][2];
	
	arr[0][0]="pawan kalyan";
	arr[0][1]="prabhas";
	arr[1][0]="mahesh babu";
	arr[1][1]="Ram charan";
	arr[2][0]="NTR";
	arr[2][1]="sampurnesh babu";
	
	return arr;
	
	

}
}
