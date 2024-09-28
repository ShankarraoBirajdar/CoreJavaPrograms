package Http2Client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Paths;
import java.time.Duration;



public class App {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
		get();
		post();

	}
	
	public static HttpRequest post() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
			      .uri(URI.create("https://reqres.in/api/users"))
			      .timeout(Duration.ofMinutes(1))
			      .header("Content-Type", "application/json")
//			      .POST(BodyPublishers.ofFile(Paths.get("file.json")))
			      .POST(BodyPublishers.ofString("{\r\n"
			      		+ "    \"name\": \"morpheus\",\r\n"
			      		+ "    \"job\": \"leader\"\r\n"
			      		+ "}"))
			      .build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.statusCode());
		System.out.println("Response body: " + response.body());
		return request;
	}
	
	public static void get() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		    .uri(URI.create("https://reqres.in/api/users/2"))
		    .header("Accept", "application/json")
		    .GET()
		    .build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.statusCode());
		System.out.println("Response body: " + response.body());
		
		
//		HttpClient client= HttpClient.newHttpClient();
//		Builder  builder = HttpRequest.newBuilder(new URI("https://api.github.com/users/ShankarraoBirajdar"));
//		builder.version(Version.HTTP_2);
//		builder.GET();
//		HttpRequest request = builder.build();
//		HttpRequest request =  HttpRequest.newBuilder(new URI("https://api.github.com/users/ShankarraoBirajdar")).GET().build();
//		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
	}

}
