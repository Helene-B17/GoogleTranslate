package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class FN0012 {
	@Given("I don't have any internet connection and I have already downloaded French and English dictionnaries")
public void i_don_t_have_any_internet_connection_and_I_have_already_downloaded_French_and_English_dictionnaries() {
	//l'application a déjà été lancée une première fois en mode connectée, le dictionnaire français est téléchargé, le dictionnaire anglais est déjà téléchargé par défaut
    Mobile.startApplication('C:\\Users\\Hélène\\Katalon Studio\\GoogleTradRT\\androidapp\\GoogleTranslate.apk', false)

}

@When("I write a texte to translate in the home screen")
public void i_write_a_texte_to_translate_in_the_home_screen() {
    Mobile.tap(findTestObject('android.widget.TextView0 - Appuyez pour saisir du texte (1)'), 10)

Mobile.verifyElementText(findTestObject('android.widget.EditText0 - Saisissez du texte (Anglais) (1)'), 'Saisissez du texte (Anglais)')

Mobile.setText(findTestObject('android.widget.EditText0 - Saisissez du texte (Anglais) (1)'), 'Do not forget to sign for today !', 
    10)

}

@Then("the application translate the text into English")
public void the_application_translate_the_text_into_English() {
    Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Noubliez pas de signer pour aujourdhui (1)'), 'N\'oubliez pas de signer pour aujourd\'hui!')

Mobile.closeApplication()

}
}