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

Mobile.tap(findTestObject('ChangeUserInfoObjectRepository/android.widget.TextView12 - Siparilerim'), 0)

Mobile.setText(findTestObject('ChangeUserInfoObjectRepository/android.widget.EditText0 - E-posta'), 'sevilaytest10@gmail.com', 
    0)

Mobile.setText(findTestObject('ChangeUserInfoObjectRepository/android.widget.EditText1 - ifre'), 'Sa2456', 0)

Mobile.tap(findTestObject('ChangeUserInfoObjectRepository/android.widget.Button0 - Gvenli Giri'), 0)

Mobile.checkElement(findTestObject('ChangeUserInfoObjectRepository/android.widget.TextView0 - Siparilerim (1)'), 0)

Mobile.tap(findTestObject('ChangeUserInfoObjectRepository/UserAccount'), 0)

Mobile.tap(findTestObject('ChangeUserInfoObjectRepository/android.widget.TextView11 - AdSoyad'), 0)

Mobile.clearText(findTestObject('ChangeUserInfoObjectRepository/android.widget.EditText0 - Ad'), 0)

Mobile.setText(findTestObject('ChangeUserInfoObjectRepository/android.widget.EditText0 - Ad'), 'Sevilay test', 0)

Mobile.tap(findTestObject('ChangeUserInfoObjectRepository/android.widget.Button0 - Gncelle'), 0)

Mobile.tap(findTestObject('ChangeUserInfoObjectRepository/UserAccount'), 0)

Mobile.verifyElementText(findTestObject('ChangeUserInfoObjectRepository/android.widget.EditText0 - Ad'), 'Sevilay test')

Mobile.closeApplication()

