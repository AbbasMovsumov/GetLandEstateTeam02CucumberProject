package getLandEstate.hooks;


import getLandEstate.utilities.Driver;
import io.cucumber.java.After;

public class Hook {

   // Hooks sınıfı, Cucumber test senaryolarının öncesinde ve
    // sonrasında çalışacak kod bloklarını tanımlar

    /*@Before("@api")
    public void setUp() throws Exception {
        spec =  new RequestSpecBuilder() >>>RequestSpecBuilder: spec isimli bir RequestSpecification nesnesi oluşturur. Bu nesne, API isteklerinin temel yapılandırmasını içerir.
                .setBaseUrl("https://medunna.com") >>İsteklerin gönderileceği temel URL'yi belirler.
                .setContentType(ContentType.JSON) >>İsteklerin JSON formatında olacağını belirtir.
                .addHeader("Authorization", "Bearer "+Authentication.generateToken()) >>İsteklere Authorization başlığı ekler. Bu başlık, Authentication.generateToken() metodu ile üretilen bir token'ı içerir.
                .build(); >>Yapılandırmayı tamamlar ve spec değişkenine atar.
    }*/


    /*@After
    public void tearDown(Scenario scenario) throws Exception {

        if (scenario.isFailed()) { >> senaryonun başarısız olup olmadığını kontrol eder. basarisizsa ekran g. alip rapora ekler.
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
            Driver.closeDriver();
        }
    }*/

    @After
    public void tearDown() throws Exception {
        Driver.closeDriver();

    }

}