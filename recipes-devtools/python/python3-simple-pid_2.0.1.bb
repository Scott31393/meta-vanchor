SUMMARY = "A simple and easy to use PID controller in Python. If you want a PID controller without external dependencies that just works, this is for you! The PID was designed to be robust with help from Brett Beauregards guide."
HOMEPAGE ="https://pypi.org/project/simple-pid/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=1a7fa6f25cbb557260d9fe1b40fe08c2"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "simple-pid"
PYPI_SRC_URI = "git://github.com/m-lundberg/simple-pid;protocol=https;branch=master"

SRCREV = "6e6f4b000cdf7830635674cb89a6e823f5025784"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"
