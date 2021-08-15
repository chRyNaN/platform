# kotlin-platform

Simple Kotlin Multi-platform Library to Access the Platform Type in a Common Module.
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/platform">

## Library

The `platform` global property can be accessed to retrieve the current Platform type at runtime:

```kotlin
fun performPlatformDependentAction() =
    when (platform) {
        is Platform.Jvm -> jvmAction()
        is Platform.Android -> androidAction()
        is Platform.Ios -> iosAction()
        is Platform.Js -> nodeJsAction()
    }
```

Each `Platform` instance provides platform specific properties:

```kotlin
androidPlatform.sdkInt
andoridPlatform.versionName
```

## Known Caveats

* Linux is not supported yet (despite there being a Platform type for it).
* Currently, the library just provides platform types but eventually could be used to platform specific information.

## Building

The library is provided through [Repsy.io](https://repsy.io). Checkout
the [releases page](https://github.com/chRyNaN/platform/releases) to get the latest version.
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/platform">

### Repository

```
repositories {
    maven { url = "https://repo.repsy.io/mvn/chrynan/public" }
}
```

## Dependencies

```
implementation "com.chrynan.platform:platform-core:VERSION"
```

## Documentation

More detailed documentation is available in the [docs](docs) folder. The entry point to the documentation can be
found [here](https://github.com/chRyNaN/platform/blob/main/docs/index.md).

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
