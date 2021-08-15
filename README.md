# kotlin-platform

Simple Kotlin Multi-platform Library to Access the Platform Type in a Common Module.

The idea is to allow the code in a Kotlin Multi-platform Project Common Module to have access to the runtime platform
type (JVM, JS, Android, etc).

## Building

[![](https://jitpack.io/v/chRyNaN/kotlin-platform.svg)](https://jitpack.io/#chRyNaN/kotlin-platform)

This is a Kotlin Multi-platform Library using the new multi-platform structure. For more information view
the [Kotlin Documentation](https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html#setting-up-a-multiplatform-project)
.

This library is currently provided through [JitPack](https://jitpack.io/#chRyNaN/kotlin-platform). **Note:** There is
some issues with the new Kotlin Multi-platform project structure and JitPack so the dependencies may not resolve
correctly.

```kotlin
implementation 'com.github.chRyNaN.kotlin-platform:VERSION'
```

## Using the library:

The `platform` global property can be accessed to retrieve the current Platform type at runtime:

```kotlin
fun performPlatformDependentAction() =
    when (platform) {
        Platform.Jvm -> jvmAction()
        Platform.Android -> androidAction()
        Platform.Ios -> iosAction()
        Platform.NodeJs -> nodeJsAction()
        Platform.WebJs -> webJsAction()
        Platform.Mac -> macAction()
        Platform.Windows -> windowsAction()
        Platform.Linux -> linuxAction()
        Platform.WebAssembly -> webAssemblyAction()
    }
```

**Note:** This library does not give you access to platform frameworks in common code.

## Known Caveats

* Linux is not supported yet (despite there being a Platform type for it).
* Currently, the library just provides platform types but eventually could be used to platform specific information.

## License

```
Copyright 2021 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
