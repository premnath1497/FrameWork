package org.techpanda.live.test;

import java.io.IOException;

import org.techpanda.live.Utility.HelperTechlive;

public class TC_001 extends HelperTechlive {

	public static void main(String[] args) throws Exception {
		
		HelperTechlive.launchBrowser(TestDatalivetech.livetechUrl);
		HelperTechlive.validateTitleOfHomePage(TestDatalivetech.expectedHomePageTitle);
		HelperTechlive.validateTextOfHomePage(Elements.textOfHomePageEle,TestDatalivetech.expectedTextOfHomePage);
		HelperTechlive.clickOnMobileBtn(Elements.moblieEle);
		HelperTechlive.dropdownSelect(Elements.dropdownele, TestDatalivetech.dropdowntext);
		HelperTechlive.screenshot();
		driver.close();

	}

}
