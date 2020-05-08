package com.example.java11Module;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.time.Duration;

@Preamble(author = "Balu Ambati", date = "01/05/2020", currentRevision = 6)
public class HttpClientSyncExample {

	public static void main(String a[]) {
		HttpClient httpClient = HttpClient.newBuilder().version(Version.HTTP_2).connectTimeout(Duration.ofSeconds(10))
				.build();
		HttpResponse<String> response;
		try {
			String urlEndpoint = "http://www.google.com";
			URI uri = URI.create(urlEndpoint);
			HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build(); //GET Request
			//POST Request
			BodyPublisher requestBody = BodyPublishers.ofString("{ request body }");
			HttpRequest postRequest = HttpRequest.newBuilder().POST(requestBody).uri(URI.create("http://codefx.org"))
					.build();
			response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			throw new RuntimeException(e);
		}

		System.out.println("Status code: " + response.statusCode());
		System.out.println("Headers: " + response.headers().allValues("content-type"));
		System.out.println("Body: " + response.body());
	}

}
