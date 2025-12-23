import com.mongodb.*;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
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

@Listeners(TestListener.class);
public class a16dec0535 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void a16dec0535() {
		tg.openBrowser();
		tg.wait("ele_shop455", ComparisonType.IS_VISIBLE);
		tg.wait("ele_menstshirt028", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_mensouterw576");
		tg.click("ele_menstshirt027", 1);
		tg.wait("ele_img161", ComparisonType.IS_VISIBLE);
		tg.scrollToElement("ele_triblendvn874", Direction.DOWN);
		tg.click("ele_triblendvn874", 1);
		tg.wait("ele_addtocart031", ComparisonType.IS_VISIBLE);
		tg.selectDropdownByValue("ele_xssmlxl698","L");
		tg.selectDropdownByValue("ele_select899","2");
		tg.click("ele_addtocart031", 1);
		tg.wait("ele_checkout551", ComparisonType.IS_VISIBLE);
		tg.click("ele_checkout551", 1);
		tg.testFunction("FCarddetails");
		tg.click("ele_buttonplac996", 1);
		tg.wait("ele_finish813", ComparisonType.IS_VISIBLE);
		tg.click("ele_finish813", 1);
		tg.printLogs(var_webInt);
		tg.printLogs(var_webDouble);
		tg.printLogs(var_webString);
		START_CUSTOM_SCRIPT;
		String uri = "mongodb+srv://yogeshappvolution:tqdlativpwmifhbl@testgrid.cz7ueay.mongodb.net/?retryWrites=true&w=majority&appName=testgrid";
		
		        // Construct a ServerApi instance using the ServerApi.builder() method
		        ServerApi serverApi = ServerApi.builder()
		                .version(ServerApiVersion.V1)
		                .build();
		
		        MongoClientSettings settings = MongoClientSettings.builder()
		                .applyConnectionString(new ConnectionString(uri))
		                .serverApi(serverApi)
		                .build();
		
		        // Create a new client and connect to the server
		        try (MongoClient mongoClient = MongoClients.create(settings)) {
		            MongoDatabase database = mongoClient.getDatabase("admin");
		            try {
		                // Send a ping to confirm a successful connection
		                Bson command = new BsonDocument("ping", new BsonInt64(1));
		                Document commandResult = database.runCommand(command);
		                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
		            } catch (MongoException me) {
		                System.err.println(me);
		            }
		        }
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}