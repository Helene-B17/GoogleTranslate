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

Mobile.startApplication('C:\\Users\\Hélène\\Katalon Studio\\GoogleTradRT\\androidapp\\GoogleTranslate.apk', false)

Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Appuyez pour saisir du texte (1)'), 'Appuyez pour saisir du texte')

Mobile.tap(findTestObject('android.widget.TextView0 - Appuyez pour saisir du texte (1)'), 10)

Mobile.verifyElementText(findTestObject('android.widget.EditText0 - Saisissez du texte (Anglais) (1)'), 'Saisissez du texte (Anglais)')

Mobile.setText(findTestObject('android.widget.EditText0 - Saisissez du texte (Anglais) (1)'), 'Do not forget to sign for today !', 
    10)

Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Noubliez pas de signer pour aujourdhui (1)'), 'N\'oubliez pas de signer pour aujourd\'hui!')

Mobile.closeApplication()

