import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Era on 24.07.2017.
 */
@RunWith(value = Parameterized.class)
@Title("Проверка ввода поля суммы")
@Description("Проверяет поле суммы на правильность введенных значений")
public class FirstConverterTest {
    WebDriver webDriver;
    ConvertorPage conPage;
    String posCount,negCount;

    public FirstConverterTest(String posCount, String negCount){
        this.posCount=posCount;
        this.negCount=negCount;
    }

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        conPage=new ConvertorPage(webDriver);
        webDriver.get("http://www.sberbank.ru/ru/quotes/converter");
    }

    @Parameterized.Parameters
    public static Collection<String[]> testData() throws IOException {
        return getTestData("C:\\Users\\Era\\Desktop\\convvertor_test\\src\\main\\resources\\test1.csv");
    }
    public static Collection<String[]> getTestData(String fileName) throws IOException{
        List<String[]> records = new ArrayList<String[]>();
        String record;
        BufferedReader file = new BufferedReader(new FileReader(fileName));
        while ((record=file.readLine())!=null) {
            String[] fields = record.split(",");
            records.add(fields);
        }
        file.close();
        return records;
    }

    @Test
    @Title("Позитивный тест")
    public void positiveTest(){
        conPage.setInputAmount(posCount);
        Assert.assertEquals(posCount,conPage.getInputAmount());
    }

    @Test
    @Title("Негативный тест")
    public void negativeTest(){
        conPage.setInputAmount(negCount);
        Assert.assertNotEquals(negCount,conPage.getInputAmount());
    }

    @After
    public void end(){
        if (webDriver!=null)
            webDriver.close();
    }

}
