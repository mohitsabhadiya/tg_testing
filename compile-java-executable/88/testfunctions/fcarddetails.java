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
import org.testng.annotations.Test;

class fcarddetails {

	public static void fcarddetails() {
		tg.wait("ele_checkout719", ComparisonType.IS_VISIBLE);
		tg.type("ele_email910", "John.tee@gmail.com");
		tg.type("ele_phonenumbe689", "6734126754");
		tg.type("ele_address565", "Storm breaker street 4126");
		tg.type("ele_city300", "New York");
		tg.type("ele_stateprovi773", "NY");
		tg.type("ele_zippostalc150", "07008");
		tg.type("ele_cardholder391", "John Tee");
		tg.type("ele_cardnumber884", "5425233430109903");
		tg.type("ele_cvv415", "252");
		tg.selectDropdownByValue("ele_select872","2026");
	}
}