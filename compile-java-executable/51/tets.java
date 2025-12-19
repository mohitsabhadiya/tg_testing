import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class tets {

    public static Double var_GVDouble = 676.57;

    public static String var_gvstr = "test strings test";

    public static int var_GVINT = 86;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
public void actionofweb() {
    tg.openBrowser();
    tg.wait(1);
    tg.wait("ele_continue1", ComparisonType.IS_VISIBLE);
    tg.close();
}

    @Test
public void checkelement() {
    tg.openBrowser();
    tg.navigateToUrl("https://selectorshub.com/xpath-practice-page/");
    tg.wait(2);
    tg.check.isVisible("ele_selectorshub");
    tg.check.isInvisible("ele_OctomerSales2024");
    tg.check.isDisabled("ele_EnterLastname");
    tg.check.isEnabled("ele_Checkouthere");
    tg.scrollToElement("ele_MemoryTest", Direction.DOWN);
    tg.check.contains("ele_selectorshub", "HUB");
    tg.click("ele_FirstchackBox");
    tg.wait(2);
    tg.check.isSelected("ele_FirstchackBox");
    tg.wait(2);
    tg.navigateToUrl("https://www.v3cars.com/toyota-cars-monthly-sales");
    tg.wait(5);
    tg.check.isEqualTo("ele_OctomerSales2024", 209);
    tg.check.isNotEqualTo("ele_OctomerSales2024", 60);
    tg.check.isGreaterThanOrEqualTo("ele_OctomerSales2024", 43);
    tg.check.isGreaterThanOrEqualTo("ele_OctomerSales2024", 209);
    tg.check.isLessThanOrEqualTo("ele_OctomerSales2024", 908);
    tg.check.isLessThanOrEqualTo("ele_OctomerSales2024", 209);
    tg.check.isGreaterThan("ele_OctomerSales2024", 35);
    tg.check.isLessThan("ele_OctomerSales2024", 786);
    int var_QCheckWithVariable = 50;
    tg.check.isEqualTo(var_QCheckWithVariable, 50);
    tg.check.isNotEqualTo(var_QCheckWithVariable, 77);
    tg.check.isGreaterThanOrEqualTo(var_QCheckWithVariable, 50);
    tg.check.isGreaterThanOrEqualTo(var_QCheckWithVariable, 45);
    tg.check.isLessThanOrEqualTo(var_QCheckWithVariable, 50);
    tg.check.isLessThanOrEqualTo(var_QCheckWithVariable, 87);
    tg.check.isGreaterThan(var_QCheckWithVariable, 33);
    tg.check.isLessThan(var_QCheckWithVariable, 77);
    tg.close();
}

    @Test
public void repeatifelse() {
    tg.openBrowser();
    tg.navigateToUrl("https://selectorshub.com/xpath-practice-page/");
    tg.wait("ele_selectorshub", ComparisonType.IS_VISIBLE);
    while (tg.verify.isVisible("ele_selectorshub")) {
        while (tg.verify.isInvisible("ele_OctomerSales2024")) {
            while (tg.verify.isEnabled("ele_Checkouthere")) {
                while (tg.verify.isDisabled("ele_EnterLastname")) {
                    tg.scrollToElement("ele_SYSTEMDISTRIBUTIONDETAILS", Direction.DOWN);
                    tg.click("ele_FirstchackBox");
                    while (tg.verify.isSelected("ele_FirstchackBox")) {
                        tg.navigateToUrl("https://www.v3cars.com/toyota-cars-monthly-sales");
                        tg.wait(3);
                    }
                }
            }
        }
    }
    tg.check.isVisible("ele_OctomerSales2024");
    int var_repeateifcheck = 115;
    while (tg.verify.isEqualTo(var_repeateifcheck, 115)) {
        while (tg.verify.isNotEqualTo(var_repeateifcheck, 50)) {
            while (tg.verify.isGreaterThanOrEqualTo(var_repeateifcheck, 55)) {
                while (tg.verify.isGreaterThanOrEqualTo(var_repeateifcheck, 115)) {
                    while (tg.verify.isGreaterThan(var_repeateifcheck, 56)) {
                        var_repeateifcheck = tg.saveToVariable(50, var_repeateifcheck);
                        tg.navigateToUrl("https://www.amazon.com/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Drhf_sign_in&openid.assoc_handle=usflex");
                    }
                }
            }
        }
    }
    String var_QWEQWE = "HUB";
    while (tg.verify.contains(var_QWEQWE, "HU")) {
        while (tg.verify.isLessThanOrEqualTo(var_repeateifcheck, 879)) {
            while (tg.verify.isLessThanOrEqualTo(var_repeateifcheck, 115)) {
                while (tg.verify.isLessThan(var_repeateifcheck, 867)) {
                    var_repeateifcheck = tg.saveToVariable(1000, var_repeateifcheck);
                    var_QWEQWE = tg.saveToVariable("TREWQ", var_QWEQWE);
                    tg.navigateToUrl("https://www.softwaretestinghelp.com/github-tutorial/");
                }
            }
        }
    }
    tg.close();
}

    @Test
public void startifelement() {
    tg.openBrowser();
    tg.navigateToUrl("https://selectorshub.com/xpath-practice-page/");
    if (tg.performAssert("ele_selectorshub", ComparisonType.IS_VISIBLE)) {
        if (tg.performAssert("ele_OctomerSales2024", ComparisonType.IS_INVISIBLE)) {
            if (tg.performAssert("ele_Checkouthere", ComparisonType.IS_ENABLE)) {
                if (tg.performAssert("ele_EnterLastname", ComparisonType.IS_DISABLE)) {
                    tg.scrollToElement("ele_SYSTEMDISTRIBUTIONDETAILS", Direction.DOWN);
                    if (tg.performAssert("ele_selectorshub", ComparisonType.CONTAINS, "HUB")) {
                        tg.click("ele_FirstchackBox");
                        tg.wait(2);
                        if (tg.performAssert("ele_FirstchackBox", ComparisonType.IS_SELECTED)) {
                            tg.navigateToUrl("https://www.v3cars.com/toyota-cars-monthly-sales");
                        }
                    }
                }
            }
        }
    }
    tg.wait(5);
    if (tg.performAssert("ele_OctomerSales2024", ComparisonType.EQUAL_TO, 209)) {
        if (tg.performAssert("ele_OctomerSales2024", ComparisonType.NOT_EQUAL_TO, 68)) {
            if (tg.performAssert("ele_OctomerSales2024", ComparisonType.GREATER_THAN, 33)) {
                if (tg.performAssert("ele_OctomerSales2024", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 55)) {
                    if (tg.performAssert("ele_OctomerSales2024", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 209)) {
                        if (tg.performAssert("ele_OctomerSales2024", ComparisonType.LESS_THAN_OR_EQUAL_TO, 989)) {
                            if (tg.performAssert("ele_OctomerSales2024", ComparisonType.LESS_THAN_OR_EQUAL_TO, 209)) {
                                if (tg.performAssert("ele_OctomerSales2024", ComparisonType.LESS_THAN, 876)) {
                                    tg.navigateToUrl("https://www.v3cars.com/hyundai-cars-monthly-sales");
                                    tg.wait(4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    int var_TstaratIF = 50;
    if (tg.performAssert(var_TstaratIF, ComparisonType.EQUAL_TO, 50)) {
        if (tg.performAssert(var_TstaratIF, ComparisonType.NOT_EQUAL_TO, 78)) {
            if (tg.performAssert(var_TstaratIF, ComparisonType.GREATER_THAN, 33)) {
                if (tg.performAssert(var_TstaratIF, ComparisonType.GREATER_THAN_OR_EQUAL_TO, 50)) {
                    if (tg.performAssert(var_TstaratIF, ComparisonType.GREATER_THAN_OR_EQUAL_TO, 43)) {
                        if (tg.performAssert(var_TstaratIF, ComparisonType.LESS_THAN_OR_EQUAL_TO, 989)) {
                            if (tg.performAssert(var_TstaratIF, ComparisonType.LESS_THAN_OR_EQUAL_TO, 50)) {
                                if (tg.performAssert(var_TstaratIF, ComparisonType.LESS_THAN, 876)) {
                                    tg.navigateToUrl("https://www.v3cars.com/hyundai-cars-monthly-sales");
                                    tg.wait(4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    tg.close();
}

    @Test
public void tdm1() {
    tg.openBrowser();
    tg.navigateToUrl("https://www.amazon.com/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Drhf_sign_in&openid.assoc_handle=usflex");
    tg.wait("ele_Amazon", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_FirstName");
    tg.check.isVisible("ele_Mobile");
    tg.check.isVisible("ele_passwordAmazon");
    tg.type("ele_FirstName", "#TGITVAR.Name");
    tg.type("ele_Mobile", "#TGITVAR.MobileNumber");
    tg.type("ele_passwordAmazon", "#TGITVAR.Password");
    tg.click("ele_continue1");
    tg.close();
}

    @Test
public void tdm2() {
    tg.openBrowser();
    tg.navigateToUrl("https://www.amazon.com/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Drhf_sign_in&openid.assoc_handle=usflex");
    JSONObject var_TDM2Test = tg.getJsonData("https://poc5.testgrid.io/s/csv-to-json/20250424/eD3Yzp.json");
    String var_VName = "null";
    String var_VMobile = "null";
    String var_VPass = "null";
    int var_Vintegers = 0;
    while (tg.verify.isLessThan(var_Vintegers, 6)) {
        var_VName = tg.saveToVariable(var_VName, var_TDM2Test, "$.records[" + var_Vintegers + "].Name");
        var_VMobile = tg.saveToVariable(var_VMobile, var_TDM2Test, "$.records[" + var_Vintegers + "].MobileNumber");
        var_VPass = tg.saveToVariable(var_VPass, var_TDM2Test, "$.records[" + var_Vintegers + "].Password");
        tg.wait("ele_Amazon", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_FirstName");
        tg.check.isVisible("ele_Mobile");
        tg.check.isVisible("ele_passwordAmazon");
        tg.type("ele_FirstName", var_VName);
        tg.type("ele_Mobile", var_VMobile);
        tg.type("ele_passwordAmazon", var_VPass);
        tg.click("ele_continue1");
        var_Vintegers = tg.increments(var_Vintegers, 1);
    }
    tg.close();
}

    @Test
public void tdp() {
    tg.openBrowser();
    tg.navigateToUrl("https://www.amazon.com/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Drhf_sign_in&openid.assoc_handle=usflex");
    tg.wait("ele_Amazon", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_FirstName");
    tg.check.isVisible("ele_Mobile");
    tg.check.isVisible("ele_passwordAmazon");
    tg.type("ele_FirstName", "#TGITVAR.Name");
    tg.type("ele_Mobile", "#TGITVAR.MobileNumber");
    tg.type("ele_passwordAmazon", "#TGITVAR.Password");
    tg.click("ele_continue1");
    tg.close();
}
}
