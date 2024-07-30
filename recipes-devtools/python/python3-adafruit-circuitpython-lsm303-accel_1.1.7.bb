SUMMARY = "Adafruit CircuitPython module for the LSM303's accelerometer"
HOMEPAGE = "https://github.com/adafruit/Adafruit_CircuitPython_LSM303_Accel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c860f0085c2f5e2718b6bfaedcd8af1"

SRC_URI = "git://github.com/adafruit/Adafruit_CircuitPython_LSM303_Accel.git;branch=main;protocol=https"
SRCREV = "5d9144d404d8deaab8ec3a0e94063437a4036f08"

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