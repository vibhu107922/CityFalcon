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

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/i_Stories Filters_fas fa-chevron-down'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/i_Stories Filters_fas fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/i_Stories Filters_fas fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/span_reset filters'))

WebUI.waitForElementVisible(findTestObject('Page_CityFALCON Trending Topics and Stories/i_Top Rated_fal fa-chevron-down'), 
    2)

WebUI.click(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/i_Top Rated_fal fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/a_Latest'))

WebElemt A = WebUI.click(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/span_2 minutes ago'))

WebElement B = WebUI.click(findTestObject('Object Repository/Page_CityFALCON Trending Topics and Stories/span_12 minutes ago'))

WebUI.scrollToElement(B, 30)

WebUI.closeBrowser()

