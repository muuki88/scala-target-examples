# Package scalajs and native apps

This project demonstrates two [sbt-native-packager archetypes](http://sbt-native-packager.readthedocs.io/en/latest/introduction.html#archetype-plugins)
that build

- A nodejs application based on scalajs using [scalajs-bundler](https://github.com/scalacenter/scalajs-bundler)
- A native application with [scala-native](https://github.com/scala-native/scala-native)

# Setup

There are three application sub projects

- jvmApp - The app as a jvm application
- nodeApp - The app as a nodejs application
- nativeApp - The app as a native compiled binary

There are also three "shared" projects build with [sbt-crossproject](https://github.com/scala-native/sbt-crossproject).
The code is shared between all three apps.

# Requirements

- Nodejs installed
- Yarn installed
- Follow the scala-native install applications

# Build

Build the apps with

```bash
sbt stage
```

And run them with

```bash
# jvm app
./jvm-app/target/universal/stage/bin/jvm-app

# node app - requires nodejs
node ./node-app/target/universal/stage/node-app-opt-bundle.js

# native binary
./native-app/target/universal/stage/native-app
```