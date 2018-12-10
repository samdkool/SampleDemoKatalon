import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// navigate to the url
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

//maximise the window
WebUI.maximizeWindow()

// enter valid user credentials
WebUI.setText(findTestObject('Object Repository/OHRMPages/OHRM_LoginPage/OHRM_username'), userName)
WebUI.setText(findTestObject('Object Repository/OHRMPages/OHRM_LoginPage/OHRM_password'),passWord)
WebUI.click(findTestObject('Object Repository/OHRMPages/OHRM_LoginPage/OHRM_submit'))

// user profile validation
def actual_value = 'Welcome Admin'
WebUI.verifyElementText(findTestObject('Object Repository/OHRMPages/OHRM_Profile/user_profile'), actual_value, FailureHandling.STOP_ON_FAILURE)









// closing browser Instance
WebUI.closeBrowser()