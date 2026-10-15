creatingminecraftpluginfromscratch

A learning project for building a Minecraft plugin from scratch, written entirely by hand without AI assistance, following the official PaperMC documentation.

About

This repository is a personal learning exercise. The goal is to understand how Minecraft plugins work internally, from project setup to event handling and command registration, by reading the docs and figuring things out manually.

The code is written from scratch with zero AI involvement. It is not meant for production use.

Project Status

Version: dev+Alpha+1.0.0

This is an early alpha build. The project is in the very beginning stages. The current source code is a minimal skeleton and may contain incomplete or non-compiling code.

Requirements

· JDK 25 (set via Gradle toolchain)
· Gradle (wrapper included)
· PaperMC server running Minecraft 26.3 for testing

Building

To build the plugin, run:

```bash
./gradlew build
```

The compiled jar will be located in build/libs/.

The build uses the PaperMC repository and targets io.papermc.paper:paper-api:26.3.build.+.

Running

1. Build the plugin using the command above.
2. Copy the generated .jar file into your server's plugins/ folder.
3. Start or restart the server.

Project Structure

```
.
├── gradle/
├── src/main/java/com/kaito/pluginfromscratch/
│   └── ScracthPlugin.java
├── .gitattributes
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── LICENSE
└── SECURITY.md
```

Main Class

The plugin entry point is ScracthPlugin.java (note: the filename appears to have a typo). It currently extends JavaPlugin and includes a basic onEnable method and an event handler for PlayerJoinEvent. The code is not yet functional and contains syntax errors that need to be resolved.

License

This project is licensed under the GNU General Public License v3.0. See the LICENSE file for details.

Security

A SECURITY.md file exists but is currently a template. Supported versions and reporting instructions have not been filled in yet.

References

· PaperMC Documentation
· PaperMC GitHub

---

This README was written based on the current state of the repository. It will be updated as the project progresses.
