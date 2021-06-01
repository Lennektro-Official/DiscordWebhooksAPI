# DiscordWebhooksAPI

## Overview
This is a little lightweight API for Java that allows you to communicate with Webhooks on Discord.
>More about Webhooks: https://support.discord.com/hc/en-us/articles/228383668-Intro-to-Webhooks

## Documentation
### Introduction
You can acces a Webhook with the following code:
```java
DiscordWebhook webhook = new DiscordWebhook(your_url);
```
Now we need to create a message:
```java
DiscordMessage msg = new DiscordMessage();
```
For now we just want to create a simple text message, so we do the following:
```java
msg.setContent(your_message);
```
And then we just have to send the message:
```java
webhook.sendMessage(msg);
```

Here is the whole code:
```java
DiscordWebhook webhook = new DiscordWebhook(your_url);

DiscordMessage msg = new DiscordMessage();
msg.setContent(your_message);

webhook.sendMessage(msg);
```

### Embeds
You can add up to 10 Embeds to a message.
You can add an Embed to a message using:
```java
message.addEmbed(your_embed);
```
But first, we need to create an Embed using:
```java
DiscordEmbed embed = new DiscordEmbed();
```
Now we need to define the properties of our Embed. The most basic ones
are title, description and color:
```java
embed.setTitle(your_title); //your title as string without line breaks
embed.setDescription(your_description) //your description as string without line breaks
embed.setColor(your_color) //your color as decimal value
```
Basic Embed:  
![image](https://user-images.githubusercontent.com/85063182/120365233-76802480-c30e-11eb-9116-7dc0dc668e62.png)
>I recommend this site for color picking: https://www.spycolor.com/  
  
*>More comming soon<*

### Formattings
You can formatt Strings in messages and embeds with this:
```java
DiscordFormatting.BOLD(your_string); //bold
DiscordFormatting.ITALIC(your_string); //italic
DiscordFormatting.BOLDITALIC(your_string); //bold and italic
DiscordFormatting.UNDERLINED(your_string); //underlined
DiscordFormatting.STRIKETHROUGH(your_string); //strikethrough
DiscordFormatting.HYPERLINK(your_string, your_url); //hyperlink (url as string)
```
Here's an example:
```java
String text = "This is " + DiscordFormatting.BOLD("bold") + " and this is " 
  + DiscordFormatting.ITALIC("italic") + " and this is both: "
  + DiscordFormatting.BOLDITALIC("bold and italic") + ".";
```
This will look something like this:  
- This is **bold** and this is *italic* and this is both: ***bold and italic***.
