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

@Listeners(TestListener.class)
public class imprtexprt {

    public static Double var_webDouble = 10.1;

    public static String var_webString = "sttringgggggenergyyy";

    public static int var_webInt = 10;

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
        tg.selectDropdownByValue("ele_xssmlxl698", "L");
        tg.selectDropdownByValue("ele_select899", "2");
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
        tg.customScriptStart();
        String uri = "mongodb+srv://yogeshappvolution:tqdlativpwmifhbl@testgrid.cz7ueay.mongodb.net/?retryWrites=true&w=majority&appName=testgrid";
        // Construct a ServerApi instance using the ServerApi.builder() method
        ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();
        MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(new ConnectionString(uri)).serverApi(serverApi).build();
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
        tg.customScriptEnd();
        tg.close();
    }

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
        tg.selectDropdownByValue("ele_select872", "2026");
    }
}
