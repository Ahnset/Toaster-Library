# Toaster Library

A simple kotlin android library to show toast messages.

## How to install?

Toaster Library is available on Jitpack.
For Gradle users, here are the steps: , replacing `x.x.x` with the latest version:

1. Add Jitpack to your `build.gradle` (Project level)

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

2. Add the dependency to your `build.gradle` (Application level)

```groovy
implementation 'com.github.Ahnset:Toaster-Library:0.10'
```

## How tu use it?

the `s` method from the `ToasterMessage` object is responsible for displaying toast messages, use it as follow:

```kotlin
ToasterMessage.s(context, "this is a simple message!")
```

and that's it !!!