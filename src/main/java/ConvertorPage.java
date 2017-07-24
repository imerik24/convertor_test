import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Era on 22.07.2017.
 */
public class ConvertorPage {
    private WebDriver webDriver;


    @FindBy(xpath = "/html[@class='bd-designMode-null  webkit js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='bgcolor-main bbb ru sector-quotes region-54']/div[@class='pageContainer']/div[@id='main']/div[@class='--area bp-area']/div[@class='bp-container base-grid-3 sbrf-grid']/div[@class='row row1']/div[@class=' row1-col1 --area bp-area']/div[@class='sbrf-div bp-container bp-ui-dragRoot --area bp-area row']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot col-xs-12 col-sm-12 col-md-12']/div[@class='sbrf-div-list-inner --area bp-area body-container']/div[@class='bp-container container-fluid sbrf-43-text-right-grid sbrf-grid']/div[@class='row row1']/div[@class='col-xs-12 col-sm-12 col-md-12 row1-col1 --area bp-area']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot row']/div[@class='sbrf-div-list-inner --area bp-area  col-xs-12 col-sm-12 col-md-12']/div[@class='bp-widget bp-ui-dragRoot']/div[@class='bp-widget-body']/div/div[@class='widget-rates']/aside[@class='rates-aside print-invisible']/div/div[@class='rates-container rates-aside__filter']/div[@class='kit-collapse kit-collapse_expanded rates-aside__collapse']/div[@class='kit-collapse__content-layout']/div[@class='kit-collapse__content']/div[@class='rates-aside__filter-block'][1]/div[@class='rates-aside__filter-block-line rates-aside__filter-block-line_amount']/div[@class='rates-aside__filter-block-line-right input']/form/input")
    WebElement inputAmount;

    @FindBy(xpath="/html[@class='bd-designMode-null  webkit js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='bgcolor-main bbb ru sector-quotes region-54']/div[@class='pageContainer']/div[@id='main']/div[@class='--area bp-area']/div[@class='bp-container base-grid-3 sbrf-grid']/div[@class='row row1']/div[@class=' row1-col1 --area bp-area']/div[@class='sbrf-div bp-container bp-ui-dragRoot --area bp-area row']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot col-xs-12 col-sm-12 col-md-12']/div[@class='sbrf-div-list-inner --area bp-area body-container']/div[@class='bp-container container-fluid sbrf-43-text-right-grid sbrf-grid']/div[@class='row row1']/div[@class='col-xs-12 col-sm-12 col-md-12 row1-col1 --area bp-area']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot row']/div[@class='sbrf-div-list-inner --area bp-area  col-xs-12 col-sm-12 col-md-12']/div[@class='bp-widget bp-ui-dragRoot']/div[@class='bp-widget-body']/div/div[@class='widget-rates']/div[@class='rates-current rates-right']/div[@class='rates-container rates-current__container']/div[@class='rates-current__table-wrapper']/table[@class='rates-current__table']/tbody/tr[@class='rates-current__table-row']/td[@class='rates-current__table-cell rates-current__table-cell_column_sell']/span[@class='rates-current__rate rates-current__rate_increase']/span[@class='rates-current__rate-value']")
    WebElement sellAmount;

    @FindBy(xpath="/html[@class='bd-designMode-null  webkit js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='bgcolor-main bbb ru sector-quotes region-54']/div[@class='pageContainer']/div[@id='main']/div[@class='--area bp-area']/div[@class='bp-container base-grid-3 sbrf-grid']/div[@class='row row1']/div[@class=' row1-col1 --area bp-area']/div[@class='sbrf-div bp-container bp-ui-dragRoot --area bp-area row']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot col-xs-12 col-sm-12 col-md-12']/div[@class='sbrf-div-list-inner --area bp-area body-container']/div[@class='bp-container container-fluid sbrf-43-text-right-grid sbrf-grid']/div[@class='row row1']/div[@class='col-xs-12 col-sm-12 col-md-12 row1-col1 --area bp-area']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot row']/div[@class='sbrf-div-list-inner --area bp-area  col-xs-12 col-sm-12 col-md-12']/div[@class='bp-widget bp-ui-dragRoot']/div[@class='bp-widget-body']/div/div[@class='widget-rates']/aside[@class='rates-aside print-invisible']/div/div[@class='rates-container rates-aside__filter']/div[@class='kit-collapse kit-collapse_expanded rates-aside__collapse']/div[@class='kit-collapse__content-layout']/div[@class='kit-collapse__content']/div[@class='rates-aside__filter-block'][7]/button[@class='rates-button']")
    WebElement convertButn;

