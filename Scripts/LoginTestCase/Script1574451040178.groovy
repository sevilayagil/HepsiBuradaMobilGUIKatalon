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

Mobile.startApplication('C:\\Users\\Sevo\\Downloads\\hepsiburada-3-0-8.apk', true)

Mobile.tap(findTestObject('LoginObjectRepository/account'), 0)

Mobile.tap(findTestObject('LoginObjectRepository/Giri Yap'), 0)

Mobile.setText(findTestObject('LoginObjectRepository/E-posta'), 'sevilaytest10@gmail.com', 0)

Mobile.setText(findTestObject('LoginObjectRepository/ifre'), 'Sa2456', 0)

Mobile.tap(findTestObject('LoginObjectRepository/Gvenli Giri'), 0)

Mobile.verifyElementVisible(findTestObject('LoginObjectRepository/TAMAM'), 0)

Mobile.tap(findTestObject('LoginObjectRepository/TAMAM'), 0)

Mobile.closeApplication()

