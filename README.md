# kotlin-platform
Simple Kotlin Multiplatform Library to Access the Platform Type in a Common Module.

The idea is to allow the code in a Kotlin Multiplatform Project common module to access the runtime platform type (JVM, JS, Android, etc).

## Building

[![](https://jitpack.io/v/chRyNaN/kotlin-platform.svg)](https://jitpack.io/#chRyNaN/kotlin-platform)

Provide the correct library to each module where it is required. For it to be accessible in the Kotlin common code, the `common` library must be in it's dependencies. Then, each platform module (`jvm`, `js`, `android`, etc) must provide the correct library counterpart.

**Kotlin Common:**
```kotlin
implementation 'com.github.chRyNaN.kotlin-platform:common:VERSION'
```

**Kotlin JVM:**
```kotlin
implementation 'com.github.chRyNaN.kotlin-platform:common-jvm:VERSION'
```

**Kotlin JS:**
```kotlin
implementation 'com.github.chRyNaN.kotlin-platform:common:VERSION'
```

**Kotlin Android:**
```kotlin
implementation 'com.github.chRyNaN.kotlin-platform:common:VERSION'
```

## Using the library:

```kotlin
fun performPlatformDependentAction() =
        when(platform){
            Platform.Jvm -> jvmAction()
            Platform.Android -> androidAction()
            Platform.Ios -> iosAction()
            Platform.Js -> jsAction()
        }
```

**Note:** This library does not give you access to platform frameworks in common code.

## Known Caveats

* iOS is not supported yet (depsite there being a Platform type for it).
* The Android module is technically a JVM module and has the possibility of being incorrectly used.
* Currently, the library just provides platform types but eventually could be used to platform specific information.
