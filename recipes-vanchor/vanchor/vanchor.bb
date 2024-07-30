SUMMARY = "Controlling speed and direction of an electrical trolling motor"
HOMEPAGE = "https://github.com/Scott31393/Vanchor"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2638c61be2fe43fcaea1170179375be8"

SRC_URI = "git://github.com/Scott31393/Vanchor.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"

inherit systemd

S = "${WORKDIR}/git"

DEPENDS += "python3 python3-setuptools-scm-native"

RDEPENDS:${PN} += " \
    python3 \
    i2c-tools \
    kernel-modules \
    python3 \
    python3-flask \
    python3-smbus \
    python3-pyproj \
    python3-pip \
    python3-pyyaml \
    python3-numpy \
    python3-geomag \
    python3-pymitter \
    python3-simple-pid \
    python3-pyserial \
    python3-pyproj \
    python3-pynmea2 \
    python3-requests \
    python3-urllib3 \
    python3-chardet \
    python3-charset-normalizer \
    python3-idna \
    proj \
    python3-werkzeug \
    python3-markupsafe \
    python3-click \
    python3-blinker \
    python3-jinja2 \
    python3-itsdangerous \
    gpsd \
    dhcpcd \
    dnsmasq \
    kea \
    python3-adafruit-circuitpython-lsm303-accel \
    python3-adafruit-circuitpython-lsm303dlh-mag \
    python3-adafruit-circuitpython-busdevice \
    python3-adafruit-circuitpython-register \
    python3-core \
    hostapd \
    openssh \
    iw \
    python3-adafruit-platformdetect \
    python3-smbus2 \
    python3-smbus \
    python3-lsm303 \
    wpa-supplicant \
"

do_install() {
    mkdir -p ${D}${bindir}/vanchor
    cp -r ${WORKDIR}/git/src/* ${D}${bindir}/vanchor
}