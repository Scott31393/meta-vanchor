SUMMARY = "Calculates magnetic variation/declination for any latitude/longitude/altitude, for any date. Uses the NOAA National Geophysical Data Center, epoch 2015 data."
HOMEPAGE ="https://pypi.org/project/geomag/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.txt;md5=0f2aefede3de73fddd14f5e1c0e94893"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "geomag"
PYPI_SRC_URI = "git://github.com/cmweiss/geomag;protocol=https;branch=master"

SRCREV = "1af9369b80a4d8c304c5dcb9a83d7d2b61bfdb83"

S = "${WORKDIR}/git/geomag"

BBCLASSEXTEND = "native nativesdk"
