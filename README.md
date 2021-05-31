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
