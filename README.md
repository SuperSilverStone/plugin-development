
# Plugin Development Tutorial

This site serves as an archive for all of the code introduced and completed in my YouTube tutorial series, "Plugin Development!"
## Table Of Contents
- [Important Info](https://github.com/SuperSilverStone/plugin-development/blob/main/README.md#important-info)
- [Episode 1](https://github.com/SuperSilverStone/plugin-development#episode-1--setting-up-the-basics)
- [Episode 2](https://github.com/SuperSilverStone/plugin-development#episode-2--event-listeners)
- [Episode 3](https://github.com/SuperSilverStone/plugin-development/blob/main/README.md#episode-3--join-message-plugin)
- Episode 4 has **NOT** officially released yet! (*However, you can see the code here, ahead of time!*)
## Important Info

You will notice the `//text` at the top of the page. These are *comments*.
You can remove the entire line that they are on, and are helpful
reminders that I have added throughout the code.

```java
// This text will be in every file!
// They don't hurt your code at all,
// And provide helpful tips from me!

// You can remove them by just removing the line, if you want!
```
## Episode 1 | "Setting Up The Basics!"
In this episode, I walk you through how to setup your plugin workspace!
- [Intellij](https://www.jetbrains.com/idea/download/)
- [GetBukkit](https://getbukkit.org/download/spigot)
- [Installation Guide](https://www.spigotmc.org/wiki/spigot-installation/)
- [Not Needed](https://www.spigotmc.org/wiki/buildtools/)
    - I will not be showcasing how to use the "Event Instructions." That is a resource.

However, the code is linked [here](https://github.com/SuperSilverStone/plugin-development/tree/main/episode1) for todays episode.

### [PluginTutorial.java](https://github.com/SuperSilverStone/plugin-development/blob/main/PluginTutorial.java)
This is the main class. 
Below are some snippets of the code for todays episode.

First, you will see this:
```java
package me.supersilverstone.plugintutorial;
```
This will be apart of your code, however, it will be for yours. It will say it, according
to how you set up your project. You will replace this in every file with its file location
in your own project.

Following that, the following code will look like this. At the top of every file is an **import** section.
This section will be for importing different libraries into our project. Sometimes you will use 5,
and sometimes you will use 200.
```java
import org.bukkit.plugin.java.JavaPlugin;
```

Finally, below we have our main class. In the class "PluginTutorial", we have two methods.
The **onEnable()** and the **onDisable()** method. We will be using these a bunch every
episode, and will add more code to it every time. `onEnable()` is used for the plugin
startup logic, while `onDisable()` is used for the shutdown logic.
```java
public final class PluginTutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
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

### [PluginTutorial.java](https://github.com/SuperSilverStone/plugin-development/blob/main/PluginTutorial.java)
This is the main class. 
We will be using the **onEnable()** method today.
To register an event, we first need to create a new .java class.
Then, we can use the code below to register a new event.

To do this, replace the `new events()` class with your class. 
(This is the file which you created in the video, like `new myClass()`).
```java
  public void onEnable() {
    // Episode 2
    Bukkit.getPluginManager().registerEvents(new events(), this);
  }
```
*Remember to click the title of the class to see the complete code as this is **NOT** the complete code.*

### [events.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode2/events.java)
This is a class in which we will create our *listener*.
Our listener is how we will listen for things that happen in the game.

Below is an example of one of the events that we go over in the YouTube video.
*OnBlockBreak* is the name that we give the event.
To get information when a block is broken, we use the event named `BlockBreakEvent`, in which
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

### [PluginTutorial.java](https://github.com/SuperSilverStone/plugin-development/blob/main/PluginTutorial.java)
This is the main class. 
We will be using the **onEnable()** method today.
To register an event, we first need to create a new .java class.
Then, we can use the code below to register a new event.

To do this, replace the `events()` class with your class. 
(This is the file which you created in the video).
```java
    public void onEnable() {
        // If you followed the previous episode, you will have MULTIPLE
        // different lines of code in here!

        // Episode 3
        Bukkit.getPluginManager().registerEvents(new playerListener(), this);
    }
```
*Remember to click the title of the class to see the complete code as this is **NOT** the complete code.*

### [playerListener.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode3/playerListener.java)
This is a class in which we will create our *listener*.

Below is an example of one of the events that we go over in the YouTube video.
*OnPlayerJoin* is the name of our listener, and `PlayerJoinEvent` is the name of our event.
To get data from it, we can call it *event*!

If the player associated with the event (PlayerJoinEvent) is not null (!=), then we
will assign the player to a variable, *player*, and then set the join message of 
the player to whatever we would like. In the example below, we are using `ChatColor` 
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
## Episode 4 | "Feed Command!"
In this episode, we walk through how to create our own plugin that feeds the player!
- [My YouTube Video](http://notpostedyet.com/)
    - [GitHub Code](https://github.com/SuperSilverStone/plugin-development)
- [Spigot Docs](https://hub.spigotmc.org/javadocs/spigot/)
- [Command Instructions ](https://www.spigotmc.org/wiki/create-a-simple-command/)
    - I will not be showcasing how to use the "Command Instructions." That is a resource.

However, the code is linked [here](https://github.com/SuperSilverStone/plugin-development/tree/main/episode4) for todays episode.

### [PluginTutorial.java](https://github.com/SuperSilverStone/plugin-development/blob/main/PluginTutorial.java)
This is the main class. 
We will be using the **onEnable()** method today.
To add a command, we have to do something different then what we did for the Event Listeners.

First, where it says `getCommand("insertHere")`, we are going to add our command name. What do you want to type? For example, if I wanted to use the command **/hunger**, than I would put `getCommand("hunger")`.

Next, we add `.setExecutor(new insertHere());`. Where we have *insertHere*, you are going to put the name of your class file where you are going to add all of your code. In this case, my file is called "feed," so we put `.setExecutor(new feed());`.
```java
    public void onEnable() {
        // If you followed the previous episode, you will have MULTIPLE
        // different lines of code in here!

        // Episode 4
        getCommand("feed").setExecutor(new feed());
    }
```
*Remember to click the title of the class to see the complete code as this is **NOT** the complete code.*

### [feed.java](https://github.com/SuperSilverStone/plugin-development/tree/main/episode4/feed.java)
This is a class in which we will create our *Command Executor*.

At the begining of our code, we have our package and our set of imports. For our public class, we will be implementing **CommandExecutor** instead of **Listener**.

```java
package me.supersilverstone.plugintutorial.episode4;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class feed implements CommandExecutor {
    // Code Here
}
```
Inside of our *feed* class, we will add our **onCommand**. If you implemented your methods, this will pop up automatically. If not, this is the code you can copy and paste.

```java
public class feed implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, 
    @NotNull String label, @NotNull String[] args) {
        return false;
    }
}
```
However, we have to add some code onto the inside of our **onCommand** method. IF the command is what we have registered, and the sender of the command is a player (this prevents console from sending the command, as console doesn't have a hunger) then we want to set the food level to 20 (or max).

```java
public class feed implements CommandExecutor {
    // @Override is requiered here, and it will not work otherwise!
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command,  
    @NotNull String label, @NotNull String[] args) {
        // The actual guts of your command go here!
        if (command.getName().equalsIgnoreCase("feed")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.setFoodLevel(20);
            }
        }
        // Remember to mark this as *TRUE* so the command will run.
        return true;
    }
}
```

### [plugin.yml](https://github.com/SuperSilverStone/plugin-development/blob/main/episode4/plugin.yml)
This is the **plugin.yml**. You will learn where this is located in the YouTube video, but it is important to use it. Under the *resources* section, it should have been created automatically. If not, create it with the name `plugin.yml`.

Below, we have the basic `plugin.yml`. This is automatically created with your plugin, but now we have to add to it. (Yours will look different from mine, depending on the name, version, etc). 

```yml
name: PluginTutorial
version: '${project.version}'
main: me.supersilverstone.plugintutorial.PluginTutorial
api-version: 1.19
```
Now, we have to add some more lines to it. First, add a `command:` line. Then, go down a line and name your command. In this case, mine is named *feed*. Add a description ona  line below that, and then a usage, explaining how to use the command.

```yml
name: PluginTutorial
version: '${project.version}'
main: me.supersilverstone.plugintutorial.PluginTutorial
api-version: 1.19
commands:
  feed:
    description: Feed yourself all of the way!
    usage: /<command>
```
It is incredibly important that you refer back to the plugin.yml, as this is where all of your crucial loading information is located!

*Remember to click the title of the class to see the complete code as this is **NOT** the complete code.*
