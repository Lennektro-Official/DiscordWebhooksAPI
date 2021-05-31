package de.lennektro.discordwebhooks;

public class DiscordMessage {

	private String jsonObject = "";
	
	private DiscordEmbed embed1 = null;
	private DiscordEmbed embed2 = null;
	private DiscordEmbed embed3 = null;
	private DiscordEmbed embed4 = null;
	private DiscordEmbed embed5 = null;
	private DiscordEmbed embed6 = null;
	private DiscordEmbed embed7 = null;
	private DiscordEmbed embed8 = null;
	private DiscordEmbed embed9 = null;
	private DiscordEmbed embed10 = null;
	
	public void setContent(String content) {
		jsonObject = "{\"content\": \"" + content + "\"}";
	}
	
	public void addEmbed(DiscordEmbed embed) {
		if(embed1 == null) {
			embed1 = embed;
		} else if(embed2 == null) {
			embed2 = embed;
		} else if(embed3 == null) {
			embed3 = embed;
		} else if(embed4 == null) {
			embed4 = embed;
		} else if(embed5 == null) {
			embed5 = embed;
		} else if(embed6 == null) {
			embed6 = embed;
		} else if(embed7 == null) {
			embed7 = embed;
		} else if(embed8 == null) {
			embed8 = embed;
		} else if(embed9 == null) {
			embed9 = embed;
		} else if(embed10 == null) {
			embed10 = embed;
		} else {
			System.out.println("Message cannot have more than 10 Embeds!");
		}
		jsonObject = "{\"embeds\": [";
		if(embed1 != null) jsonObject = jsonObject + embed1.getJsonObject() + ",";
		if(embed2 != null) jsonObject = jsonObject + embed2.getJsonObject() + ",";
		if(embed3 != null) jsonObject = jsonObject + embed3.getJsonObject() + ",";
		if(embed4 != null) jsonObject = jsonObject + embed4.getJsonObject() + ",";
		if(embed5 != null) jsonObject = jsonObject + embed5.getJsonObject() + ",";
		if(embed6 != null) jsonObject = jsonObject + embed6.getJsonObject() + ",";
		if(embed7 != null) jsonObject = jsonObject + embed7.getJsonObject() + ",";
		if(embed8 != null) jsonObject = jsonObject + embed8.getJsonObject() + ",";
		if(embed9 != null) jsonObject = jsonObject + embed9.getJsonObject() + ",";
		if(embed10 != null) jsonObject = jsonObject + embed10.getJsonObject() + ",";
		jsonObject = jsonObject.substring(0, jsonObject.length() - 1);
		jsonObject = jsonObject + "]}";
	}
	
	public String getJsonObject() {
		return jsonObject;
	}
}
