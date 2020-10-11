# Java development installation with visual studio code

I am writing this, because I wanted to use visual studio code
to run tests and java apps for a kata I am preparing (is going to be remote)
and turns out thet I did a lot of troubleshooting

In order to have a working java development environment in VSCode, 
I installed the "[Java Extension pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)", from console 

```powershell
code --install-extension vscjava.vscode-java-pack
```

which contains the debugger, the editor, autocompletion, an test runner for VS code

I also installed the following gradle packages

```powershell
code --install-extension richardwillis.vscode-gradle
code --install-extension naco-siren.gradle-language
```

## The error

I was getting the bytecode mismatch version error, but someone can have something different.


### The problem

Turns out that my environment, wich has many jdks and jres installed, was a bit scattered
and not at all well configured. For me it works when

1. the java installation I wanted to use was in the ```path``` (let's call it ```C:\JDK14```) BUT was in the wrong order: in my case,  ```C:\JDK11``` had priority in the path order over my target installation. I put _the one I wanted as first in the path_
2. the ```JAVA_HOME``` variable, for my user, was pointing in the wrong place, in my case on a old JDK8 installation: _```JAVA_HOME``` has to point to the same ```C:\JDK14```_
3. the key ```java.home``` in my ```settings.json``` was point to yet another installation. This paramter has to point to ```C:\JDK14```, which is the jdk i wanted to use

These three elements need to point to the same folder, so that the different jdks running do not compile for different versions.

As last step one needs to ```ctrl+shift+P``` and "Java: Clean the Java language server workspace"

And then of course restart VSCode