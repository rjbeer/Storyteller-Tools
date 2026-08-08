# Storyteller-Tools

CLI tools designed with Story Tellers and Dungeon Masters in mind. These tools are a collection of everyday tools that a Dungeon Master might use including turn order tracker, dice roller, creature cards, and so on.

## Current State of the Project

At present there is some basic functionality with the tools including a random number generator acting as a rudimentry dice roller, a functional turn order tracker, and a functional though limited directory setup. There are currently plans to improve all the current features as they are all functional but incomplete.

## Installing the Tools

To install the tools make sure that you have Java 21 or later installed on your computer. From there fork your own copy of Storyteller Tools and download the files with Git

```git clone <your_repository_link>```

Once your project has been cloned navigate to the project directory on your device and compile and run the program.

```javac -sourcepath src -d target src/main/java/rb/storytellertools/tools/*.java```

once compiled move into the target folder and run the program

```cd target```

```java rb.storytellertools.tools.StTools```

## Contributing

Contributions are very welcome! Make sure to read the documentation for [contributing](CONTRIBUTING.md) before submiting any contributions as well as the [code of conduct](CODE_OF_CONDUCT.MD).
