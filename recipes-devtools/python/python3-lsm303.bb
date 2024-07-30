SUMMARY = "Python library for the LSM303D I2C accelerometer/magnetometer"
HOMEPAGE ="https://pypi.org/project/lsm303-python/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c70f5928dad7fdc59392fcf86c21f47a"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "lsm303-python"
PYPI_SRC_URI = "git://github.com/jackw01/lsm303-python.git;protocol=https;branch=master"

SRCREV = "c50ecd112933daee9631541ac8fb73adfdf9073c"

RDEPENDS:${PN} += " python3-smbus"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"
