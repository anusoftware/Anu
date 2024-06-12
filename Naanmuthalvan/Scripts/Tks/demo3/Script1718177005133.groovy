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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tkscas.com/')

WebUI.click(findTestObject('Object Repository/Tks/a_Academics'))

WebUI.click(findTestObject('Object Repository/Tks/a_Courses'))

WebUI.click(findTestObject('Object Repository/Tks/a_UG Courses'))

WebUI.click(findTestObject('Object Repository/Tks/a_Student Activities'))

WebUI.click(findTestObject('Object Repository/Tks/span_Rotract Club'))

WebUI.click(findTestObject('Object Repository/Tks/span_CLUB ACTIVITIES'))

WebUI.click(findTestObject('Object Repository/Tks/a_Admission'))

WebUI.click(findTestObject('Object Repository/Tks/a_Grievance'))

WebUI.click(findTestObject('Object Repository/Tks/a_General'))

WebUI.click(findTestObject('Object Repository/Tks/a_NIRF'))

WebUI.click(findTestObject('Object Repository/Tks/a_Home'))

WebUI.click(findTestObject('Object Repository/Tks/a_Placement'))

WebUI.closeBrowser()

