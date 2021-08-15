package com.chrynan.platform

import platform.UIKit.UIDevice

actual val platform: Platform = IosPlatform()

class IosPlatform : Platform.Ios() {

    override val operatingSystemFamily =
        OperatingSystemFamily.getByTypeName(name = kotlin.native.Platform.osFamily.name)

    override val systemName
        get() = UIDevice.currentDevice.systemName

    override val systemVersion
        get() = UIDevice.currentDevice.systemVersion

    override val nativePlatform
        get() = NativePlatform(
            cpuArchitecture = CpuArchitecture.getByTypeName(name = kotlin.native.Platform.cpuArchitecture.name),
            memoryModel = MemoryModel.getByTypeName(name = kotlin.native.Platform.memoryModel.name),
            canAccessUnaligned = kotlin.native.Platform.canAccessUnaligned,
            isLittleEndian = kotlin.native.Platform.isLittleEndian,
            isDebugBinary = kotlin.native.Platform.isDebugBinary,
            isMemoryLeakCheckerActive = kotlin.native.Platform.isMemoryLeakCheckerActive,
            isCleanersLeakCheckerActive = kotlin.native.Platform.isCleanersLeakCheckerActive
        )
}