    @FindBy(xpath = "/html[@class='bd-designMode-null  webkit js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='bgcolor-main bbb ru sector-quotes region-54']/div[@class='pageContainer']/div[@id='main']/div[@class='--area bp-area']/div[@class='bp-container base-grid-3 sbrf-grid']/div[@class='row row1']/div[@class=' row1-col1 --area bp-area']/div[@class='sbrf-div bp-container bp-ui-dragRoot --area bp-area row']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot col-xs-12 col-sm-12 col-md-12']/div[@class='sbrf-div-list-inner --area bp-area body-container']/div[@class='bp-container container-fluid sbrf-43-text-right-grid sbrf-grid']/div[@class='row row1']/div[@class='col-xs-12 col-sm-12 col-md-12 row1-col1 --area bp-area']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot row']/div[@class='sbrf-div-list-inner --area bp-area  col-xs-12 col-sm-12 col-md-12']/div[@class='bp-widget bp-ui-dragRoot']/div[@class='bp-widget-body']/div/div[@class='widget-rates']/aside[@class='rates-aside print-invisible']/div/div[@class='rates-converter-result']/div[@class='rates-converter-result__total']/span[@class='rates-converter-result__total-to']")
    WebElement convertAmount;

    @FindBy(xpath = "/html[@class='bd-designMode-null  webkit js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='bgcolor-main bbb ru sector-quotes region-54']/div[@class='pageContainer']/div[@id='main']/div[@class='--area bp-area']/div[@class='bp-container base-grid-3 sbrf-grid']/div[@class='row row1']/div[@class=' row1-col1 --area bp-area']/div[@class='sbrf-div bp-container bp-ui-dragRoot --area bp-area row']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot col-xs-12 col-sm-12 col-md-12']/div[@class='sbrf-div-list-inner --area bp-area body-container']/div[@class='bp-container container-fluid sbrf-43-text-right-grid sbrf-grid']/div[@class='row row1']/div[@class='col-xs-12 col-sm-12 col-md-12 row1-col1 --area bp-area']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot row']/div[@class='sbrf-div-list-inner --area bp-area  col-xs-12 col-sm-12 col-md-12']/div[@class='bp-widget bp-ui-dragRoot']/div[@class='bp-widget-body']/div/div[@class='widget-rates']/aside[@class='rates-aside print-invisible']/div/div[@class='rates-container rates-aside__filter']/div[@class='kit-collapse kit-collapse_expanded rates-aside__collapse']/div[@class='kit-collapse__content-layout']/div[@class='kit-collapse__content']/div[@class='rates-aside__filter-block'][1]/div[@class='rates-aside__filter-block-line'][2]/div[@class='rates-aside__filter-block-line-right']/div/header")
    WebElement select;

    @FindBy(xpath = "/html[@class='bd-designMode-null  webkit js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='bgcolor-main bbb ru sector-quotes region-54']/div[@class='pageContainer']/div[@id='main']/div[@class='--area bp-area']/div[@class='bp-container base-grid-3 sbrf-grid']/div[@class='row row1']/div[@class=' row1-col1 --area bp-area']/div[@class='sbrf-div bp-container bp-ui-dragRoot --area bp-area row']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot col-xs-12 col-sm-12 col-md-12']/div[@class='sbrf-div-list-inner --area bp-area body-container']/div[@class='bp-container container-fluid sbrf-43-text-right-grid sbrf-grid']/div[@class='row row1']/div[@class='col-xs-12 col-sm-12 col-md-12 row1-col1 --area bp-area']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot row']/div[@class='sbrf-div-list-inner --area bp-area  col-xs-12 col-sm-12 col-md-12']/div[@class='bp-widget bp-ui-dragRoot']/div[@class='bp-widget-body']/div/div[@class='widget-rates']/div[@class='rates-current rates-right']/div[@class='rates-container rates-current__container']/div[@class='rates-current__table-wrapper']/table[@class='rates-current__table']/tbody/tr[@class='rates-current__table-row']/td[@class='rates-current__table-cell rates-current__table-cell_column_name']")
    WebElement currencyName;


