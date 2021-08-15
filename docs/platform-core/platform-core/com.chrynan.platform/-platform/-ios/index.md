//[platform-core](../../../../index.md)/[com.chrynan.platform](../../index.md)/[Platform](../index.md)/[Ios](index.md)

# Ios

[common]\
abstract class [Ios](index.md) : [Platform](../index.md)

## Types

| Name | Summary |
|---|---|
| [CpuArchitecture](-cpu-architecture/index.md) | [common]<br>enum [CpuArchitecture](-cpu-architecture/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Platform.Ios.CpuArchitecture](-cpu-architecture/index.md)> |
| [MemoryModel](-memory-model/index.md) | [common]<br>enum [MemoryModel](-memory-model/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Platform.Ios.MemoryModel](-memory-model/index.md)> |
| [NativePlatform](-native-platform/index.md) | [common]<br>data class [NativePlatform](-native-platform/index.md)(**cpuArchitecture**: [Platform.Ios.CpuArchitecture](-cpu-architecture/index.md), **memoryModel**: [Platform.Ios.MemoryModel](-memory-model/index.md), **canAccessUnaligned**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **isLittleEndian**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **isDebugBinary**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **isMemoryLeakCheckerActive**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **isCleanersLeakCheckerActive**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [name](name.md) | [common]<br>open override val [name](name.md): [PlatformName](../../-platform-name/index.md) |
| [nativePlatform](native-platform.md) | [common]<br>abstract val [nativePlatform](native-platform.md): [Platform.Ios.NativePlatform](-native-platform/index.md) |
| [operatingSystemFamily](operating-system-family.md) | [common]<br>abstract override val [operatingSystemFamily](operating-system-family.md): [OperatingSystemFamily](../../-operating-system-family/index.md) |
| [systemName](system-name.md) | [common]<br>abstract val [systemName](system-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [systemVersion](system-version.md) | [common]<br>abstract val [systemVersion](system-version.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Inheritors

| Name |
|---|
| [IosPlatform](../../-ios-platform/index.md) |
