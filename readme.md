# A java starter with VSCode

We will set up the java environment in VSCode from scratch

## Download the JDK

This is the basic toolkit, with all the base libriries and runtime.
We will use [AdoptOpenJDK](https://adoptopenjdk.net/) and use the latest version, so we can test [it](https://github.com/AdoptOpenJDK/openjdk14-binaries/releases/download/jdk-14.0.2%2B12/OpenJDK14U-jdk_x64_windows_hotspot_14.0.2_12.msi)

## Download Gradle, the build tool

We have the compiler, but we will need something more to build an application. With JDK we have the 
briks, we now need all the machines and the concrete to build the house. Gradle is the
de facto standard tool for Java builds. Download it [here](https://gradle.org/next-steps/?version=6.6.1&format=bin)
and install it [adding it to your path](https://gradle.org/install/).

## Setup VSCode with the right plugins

We of course need to grab [VSCode](https://code.visualstudio.com/) and some of the addons

- ```naco-siren.gradle-language``` : support for gradle
- ```ms-vsliveshare.vsliveshare``` : allows for sharing the session remotely
- ```ms-vsliveshare.vsliveshare``` : allows for sharing the session remotely
- ```redhat.java``` : java tools for VSCode (basically the java ide)
- ```richardwillis.vscode-gradle``` : Gradle tasks UI
- ```vscjava.vscode-java-debug``` : Java debugger 
- ```vscjava.vscode-java-dependency``` : Dependency for the debugger
- ```vscjava.vscode-java-test``` :  Test runner for java in VSCode

```powershell

code --install-extension naco-siren.gradle-language
code --install-extension ms-vsliveshare.vsliveshare
code --install-extension ms-vsliveshare.vsliveshare
code --install-extension redhat.java
code --install-extension richardwillis.vscode-gradle
code --install-extension vscjava.vscode-java-debug
code --install-extension vscjava.vscode-java-dependency
code --install-extension vscjava.vscode-java-test
```