    public static double stringToDouble(String str){
        str=str.replaceAll("[a-z A-Z]+","");
        str=str.replace(',','.');
        return Double.parseDouble(str);
    }

    public ConvertorPage(WebDriver driver){
        webDriver=driver;
        PageFactory.initElements(webDriver,this);
    }

    public void clickConvertBtn(){
        WebDriverWait wait=new WebDriverWait(webDriver,20,2000);
        wait.until(ExpectedConditions.visibilityOf(convertButn));
        convertButn.click();
    }

    public void setInputAmount(String sum){
        WebDriverWait wait=new WebDriverWait(webDriver,20,2000);
        wait.until(ExpectedConditions.visibilityOf(inputAmount));
        inputAmount.clear();
        inputAmount.sendKeys(sum);
    }

    public String getInputAmount(){
        WebDriverWait wait=new WebDriverWait(webDriver,20,2000);
        wait.until(ExpectedConditions.visibilityOf(inputAmount));
        return inputAmount.getAttribute("value");
    }

    public String getSelect(){
        WebDriverWait wait=new WebDriverWait(webDriver,20,2000);
        wait.until(ExpectedConditions.visibilityOf(sellAmount));
        return select.getText();
    }

    public void setSelect(String val){
        WebDriverWait wait=new WebDriverWait(webDriver,20,2000);
        wait.until(ExpectedConditions.visibilityOf(select));
        select.click();
        WebElement selectTest =webDriver.findElement(By.xpath("/html[@class='bd-designMode-null  webkit js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='bgcolor-main bbb ru sector-quotes region-54']/div[@class='pageContainer']/div[@id='main']/div[@class='--area bp-area']/div[@class='bp-container base-grid-3 sbrf-grid']/div[@class='row row1']/div[@class=' row1-col1 --area bp-area']/div[@class='sbrf-div bp-container bp-ui-dragRoot --area bp-area row']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot col-xs-12 col-sm-12 col-md-12']/div[@class='sbrf-div-list-inner --area bp-area body-container']/div[@class='bp-container container-fluid sbrf-43-text-right-grid sbrf-grid']/div[@class='row row1']/div[@class='col-xs-12 col-sm-12 col-md-12 row1-col1 --area bp-area']/div[@class='sbrf-div-list-wrapper bp-container bp-ui-dragRoot row']/div[@class='sbrf-div-list-inner --area bp-area  col-xs-12 col-sm-12 col-md-12']/div[@class='bp-widget bp-ui-dragRoot']/div[@class='bp-widget-body']/div/div[@class='widget-rates']/aside[@class='rates-aside print-invisible']/div/div[@class='rates-container rates-aside__filter']/div[@class='kit-collapse kit-collapse_expanded rates-aside__collapse']/div[@class='kit-collapse__content-layout']/div[@class='kit-collapse__content']/div[@class='rates-aside__filter-block'][1]/div[@class='rates-aside__filter-block-line'][2]/div[@class='rates-aside__filter-block-line-right']/div/div/span[text()='"+val+"']"));
        selectTest.click();
    }

    public String getSellAmount(){
        WebDriverWait wait=new WebDriverWait(webDriver,20,2000);
        wait.until(ExpectedConditions.visibilityOf(sellAmount));
        return sellAmount.getText();
    }

    public String getConvertAmount(){
        WebDriverWait wait=new WebDriverWait(webDriver,20,2000);
        wait.until(ExpectedConditions.visibilityOf(convertAmount));
        return convertAmount.getText();
    }

    public String getCurrencyName(){
        WebDriverWait wait=new WebDriverWait(webDriver,20,2000);
        wait.until(ExpectedConditions.visibilityOf(currencyName));
        return currencyName.getText();
    }
}
