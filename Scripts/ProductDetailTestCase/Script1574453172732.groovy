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

Mobile.tap(findTestObject('ProductDetailObjectRepository/EfsaneCuma'), 0)

Mobile.tap(findTestObject('ProductDetailObjectRepository/android.view.View5 - Bilgisayarlarda ve aksesuarlarnda 22 sepette indirim'), 
    0)

Mobile.tap(findTestObject('ProductDetailObjectRepository/android.view.View4 - HP 15-BS122NT Intel Core i3 15.6 Tanabilir Bilgisayar 1.99900 TL 2.59900 TL'), 
    0)

Mobile.tap(findTestObject('ProductDetailObjectRepository/android.widget.ScrollView0'), 0)

Mobile.tap(findTestObject('ProductDetailObjectRepository/android.view.View0'), 0)

Mobile.tap(findTestObject('ProductDetailObjectRepository/android.widget.TextView16 - Been'), 0)

Mobile.setText(findTestObject('LoginObjectRepository/E-posta'), 'sevilaytest10@gmail.com', 0)

Mobile.setText(findTestObject('LoginObjectRepository/ifre'), 'Sa2456', 0)

Mobile.tap(findTestObject('LoginObjectRepository/Gvenli Giri'), 0)

Mobile.tap(findTestObject('ProductDetailObjectRepository/android.widget.ImageView1 UserAccount'), 0)

Mobile.tap(findTestObject('ProductDetailObjectRepository/android.widget.TextView1 - Beendiklerim'), 0)

Mobile.verifyElementVisible(findTestObject('ProductDetailObjectRepository/android.view.View16 Liked'), 0)

Mobile.closeApplication()

