SUMMARY = "Python library for the NMEA 0183 protcol"
HOMEPAGE ="https://pypi.org/project/pynmea2/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb5e173bc54080cb25079199959ba6b6"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "pynmea2"
PYPI_SRC_URI = "git://github.com/Knio/pynmea2;protocol=https;branch=master"

SRCREV = "f298742f27922780f311ccd22fc28ac93ab0a90f"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"
