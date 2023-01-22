
# Plugin Development Tutorial

This site serves as an archive for all of the code introduced and completed in my YouTube tutorial series, "Plugin Development!"

## Episode 1 | "Setting Up The Basics!"
In this episode, I go through the basics of setting up 'IntelliJ', and how to setup a Plugin testing server.
 - [IntelliJ](https://www.jetbrains.com/idea/download/)
 - [GetBukkit](https://getbukkit.org/download/spigot)
 - [Installation Guide](https://www.spigotmc.org/wiki/spigot-installation/)
 - [{Not Needed} Build Tools](https://www.spigotmc.org/wiki/buildtools/)
I will NOT be reviewing how to install 'IntelliJ' or the Plugin Testing server, as that is gone over in the video posted.

However, the code is linked [here](https://github.com/SuperSilverStone/plugin-development/tree/main/episode1) for todays episode.

### [PluginTutorial.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode1)
This is the main class. It has an **onEnable()** and an **onDisable()** method. You will constantly refer back to this class.
This class will be used a lot more in later classes to register events, commands, and more.

```java
  public void onEnable() {
    // Plugin startup logic
  }
```
```java
  public void onDisable() {
    // Plugin shutdown logic
  }
```
Remember to click the title of the class to see the complete code as this is **NOT** the complete code.
## Episode 2 | "Event Listeners!"
In this episode, I walk you through how to create a Event Listener!
This is a crucial step to making your plugins have functionality.
- [My YouTube Video](http://notpostedyet.com/)
    - [GitHub Code](https://github.com/SuperSilverStone/plugin-development)
- [Spigot Docs](https://hub.spigotmc.org/javadocs/spigot/)
- [Event Instructions](https://www.spigotmc.org/wiki/using-the-event-api/)
I will NOT be reviewing how to install 'IntelliJ' or the Plugin Testing server, as that is gone over in the video posted.

However, the code is linked [here](https://github.com/SuperSilverStone/plugin-development/tree/main/episode2) for todays episode.

### [PluginTutorial.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode2)
This is the main class. 
We will be using the **onEnable()** method today.
To register an event, we first need to create a new .java class.
Then, we can use the code below to register a new event.

To do this, replace the *events()* class with your class. (This is the file which you created in the video.)
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
