# swingnodetest

This little test illustrates an issue with JavaFX Swing Node on macOS. See a corresponding [stackoverflow question](https://stackoverflow.com/questions/59788199/swingnode-shows-blank-window-on-macos-with-jdk-11-0-6-and-other-but-not-with-j).

Run the test via
```
mvn exec:java
```

- Using JDK 11.0.2 on macOS shows a window with a button "Click me!" - as expected.
- Using JDK 11.0.6 on macOS shows an empty windows - not expected.


The issue also exists on

* openjdk version "11.0.6"

  - OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.6+10)

  - OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.6+10, mixed mode)

* java version "13.0.2
"
  - Java(TM) SE Runtime Environment (build 13.0.2+8)

  - Java HotSpot(TM) 64-Bit Server VM (build 13.0.2+8, mixed mode, sharing)