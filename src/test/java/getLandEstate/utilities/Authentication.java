package getLandEstate.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication { //Authentication sınıfı, bir API üzerinden kimlik doğrulama işlemleri için kullanılır.

    public static String generateToken(){ //token uretir. TOKEN? Bir API üzerinde kimlik doğrulama ve erişim kontrolü sağlamak için kullanılan bir belirteçtir.
                                         // API'ye erişmek isteyen uygulamalar veya kullanıcılar, genellikle bir API belirteci sağlayarak kimliklerini doğrularlar ve
                                        //API tarafından belirli işlemler için yetkilendirilirler.

        String payload ="{\n" + //kimlik dogrulama icin kullanilacak veri (payload)
                "  \"password\": \"Techpro123.\",\n" +
                "  \"rememberMe\": true,\n" +
                "  \"username\": \"techproed\"\n" +
                "}";

        Response response = given() //istek olsusturulur.
                .body(payload) //payload eklenir.
                .contentType(ContentType.JSON) //icerik turu json olarak belirlenir.
                .when()
                .post("https://medunna.com/api/authenticate"); //belirtilen url'e post istegi yapilir.

        return response.jsonPath().getString("id_token"); // Yanıtın içinden id_token değeri alınır ve geri döndürülür

    }

}