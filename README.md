
# Plugin Development Tutorial

This site serves as an archive for all of the code introduced and completed in my YouTube tutorial series, "Plugin Development!"

## Table Of Contents
- [Episode 1](https://github.com/SuperSilverStone/plugin-development#episode-1--setting-up-the-basics)
- [Episode 2](https://github.com/SuperSilverStone/plugin-development#episode-2--event-listeners)
- Episode 3 has **NOT** officially released yet! (*However, you can see the code here, ahead of time!*)
## Episode 2 | "Event Listeners!"
In this episode, I walk you through how to create a Event Listener!
This is a crucial step to making your plugins have functionality.
- [My YouTube Video](https://www.youtube.com/watch?v=fI--ImcNAEc&t=321s)
    - [GitHub Code](https://github.com/SuperSilverStone/plugin-development)
- [Spigot Docs](https://hub.spigotmc.org/javadocs/spigot/)
- [Event Instructions ](https://www.spigotmc.org/wiki/using-the-event-api/)
    - I will not be showcasing how to use the "Event Instructions." That is a resource.

However, the code is linked [here](https://github.com/SuperSilverStone/plugin-development/tree/main/episode2) for todays episode.

### [PluginTutorial.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode2/PluginTutorial.java)
This is the main class. 
We will be using the **onEnable()** method today.
To register an event, we first need to create a new .java class.
Then, we can use the code below to register a new event.

To do this, replace the *events()* class with your class. 
(This is the file which you created in the video).
```java
  public void onEnable() {
    Bukkit.getPluginManager().registerEvents(new events(), this);
  }
```
*Remember to click the title of the class to see the complete code as this is **NOT** the complete code.*

### [events.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode2/events.java)
This is a class in which we will create our *listener*.
Our listener is how we will listen for things that happen in the game.

Below is an example of one of the events that we go over in the YouTube video.
*OnBlockBreak* is the name that we give the event.
To get information when a block is broken, we use the event named *BlockBreakEvent*, in which
we will get it from using the name, *event*.

If the player associated with the event (BlockBreakEvent) is not null (!=), then we
will assign the player to a variable, *player*, and then send the player a message.
```java
    @EventHandler
    public void OnBlockBreak(BlockBreakEvent event) {
        if (event.getPlayer() != null) { 
            // "null" means non-existent.
            // It doesn't refer to any object or array.

            Player player = event.getPlayer();

            player.sendMessage("Block Broken!");
        }
    }
```
*Remember to click the title of the class to see the complete code as this is **NOT** the complete code.*
## Episode 2 | "Event Listeners!"
In this episode, I walk you through how to create a Event Listener!
This is a crucial step to making your plugins have functionality.
- [My YouTube Video](https://www.youtube.com/watch?v=fI--ImcNAEc&t=321s)
    - [GitHub Code](https://github.com/SuperSilverStone/plugin-development)
- [Spigot Docs](https://hub.spigotmc.org/javadocs/spigot/)
- [Event Instructions ](https://www.spigotmc.org/wiki/using-the-event-api/)
    - I will not be showcasing how to use the "Event Instructions." That is a resource.

However, the code is linked [here](https://github.com/SuperSilverStone/plugin-development/tree/main/episode2) for todays episode.

### [PluginTutorial.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode2/PluginTutorial.java)
This is the main class. 
We will be using the **onEnable()** method today.
To register an event, we first need to create a new .java class.
Then, we can use the code below to register a new event.

To do this, replace the *events()* class with your class. 
(This is the file which you created in the video).
```java
  public void onEnable() {
    Bukkit.getPluginManager().registerEvents(new events(), this);
  }
```
*Remember to click the title of the class to see the complete code as this is **NOT** the complete code.*

### [events.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode2/events.java)
This is a class in which we will create our *listener*.
Our listener is how we will listen for things that happen in the game.

Below is an example of one of the events that we go over in the YouTube video.
*OnBlockBreak* is the name that we give the event.
To get information when a block is broken, we use the event named *BlockBreakEvent*, in which
we will get it from using the name, *event*.

If the player associated with the event (BlockBreakEvent) is not null (!=), then we
will assign the player to a variable, *player*, and then send the player a message.
```java
    @EventHandler
    public void OnBlockBreak(BlockBreakEvent event) {
        if (event.getPlayer() != null) { 
            // "null" means non-existent.
            // It doesn't refer to any object or array.

            Player player = event.getPlayer();

            player.sendMessage("Block Broken!");
        }
    }
```
*Remember to click the title of the class to see the complete code as this is **NOT** the complete code.*
## Episode 3 | "Join Message Plugin!"
In this episode, we walk through how to create our own plugin that changes the players
join and leave messages!
- [My YouTube Video](http://notpostedyet.com/)
    - [GitHub Code](https://github.com/SuperSilverStone/plugin-development)
- [Spigot Docs](https://hub.spigotmc.org/javadocs/spigot/)
- [Event Instructions ](https://www.spigotmc.org/wiki/using-the-event-api/)
    - I will not be showcasing how to use the "Event Instructions." That is a resource.

However, the code is linked [here](https://github.com/SuperSilverStone/plugin-development/tree/main/episode3) for todays episode.

### [PluginTutorial.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode3/PluginTutorial.java)
This is the main class. 
We will be using the **onEnable()** method today.
To register an event, we first need to create a new .java class.
Then, we can use the code below to register a new event.

To do this, replace the *events()* class with your class. 
(This is the file which you created in the video).
```java
    public void onEnable() {
        // If you followed the previous episode, you will have MULTIPLE
        // different lines of code in here!
        Bukkit.getPluginManager().registerEvents(new playerListener(), this);
    }
```
*Remember to click the title of the class to see the complete code as this is **NOT** the complete code.*

### [playerListener.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode3/playerListener.java)
This is a class in which we will create our *listener*.

Below is an example of one of the events that we go over in the YouTube video.
*OnPlayerJoin* is the name of our listener, and *PlayerJoinEvent* is the name of our event.
To get data from it, we can call it *event*!

If the player associated with the event (PlayerJoinEvent) is not null (!=), then we
will assign the player to a variable, *player*, and then set the join message of 
the player to whatever we would like. In the example below, we are using **ChatColor** 
to select the color of our chat. You do **NOT** have to use it for your code to work.
```java
    @EventHandler
    @Deprecated
    public void OnPlayerJoin(PlayerJoinEvent event) {
        if (event.getPlayer() != null) {
            Player player = event.getPlayer();
            // Below, we use ChatColor! You can remove "Chatcolor.YELLOW + "
            // if you would like. You do NOT have to use it yet!
            event.setJoinMessage(ChatColor.YELLOW + "Herobrine joined the game");
        }
    }
```
If you would like to use the ChatColor, you do have to add one line to the top of your code.
```java
import org.bukkit.ChatColor;
```
*It will already be at the top of your code if you access it from my playerListener.java!*

*Remember to click the title of the class to see the complete code as this is **NOT** the complete code.*
