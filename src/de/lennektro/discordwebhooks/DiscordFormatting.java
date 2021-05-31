package de.lennektro.discordwebhooks;

public class DiscordFormatting {

	public static String BOLD(String str) {
		return "**" + str + "**";
	}
	
	public static String ITALIC(String str) {
		return "*" + str + "*";
	}
	
	public static String BOLDITALIC(String str) {
		return "***" + str + "***";
	}
	
	public static String UNDERLINE(String str) {
		return "__" + str + "__";
	}
	
	public static String STRIKETHROUGH(String str) {
		return "~~" + str + "~~";
	}
	
	public static String HYPERLINK(String str, String url) {
		return "[" + str + "](" + url + ")";
	}
}
