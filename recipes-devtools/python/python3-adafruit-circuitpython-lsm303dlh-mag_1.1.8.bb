SUMMARY = "Adafruit CircuitPython module for the LSM303DLH's 3-axis magnetometer"
HOMEPAGE = "https://github.com/adafruit/Adafruit_CircuitPython_LSM303DLH_Mag"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c860f0085c2f5e2718b6bfaedcd8af1"

SRC_URI = "git://github.com/adafruit/Adafruit_CircuitPython_LSM303DLH_Mag.git;branch=main;protocol=https"
SRCREV = "ddcd47ce2af045f7cf0bf81f7db1d6c3e8c408df"

S = "${WORKDIR}/git"

inherit setuptools3

DEPENDS += "python3-setuptools-scm-native"

RDEPENDS:${PN} += " \
    python3-adafruit-blinka \
    python3-adafruit-circuitpython-busdevice \
    python3-adafruit-circuitpython-register \
    python3-core \
"
COMPATIBLE_HOST:libc-musl:class-target = "null"