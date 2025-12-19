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
public class locatorOrderInSibling {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
public void test3() {
    tg.openBrowser();
    tg.wait("ele_emailaddre651", ComparisonType.IS_VISIBLE);
    tg.click("ele_emailaddre651", 1);
    tg.wait("ele_emailaddre651", ComparisonType.IS_VISIBLE);
    tg.type("ele_emailaddre651", "test@gmail.com");
    tg.wait("ele_password196", ComparisonType.IS_VISIBLE);
    tg.click("ele_password196", 1);
    tg.wait("ele_password196", ComparisonType.IS_VISIBLE);
    tg.typeEncrypted("ele_password196", "jD/BqrMEgDFrX3bkmUIA9g==:MTIzNDU2Nzg5MTAxMTEyMQ==");
    tg.wait("ele_login515", ComparisonType.IS_VISIBLE);
    tg.click("ele_login515", 1);
    tg.close();
}
}
