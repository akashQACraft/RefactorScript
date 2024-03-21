package pages.ticket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import tests.TestDriverActions;

public class EstimateFormatMissingLaborNotesDescription extends TestDriverActions {
    @FindBy(xpath = "(//a[contains(text(),'Invoice Setup')])[1]")
    WebElement InvoiceSetup;

    @FindBy(xpath = "//a[contains(.,'Add')]")
    WebElement Add;

    @FindBy(xpath = "(//a[contains(.,'Select')])[7]")
    WebElement btn_Select;

    @FindBy(xpath = "(//td[contains(.,' [Work Order Estimate]')])[3]")
    WebElement btn_WorkOrderEstimate;

    @FindBy(xpath = "//select[contains(@id,':soc10::content')]")
    WebElement WorkOrderEstimate;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement btn_Cancel;

    @FindBy(xpath = "(//a[contains(.,'OK')])[1]")
    WebElement btn_OK;

    @FindBy(xpath = "(//a[contains(.,'Repair Locations')])[3]")
    WebElement RepairLocation;

    @FindBy(xpath = "//a[contains(.,'New Repair Location')]")
    WebElement NewRepairLocation;

    @FindBy(xpath = "//label[contains(text(),'Code:')]/preceding-sibling::span")
    WebElement RequiredCode;

    @FindBy(xpath = "(//label[contains(text(),'Code:')])[1]")
    WebElement Code;

    @FindBy(xpath = "(//label[contains(text(),'Code:')]/parent::td/following::td/child::input)[1]")
    WebElement CodeTextArea;

    @FindBy(xpath = "//label[text()='Name:']/preceding-sibling::span")
    WebElement RequiredName;

    @FindBy(xpath = "//label[text()='Name:']")
    WebElement Name;

    @FindBy(xpath = "(//label[text()='Name:']/parent::td/following::td/child::input)[1]")
    WebElement NameTextArea;

    @FindBy(xpath = "//h2[contains(text(),'Position Coordinates')]")
    WebElement PositionCoordinates;

    @FindBy(xpath = "//label[contains(text(),'Country:')]")
    WebElement Country;

    @FindBy(xpath = "//label[contains(text(),'Email:')]")
    WebElement Email;

    @FindBy(xpath = "(//label[contains(text(),'Phone ')])[1]")
    WebElement phoneone;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement Cancel;

    @FindBy(xpath = "//a[contains(.,'Create')]")
    WebElement Create;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement SaveExit;

    @FindBy(xpath = "(//a[contains(text(),'Repair Estimates In Progress')])[2]")
    WebElement RepairEstimatesInprogress;

    @FindBy(xpath = "(//a[contains(.,'Quick Estimate')])[2]")
    WebElement QuickEstimate;

    @FindBy(xpath = "//h1[contains(.,'New Repair Estimate')]")
    WebElement NewRepairEstimate;

    @FindBy(xpath = "//label[contains(text(),'Search Location:')]")
    WebElement SearchLocation;

    @FindBy(xpath = "//label[contains(text(),'Search Location:')]/parent::td/following::td/child::table/tbody/tr/td/span/child::input")
    WebElement SearchLocationTextArea;

    @FindBy(xpath = "//span[text()='Name']")
    WebElement Nameone;

    @FindBy(xpath = "//span[text()='Code']")
    WebElement Codeone;

    @FindBy(xpath = "//span[text()='Address']")
    WebElement Address;

    @FindBy(xpath = "//span[text()='Contact']")
    WebElement Contact;

    @FindBy(xpath = "(//span[text()='Select'])[2]")
    WebElement btn_Selectone;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    WebElement btn_Selecttwo;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
    public  WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    public  WebElement label_VMRS;

    @FindBy(xpath = "//label[contains(.,'Search:')]/parent::td/following-sibling::td/child::input")
    public WebElement SearchTextArea;

    @FindBy(xpath = "//a[contains(@id,':1:cilvmrsys')]/child::img")
    WebElement imgBody;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    public WebElement label_Add;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement label_AddButton;

    @FindBy(xpath = "//a[@title='DOOR HOLD BACK']/child::img")
    WebElement DoorHoldBack;

    @FindBy(xpath = "//a[contains(text(),'Body')]")
    WebElement Body;


    @FindBy(xpath = "(//label[contains(text(),'Notes:')])[5]")
    WebElement Notes;


















































}
