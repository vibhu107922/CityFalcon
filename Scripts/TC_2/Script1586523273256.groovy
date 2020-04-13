import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging-server.cityfalcon.com/news/trending')

WebUI.click(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/i_More_img desktop far fa-angle-down'))

WebUI.click(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/i_More_img desktop far fa-angle-down'))

WebElement first =  WebUI.click(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/[1]'))

int top = first.toString();

top.intValue();

WebElement second = WebUI.click(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/[2]'))

int bottom = second.toString()

bottom.

if(top>bottom)
{
	System.out.println("sorted- Test case Passed")
	
}

WebUI.closeBrowser()

