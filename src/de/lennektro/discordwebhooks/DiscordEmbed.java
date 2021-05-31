package de.lennektro.discordwebhooks;

import java.util.ArrayList;
import java.util.List;

public class DiscordEmbed {

	private String title = "";
	private String description = "";
	private String color = "";
	private String author = "";
	private String author_url = "";
	private String author_icon_url = "";
	private String url = "";
	private List<DiscordEmbedField> fields = new ArrayList<>();
	private String image_url = "";
	private String thumbnail_url = "";
	private String footer = "";
	private String footer_icon_url = "";
	
	
	public String getJsonObject() {
		String jsonObject = "{";
		if(!this.title.equals("")) jsonObject = jsonObject + "\"title\": \"" + this.title + "\",";
		if(!this.description.equals("")) jsonObject = jsonObject + "\"description\": \"" + this.description + "\",";
		if(!this.color.equals("")) jsonObject = jsonObject + "\"color\": \"" + this.color + "\",";
		if(!this.url.equals("")) jsonObject = jsonObject + "\"url\": \"" + this.url + "\",";
		if(!this.author.equals("")) {
			String authorJsonObject = "{";
			if(!this.author.equals("")) authorJsonObject = authorJsonObject + "\"name\": \"" + this.author + "\",";
			if(!this.author_url.equals("")) authorJsonObject = authorJsonObject + "\"url\": \"" + this.author_url + "\",";
			if(!this.author_icon_url.equals("")) authorJsonObject = authorJsonObject + "\"icon_url\": \"" + this.author_icon_url + "\",";
			authorJsonObject = authorJsonObject.substring(0, authorJsonObject.length() - 1);
			authorJsonObject = authorJsonObject + "}";
			jsonObject = jsonObject + "\"author\":" + authorJsonObject + ",";
		}
		if(!this.image_url.equals("")) jsonObject = jsonObject + "\"image\": {\"url\":\"" + image_url + "\"},";
		if(!this.thumbnail_url.equals("")) jsonObject = jsonObject + "\"thumbnail\": {\"url\":\"" + thumbnail_url + "\"},";
		if(!this.footer.equals("")) {
			String footerJsonObject = "{";
			if(!this.footer.equals("")) footerJsonObject = footerJsonObject + "\"text\": \"" + this.footer + "\",";
			if(!this.footer_icon_url.equals("")) footerJsonObject = footerJsonObject + "\"icon_url\": \"" + this.footer_icon_url + "\",";
			footerJsonObject = footerJsonObject.substring(0, footerJsonObject.length() - 1);
			footerJsonObject = footerJsonObject + "}";
			jsonObject = jsonObject + "\"footer\":" + footerJsonObject + ",";
		}
		if(this.fields.size() > 0) {
			String fieldsJsonObject = "[";
			for(DiscordEmbedField field : this.fields) {
				fieldsJsonObject = fieldsJsonObject + field.getJsonObject() + ",";
			}
			fieldsJsonObject = fieldsJsonObject.substring(0, fieldsJsonObject.length() - 1);
			fieldsJsonObject = fieldsJsonObject + "]";
			jsonObject = jsonObject + "\"fields\":" + fieldsJsonObject + ",";
		}
		jsonObject = jsonObject.substring(0, jsonObject.length() - 1);
		jsonObject = jsonObject + "}";
		return jsonObject;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthorUrl() {
		return author_url;
	}
	
	public void setAuthorUrl(String author_url) {
		this.author_url = author_url;
	}
	
	public String getAuthorIconUrl() {
		return author_icon_url;
	}
	
	public void setAuthorIconUrl(String author_icon_url) {
		this.author_icon_url = author_icon_url;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public List<DiscordEmbedField> getFields() {
		return fields;
	}
	
	public void addField(DiscordEmbedField field) {
		this.fields.add(field);
	}
	
	public String getImageUrl() {
		return image_url;
	}
	
	public void setImageUrl(String image_url) {
		this.image_url = image_url;
	}
	
	public String getThumbnailUrl() {
		return thumbnail_url;
	}
	
	public void setThumbnailUrl(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}
	
	public String getFooter() {
		return footer;
	}
	
	public void setFooter(String footer) {
		this.footer = footer;
	}
	
	public String getFooterIconUrl() {
		return footer_icon_url;
	}
	
	public void setFooterIconUrl(String footer_icon_url) {
		this.footer_icon_url = footer_icon_url;
	}
	
}
