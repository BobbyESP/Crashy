# Crashy

## Quick setup
### 1. Add the library
You first have to add the library to your Android project. For this you have to add `Jitpack` to your repositories
- In the `build.gradle.kts` at project level
```kotlin
allprojects {
    repositories {
        maven("https://jitpack.io")
    }
}
```
- In the `build.gradle.kts` at module/app level

```kotlin
dependencies {
    // ...
    implementation("com.github.BobbyESP:Crashy:<version>")
}
```

### 2. Setup the crash handler
First, for being able to catch any non-caught exceptions you will have to create a class extending the `Application` class from Android

For this create, for example in the root folder of your app module source a class called `App`:

```kotlin
class App: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
```

And now that you have the file like that, just leaves calling the `setupCrashHandler()` function in the `onCreate()` function

```kotlin
class App: Application() {
    override fun onCreate() {
        super.onCreate()

        setupCrashHandler()
    }
}
```

### 3. Adding the needed to the app manifest
The only changes that you have to do in your manifest for the library to work are:

```xml
<application
    android:name=".App">
    <!-- The rest of your code -->
    <activity
        android:name="com.bobbyesp.crashhandler.CrashHandlerActivity"
        android:label="CrashHandlerActivity"
        android:launchMode="singleTask"
        android:theme="@style/Theme.<Your app theme>" />
</application>
```

And done!