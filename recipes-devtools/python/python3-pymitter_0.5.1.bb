SUMMARY = "Python port of the extended Node.js EventEmitter 2 approach providing namespaces, wildcards and TTL."
HOMEPAGE ="https://pypi.org/project/pymitter/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5cdcb5c83a2a37cb933f306cbbe55ae0"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "pymitter"
SRC_URI[sha256sum] = "6344e9728f0281672b79181ed8950dac07d3ab7169458b692f07756b87281f2d"

BBCLASSEXTEND = "native nativesdk"