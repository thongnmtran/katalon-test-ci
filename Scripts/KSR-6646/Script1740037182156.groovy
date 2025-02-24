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

WebUI.navigateToUrl('https://login.microsoftonline.com/e4c6debd-edfe-474f-96ed-46a8556f11ca/oauth2/authorize?client_id=00000007-0000-0000-c000-000000000000&response_type=code%20id_token&scope=openid%20profile&state=OpenIdConnect.AuthenticationProperties%3DMAAAAECupU_mhRHvkz0ADToQamMFXyD7-h3WX64ABIhU0uXHP7wTt8jHJowZhoI0pMo5LAEAAAABAAAACS5yZWRpcmVjdClodHRwczovL255dG9sbGluZy1mY2NxYS5jcm0uZHluYW1pY3MuY29tLw%26RedirectTo%3DMAAAAECupU%252fmhRHvkz0ADToQamMptmct0XjasA5VIqWXfbz4QdlliTGw6Wes0dTDzbBkImh0dHBzOi8vbnl0b2xsaW5nLWZjY3FhLmNybS5keW5hbWljcy5jb20v%26RedirectToForMcas%3Dhttps%253a%252f%252fnytolling-fccqa.crm.dynamics.com%252f&response_mode=form_post&nonce=638756331832585864.ZDAyYjRmNzgtNWYxNC00NzFlLTlhMDItMmQyYTRhZTkwNTkzMjE5NzBiODAtZDVmYi00MmNlLTk5MjMtNGNkMzc2Mzk5YWU2&redirect_uri=https%3A%2F%2Fbn1--namcrmlivesg612.crm.dynamics.com%2F&max_age=86400&claims=%7B%22id_token%22%3A%7B%22xms_cc%22%3A%7B%22values%22%3A%5B%22CP1%22%5D%7D%7D%7D&x-client-SKU=ID_NET472&x-client-ver=8.3.0.0')

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Sign in to your account/input_someoneexample.com'), 'vector_automation_3@conduentfcclients.onmicrosoft.com')

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Sign in to your account/input_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/KSR-6646/Page_Sign in to your account/input_Password'), 'IHiWwK401MojiXVCDvSvPzN7iSKjp0lK')

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Sign in to your account/input_idSIButton9'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_div'))

//WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Home Page - Dynamics 365/span_Accounts'))
//
//WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Home Page - Dynamics 365/div_Accounts'))

//WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Accounts My Active Accounts - Dynamics 365/span_New'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Account Account Opening - Business New_5e6a13/span_Enroll Account'))

//WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Account Account Opening - Business New_5e6a13/span_pa-dw'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Account Account Opening - Business New_5e6a13/div_Private'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Account Account Opening - Business New_5e6a13/div_Discard changes'))

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo'), 
    '12345678')

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1'), 
    'abcdef')

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2'), 
    'test')

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3'), 
    '700000')

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_react-combobox-view-1-instructions'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/span_Last 4 digits of Phone Number'))

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3_4'), 
    '1234')

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3_4_5'), 
    '1234')

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo'))

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo'), 
    'Tester')

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3'), 
    '12345')

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_Save'))

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3_4_5_6_7'), 
    'abcdef@gmail.com')

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3_4_5_6_7_8'), 
    '123456789')

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3_4_5_6_7_8_9'))

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3_4_5_6_7_8'), 
    '(12) 345-67892')

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_Email Address'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_Next'))

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3_4_5_6_7_8_9_10'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_react-combobox-view-7-instructions'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/li_ACURA'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_react-combobox-view-8-instructions'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/span_RL'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_react-combobox-view-5-instructions'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_2021'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/span_id_22'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/span_id_22'))

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_appmagic-text mousetrap block-undo-redo_1_2_3_4_5_6_7_8_9_10'), 
    '5234512')

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/span_id_22'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/span_Add'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_Next_1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline_1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline_1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline_1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline_1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline_1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline_1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline_1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_powerapps-icon no-focus-outline_1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_Add'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_Add_1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_react-combobox-view-25'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_react-combobox-view-25'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_combobox-view-chevron arrowContainer_1kmq8gc'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_Add Plan'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_Next_1_2'))

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_form-control creditCardToken fullWidth m-'), 
    '4412344112344113')

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_react-select-2-input'), '02')

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/div_css-qbdosj-Input'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/li_react-select-3-option-1'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_First Name'))

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_borderRed form-control creditCardToken fu'), 
    '4112344112344113')

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_First Name'), 'BALAJI')

WebUI.setText(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/input_Last Name'), 'SINGH')

//WebUI.click(null)

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/button_Save Details'))

WebUI.click(findTestObject('Object Repository/KSR-6646/Page_Microsoft Dynamics 365/button_Save Details_1'))

WebUI.closeBrowser()

