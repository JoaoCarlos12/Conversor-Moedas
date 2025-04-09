
package api;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.json.JSONObject;
import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author João Carlos
 */
public class ConversorAPI {
    
    private static final String API_KEY = System.getenv("API_KEY");
    private static final String URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/BRL";
    
    
  //Metodo para buscar taxa de cambio das moedas
    public static JSONObject buscarTaxasCambio() throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        if(response.statusCode() == HttpURLConnection.HTTP_OK) {
            JSONObject jsonResponse = new JSONObject(response.body());
            return jsonResponse.getJSONObject("conversion_rates");
        }else{
            System.err.println("Erro na API: Código" + response.statusCode());
            return null;
        }
    }
}
