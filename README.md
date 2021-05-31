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
And the we just have to send the message:
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
> *Comming soon*

### Formattings
You can formatt Strings in messages with this:
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
