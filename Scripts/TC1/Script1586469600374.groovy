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

WebUI.navigateToUrl('https://staging-server.cityfalcon.com/search')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Page_CityFALCON Search your Topics and Stories/input_Search for Topics and Stories_styles__107cce'), 
    30)

WebUI.setText(findTestObject('Object Repository/Page_CityFALCON Search your Topics and Stories/input_Search for Topics and Stories_styles__107cce'), 
    'CHINA AND NOT CORONAVIRUS')

WebUI.click(findTestObject('Object Repository/Page_CityFALCON Search your Topics and Stories/div_Search for Topics and Stories_styles__b_6ea4f9'))

WebUI.verifyTextPresent('CORONAVIRUS', false)

WebUI.click(findTestObject('Object Repository/Page_CityFALCON Search your Topics and Stories/div_CHINA AND NOT CORONAVIRUS'))

WebUI.verifyTextPresent('CORONAVIRUS', false)

WebUI.closeBrowser()

