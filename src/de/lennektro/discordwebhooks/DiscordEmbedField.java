package de.lennektro.discordwebhooks;

public class DiscordEmbedField {

	private String name = "";
	private String value = "";
	private boolean inline = false;
	
	
	public String getJsonObject() {
		String jsonObject = "{";
		if(!this.name.equals("")) jsonObject = jsonObject + "\"name\": \"" + this.name + "\",";
		if(!this.value.equals("")) jsonObject = jsonObject + "\"value\": \"" + this.value + "\",";
		if(this.inline) jsonObject = jsonObject + "\"inline\": true,";
		jsonObject = jsonObject.substring(0, jsonObject.length() - 1);
		jsonObject = jsonObject + "}";
		return jsonObject;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public boolean isInline() {
		return inline;
	}
	
	public void setInline(boolean inline) {
		this.inline = inline;
	}
}
