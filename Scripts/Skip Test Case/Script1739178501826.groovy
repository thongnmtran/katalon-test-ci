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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang3.StringUtils as StringUtils
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.takeScreenshot()

CustomKeywords.'ClickNumber.passed'()

CustomKeywords.'ClickNumber.failed'()

CustomKeywords.'ClickNumber.warned'()

CustomKeywords.'ClickNumber.errored'()

WebUI.click(null, FailureHandling.OPTIONAL)

if (StringUtils.equals(varA, 'a2')) {
    WebUI.click(null, FailureHandling.CONTINUE_ON_FAILURE)
} else if (StringUtils.equals(varA, 'a3')) {
    WebUI.click(null, FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_btn-make-appointment'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_1'), 'John Doe')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_1'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_btn-login'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Facility'), 'Hongkong CURA Healthcare Center', 
//    true)
//
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readmission'))
//
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Medicaid'))
//
//WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment'), 'asdasd')
//
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_btn-book-appointment'))
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_19'))
//
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_btn-book-appointment'))
WebUI.closeBrowser()

