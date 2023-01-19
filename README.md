# Plugin Development Tutorial

This site serves as an archive for all of the code introduced and completed in my YouTube tutorial series, "Plugin Development!"

## Episode 1
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
