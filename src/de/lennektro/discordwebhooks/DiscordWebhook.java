package de.lennektro.discordwebhooks;

import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class DiscordWebhook {

	private URL url;
	
	public DiscordWebhook(String url) {
		try {
			this.url = new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public void sendMessage(DiscordMessage message) {
		try {
			String jsonObject = message.getJsonObject();
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.addRequestProperty("Content-Type", "application/json");
			connection.addRequestProperty("User-Agent", "Java-DiscordWebhook");
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			
			OutputStream stream = connection.getOutputStream();
			stream.write(jsonObject.getBytes());
			stream.flush();
			stream.close();
			
			connection.getInputStream().close();
			connection.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
