# A java starter with VSCode

We will set up the java environment in VSCode from scratch

## Download the JDK

This is the basic toolkit, with all the base libriries and runtime.
We will use [AdoptOpenJDK](https://adoptopenjdk.net/) and use the latest version, so we can test [it](https://github.com/AdoptOpenJDK/openjdk14-binaries/releases/download/jdk-14.0.2%2B12/OpenJDK14U-jdk_x64_windows_hotspot_14.0.2_12.msi)

## Setup VSCode with the right plugins

We of course need to grab [VSCode](https://code.visualstudio.com/) and some of the addons.

We are going to install the full java extension pack pack by

```powershell
code --install-extension  vscjava.vscode-java-pack
```
and add support for liveshare and gradle by
```powershell
code --install-extension ms-vsliveshare.vsliveshare
code --install-extension  richardwillis.vscode-gradle
```

This is what the vaious plugin do

- ```naco-siren.gradle-language``` : support for gradle
- ```ms-vsliveshare.vsliveshare``` : allows for sharing the session remotely
- ```redhat.java``` : java tools for VSCode (basically the java ide)
- ```richardwillis.vscode-gradle``` : Gradle tasks UI
- ```vscjava.vscode-java-debug``` : Java debugger 
- ```vscjava.vscode-java-dependency``` : Dependency for the debugger
- ```vscjava.vscode-java-test``` :  Test runner for java in VSCode

such plugins can also be installed singularly, if one is so inclined.

```powershell
code --install-extension naco-siren.gradle-language
code --install-extension ms-vsliveshare.vsliveshare
code --install-extension redhat.java
code --install-extension richardwillis.vscode-gradle
code --install-extension vscjava.vscode-java-debug
code --install-extension vscjava.vscode-java-dependency
code --install-extension vscjava.vscode-java-test
```

In order to see which plugins are installed, one can

```powershell
code --list-extensions
```

### Setup of VSCode variables.

In order to set a sepcific JDK as one in use, we are going to configure the 
```java.home``` setting of VSCode, by

1. Open VSCode settings by ```ctrl+shift+P``` and type ```Preferences: Open User Settings```
2. Type ```java.home``` in the search field
3. Select ```Edit in settings.json```
4. If your VSCode state is pretty new, it could look like
```json
{
    "java.home": "C:\\Program Files\\AdoptOpenJDK\\jdk-14.0.2.12-openj9",
    "editor.suggestSelection": "first",
    "vsintellicode.modify.editor.suggestSelection": "automaticallyOverrodeDefaultValue",
    "telemetry.enableTelemetry": false
}
```
Set your ```java.home``` to the root folder of the the jdk you want to use, like in the example

5. Reset the Java language server workspace by opening the main console ```ctrl+shift+P``` and looking for ```Java: Clean the language server workspace``` and restart VSCode

6. If after restart, a little hand with the tumb up appears on the bottom right of the screen, your env should be set up (sometimes you have to restart again)

7. You can check the state by gogin to the test pane and by running the tests: if the tests from purple block go to green tick mark :heavy_check_mark: or red X :x: , your env is set up.
