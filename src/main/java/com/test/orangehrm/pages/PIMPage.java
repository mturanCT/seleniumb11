package com.test.orangehrm.pages;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/*
    1)Click PIM on the mainpage
    2)Click Add button under PIM
    3)Fill the boxes
    4)Click Save Button
    5)Wait for the next direction
     */

public class PIMPage {

    public PIMPage(WebDriver driver) {


        PageFactory.initElements(driver,this);



    }



    @FindBy(id = "btnAdd")
    WebElement addButton;

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "employeeId")
    WebElement employeeID;

    @FindBy(id = "photofile")
    WebElement chooseFile;

    @FindBy(id = "btnSave")
    WebElement saveButton;

    @FindBy(name = "personal[txtEmpFirstName]")
    WebElement validationName;

    @FindBy(name = "personal[txtEmpLastName]")
    WebElement validationLastName;

    @FindBy(name = "personal[txtEmployeeId]")
    WebElement validationEmployeeId;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement editButton;

    @FindBy(xpath = "//input[@id='personal_optGender_1']")
    WebElement maleButton;

    @FindBy(id ="personal_cmbNation")
    WebElement nationality;

    @FindBy(id = "personal_cmbMarital")
    WebElement maritualStatus;

    @FindBy(name = "personal[DOB]")
    WebElement dob;


public void addEmployeeForPim(String name, String lastName,String employeeId,String uploadFile) throws InterruptedException {

    addButton.click();
    this.firstName.sendKeys(name);
    this.lastName.sendKeys(lastName);
    this.employeeID.sendKeys(employeeId);
    this.chooseFile.sendKeys(uploadFile);
    Thread.sleep(1000);
    saveButton.click();
    Thread.sleep(1000);




}public String validationFirstName(){

    return validationName.getAttribute("value");



    }public String validationlastName(){

        return validationLastName.getAttribute("value");



    }public boolean validationOfEmployeeId(String employeeId){

    return validationEmployeeId.getAttribute("value").endsWith(employeeId);

    }

public void editPersonalDetails(String nation,String dateOfBirth,String maritualStatus){

    editButton.click();
    maleButton.click();
    BrowserUtils.selectBy(nationality,nation,"text");
    dob.clear();
    this.dob.sendKeys(dateOfBirth);
    BrowserUtils.selectBy(this.maritualStatus,maritualStatus,"text");



}
public String validateNationality(){

    Select select = new Select(nationality);
    return select.getFirstSelectedOption().getText().trim();

}
public String validateMaritualStatus(){
    Select select = new Select(maritualStatus);

    return select.getFirstSelectedOption().getText().trim();
}
}
