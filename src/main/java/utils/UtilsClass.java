package utils;

import java.io.IOException;

import com.orhm.basePakage.BaseClass;

public class UtilsClass extends BaseClass {

	public UtilsClass() throws IOException {
		super();
		
	}
	
	public void frame()
	{
		driver.switchTo().frame("");
	}

}
