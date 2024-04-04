package org.automation.generic_utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Java_Utility {
	public String getdata(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		Properties pr=new Properties();
		pr.load(fis);
		return pr.getProperty(key);
	}
	
	public void refreshPage() throws AWTException {
		Robot r=new Robot();
		r.delay(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_R);
	}

}
